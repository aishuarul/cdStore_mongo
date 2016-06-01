package com.ottawau.cdstore.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;
import com.ottawau.cdstore.rest.CdManager;
import com.ottawau.cdstore.rest.MongoCdManager;
import com.ottawau.cdstore.viewModel.Cart;
import com.ottawau.cdstore.viewModel.Cd;
import com.ottawau.cdstore.viewModel.MongoCart;
import com.ottawau.cdstore.viewModel.MongoCd;
import com.ottawau.cdstore.viewModel.Response;

/**
 * Servlet implementation class MongoShopCart
 */
@WebServlet("/MongoShopCart")
public class MongoShopCart extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	final Map<Integer, String> products = new HashMap<>();
	final Map<Integer, MongoCd> cds = new HashMap<>();

    @Override
    public void init() throws ServletException {
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Response res;
    	String method = request.getParameter("method").toString();
       
        if(method.equals("add")){
			if(isInteger(request.getParameter("id").toString())){
				this.addToCart(request,response);
			}
			
		}
        else if(method.toString().equals("get")){
				this.getCart(request,response);
		}
        
        else if(method.toString().equals("delete")){
			this.deleteAnItem(request,response);
        }
		//return res;
    }

    private void deleteAnItem(HttpServletRequest request,
			HttpServletResponse response) throws IOException, ServletException {
		// Deletes an item in the cart
    	Integer productId = Integer.parseInt(request.getParameter("id"));
    	HttpSession session = request.getSession();
    	Map<MongoCd, Integer> cart = (Map<MongoCd, Integer>) session.getAttribute("cart");
    	if(cart.containsKey(cds.get(productId))){
    		cart.remove(cds.get(productId));
    		cds.remove(productId);
    		System.out.println("\nCartKey\n"+new Gson().toJson(cds.get(productId)));
    		System.out.println("\nCartDelete\n"+new Gson().toJson(cart));
    		System.out.println("\nCdsDelete\n"+new Gson().toJson(cds));
    		arrangeCart(request, response);
    	}
    	
    	
    	new Response().sendSuccess(response);
		
	}

	private void empty(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getSession().removeAttribute("cart");
       // browse(req, resp);
    }

    @SuppressWarnings("unchecked")
    private void viewCart(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Map<String, Integer> cart = (Map<String, Integer>) req.getSession().getAttribute("cart");
        req.setAttribute("cart", cart);
        
        //req.getRequestDispatcher("/WEB-INF/jsp/view/viewCart.jsp")
          //      .forward(req, resp);
    }

    @SuppressWarnings("unchecked")
    private void addToCart(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
    	PrintWriter out = null;
    	response.setContentType("application/json");
		response.setHeader("Cache-Control", "nocache");
    	response.setCharacterEncoding("utf-8");
    	out = response.getWriter();
    	Integer productId = Integer.parseInt(req.getParameter("id"));

        HttpSession session = req.getSession();
        if (session.getAttribute("cart") == null) {
            session.setAttribute("cart", new HashMap<MongoCd, Integer>());
        }

        Map<MongoCd, Integer> cart = (Map<MongoCd, Integer>) session.getAttribute("cart");
        MongoCd cd = new MongoCdManager().getById(productId.toString());
        System.out.println(new MongoCdManager().getById(productId.toString()));
        System.out.println("\ncd.id="+cd._id+"\nbefore cart"+"\ncds:"+cds+"\ncart"+cart);
        if (cart.containsKey(cds.get(productId))) {
            cart.put(cds.get(productId), cart.get(cds.get(productId)) + 1);
            new Response().sendSuccess(response);
        } else{
        	cart.put(cd, 1);
        	System.out.println("\n cart " + new Gson().toJson(cart)+"\n");
        	cds.put(cd._id, cd);
        	new Response().sendSuccess(response);
        }
      //  session.setAttribute("cart",cart);
    }

    private void getCart(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
    	arrangeCart(req, response);
    	PrintWriter out = null;
    	HttpSession session;
    	String temp = "";
    	response.setContentType("application/json");
		response.setHeader("Cache-Control", "nocache");
    	response.setCharacterEncoding("utf-8");
    	out = response.getWriter();
    	session = req.getSession();
    	Response responseObj;
    	Map<MongoCd, Integer> cart = null;
    	Iterator it = null;
    	MongoCart viewCart = new MongoCart();
    	
    	if(session.getAttribute("cart") == null){
			responseObj = new Response("false", null);
			out.print(new Gson().toJson(responseObj).replace("\"false\"", "false"));
		}
    	else{
    		cart = (Map<MongoCd, Integer>) session.getAttribute("cart");
        	it = cart.entrySet().iterator();
			while (it.hasNext()) {
	        	Map.Entry pairs = (Map.Entry)it.next();
	            //temp +=pairs.getKey() + " = " + pairs.getValue();
	        	MongoCd cd = (MongoCd) pairs.getKey();
	            cd.quantity = (int) pairs.getValue();
	            viewCart.cds.add(cd);
	            System.out.println(Thread.currentThread().getStackTrace()[2].getLineNumber()+" "+pairs.getKey() + " = " + pairs.getValue()+" CD "+cd.title);
	            //System.out.println("\n cart " + new Gson().toJson(cart)+"\nCds\n"+new Gson().toJson(cds) );
	          //  it.remove(); // avoids a ConcurrentModificationException
	        }
			for(MongoCd tempCd : viewCart.cds){
				tempCd.subTotal = (tempCd.price * tempCd.quantity);
				viewCart.total += tempCd.subTotal;
			}
			//responseObj = new Response(new Gson().toJson(viewCart), null);
            out.print(new Gson().toJson(viewCart));
	        
		}
		out.flush();
    }
    private void arrangeCart(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
    	HttpSession session;
    	String temp = "";
    	session = req.getSession();
    	Map<MongoCd, Integer> cart = null;
    	Iterator it = null;
    	MongoCart viewCart = new MongoCart();
    	
    	if(session.getAttribute("cart") != null){
    		cart = (Map<MongoCd, Integer>) session.getAttribute("cart");
        	it = cart.entrySet().iterator();
			while (it.hasNext()) {
	        	Map.Entry pairs = (Map.Entry)it.next();
	            //temp +=pairs.getKey() + " = " + pairs.getValue();
	        	MongoCd cd = (MongoCd) pairs.getKey(); 
	            cd.quantity = (int) pairs.getValue();
	            viewCart.cds.add(cd);
	            //System.out.println(pairs.getKey() + " = " + pairs.getValue()+" CD "+cd.title);
	            System.out.println("\n cart " + new Gson().toJson(cart)+"\nCds\n"+new Gson().toJson(cds) );
	          //  it.remove(); // avoids a ConcurrentModificationException
	        }
			for(MongoCd tempCd : viewCart.cds){
				tempCd.subTotal = (tempCd.price * tempCd.quantity);
				viewCart.total += tempCd.subTotal;
			}
		}
    }
    public boolean isInteger( String input )  
	{  
	   try  
	   {  
	      Integer.parseInt( input );  
	      return true;  
	   }  
	   catch( Exception e )  
	   {  
	      return false;  
	   }  
	}  
    

}
