package com.ottawau.cdstore.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;
import com.ottawau.cdstore.dao.CartManager;
import com.ottawau.cdstore.viewModel.Cart;
import com.ottawau.cdstore.viewModel.Cd;
import com.ottawau.cdstore.viewModel.Response;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

/**
 * Servlet implementation class CartController
 */
@WebServlet("/CartController")
public class CartController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String SHOPPING_CART_BEAN_SESION_KEY = "shoppingCart";

    /**
     * @see HttpServlet#HttpServlet()
     */
    public CartController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		boolean result;
		
		if(request.getParameter("method").toString().equals("add")){
			if(isInteger(request.getParameter("id").toString())){
				result = this.addCart(Integer.parseInt(request.getParameter("id").toString()),request);
			}
			
		}
		if(request.getParameter("method").toString().equals("get")){
				 this.getCart(request,response);
		}
		
		
	}
	
	private void getCart(HttpServletRequest request, HttpServletResponse response )throws ServletException, IOException {
		Response resObj;
		response.setContentType("application/json");
		response.setHeader("Cache-Control", "nocache");
    	response.setCharacterEncoding("utf-8");
		// Get the printwriter object from response to write the required json object to the output stream      
		
    	PrintWriter out = null;
		out = response.getWriter();
		// Assuming your json object is **jsonObject**, perform the following, it will return your json object  
		HttpSession session = request.getSession();
		session = request.getSession();
		if(session.getAttribute("cart") != null)
			out.print(new Gson().toJson(new CartManager().processCart((Cart)session.getAttribute("cart"))));
		out.flush();
	}

	private boolean addCart(int parseInt,HttpServletRequest request) {
		final String BASE_URI="http://localhost:8080/CDOrderProcessing";
		String PATH_NAME = "/CatalogService/CdService/getById/";
		ClientConfig config = new DefaultClientConfig();
		Client client = Client.create(config);
		WebResource resource = client.resource(BASE_URI);
		WebResource nameResource = resource.path(PATH_NAME+parseInt);
		System.out.println("Client Response \n"+ getClientResponse(nameResource));
		System.out.println("Response \n" + getResponse(nameResource) + "\n\n");
		
		Cd cd = new Cd();
		Gson gson = new Gson();
		cd =  (Cd)gson.fromJson(getResponse(nameResource), Cd.class);
		//CartManager cartMan = new CartManager();
		CartManager.cart.cds.add(cd);
		//String result =  getResponse(nameResource);
		//System.out.println(result);
		HttpSession session = request.getSession(false);
		session = request.getSession();
		if(session.getAttribute("cart") != null){
			String temp = session.getAttribute("cart").toString();
			System.out.println("tempBefore" + temp);
			temp = session.getAttribute("cart").toString();
			//temp += result;
			session.setAttribute("cart", CartManager.cart);
		}
		else{
			session.setAttribute("cart", CartManager.cart);
		}
		
		
		
		//session.setAttribute("cart", cart);
	//	session.setAttribute("cart", je);
		return false;
	}
	private static String getClientResponse(WebResource resource) {
		return resource.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class).toString();
	}
	
	private static String getResponse(WebResource resource) {
		return resource.accept(MediaType.APPLICATION_JSON).get(String.class);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
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
