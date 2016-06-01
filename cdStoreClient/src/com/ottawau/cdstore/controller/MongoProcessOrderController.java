package com.ottawau.cdstore.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import com.ottawau.cdstore.jasonentity.ProcessOrderJason;
import com.ottawau.cdstore.rest.ProcessOrder;
import com.ottawau.cdstore.viewModel.MongoCd;

/**
 * Servlet implementation class MongoProcessOrderController
 */
@WebServlet("/MongoProcessOrderController")
public class MongoProcessOrderController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MongoProcessOrderController() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		Map<Integer, Integer> cdList = new HashMap();

		// Retrieve the cd ids from the session
		HttpSession session;
		session = req.getSession();
		Map<MongoCd, Integer> cart = null;
		Iterator it = null;

		if (session.getAttribute("cart") != null) {
			cart = (Map<MongoCd, Integer>) session.getAttribute("cart");
			it = cart.entrySet().iterator();
			while (it.hasNext()) {
				Map.Entry pairs = (Map.Entry) it.next();
				MongoCd cd = (MongoCd) pairs.getKey();
				cd.quantity = (int) pairs.getValue();
				cdList.put(cd._id, cd.quantity);
			}
		}
		
		//Creating the Jason object to be sent in request
		ProcessOrderJason poDao = new ProcessOrderJason(
				req.getParameter("InputFirstName"),
				req.getParameter("InputLastName"),
				req.getParameter("InputZip"), req.getParameter("InputCountry"),
				req.getParameter("InputEmail"), req.getParameter("mobile"),
				req.getParameter("InputAddress"),
				req.getParameter("InputCity"), req.getParameter("InputState"),
				req.getParameter("InputCCNumber"),
				req.getParameter("CCUsername"),
				req.getParameter("InputCCEXPDate"),
				req.getParameter("InputCCEXPYr"), cdList);

		// Call the rest service from controller
		ProcessOrder po = new ProcessOrder();
		String sendToUrl = null;
		try {
			// Send the process oder to the rest service
			String opResponse = po.submitProcessOrder(poDao);
			System.out.println("Strin op returned =" + opResponse);
			JSONObject jsonResp = new JSONObject(opResponse);
			System.out.println("Strin status returned =" + jsonResp.get("Status"));
			String status = (String) jsonResp.get("Status");
			if (status.equals("sucess")){
				// clean up the session as the order has been successfully processes
				session.invalidate();
				sendToUrl="/POSucess.jsp";
			}
			else
				sendToUrl="/POFail.jsp";
		} catch (JSONException e) {
			System.out.println("There was an error when processing your PO");
			e.printStackTrace();
		}
		resp.sendRedirect(req.getContextPath() + sendToUrl);
	}

}
