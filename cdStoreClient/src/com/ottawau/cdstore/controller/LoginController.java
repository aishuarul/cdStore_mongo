package com.ottawau.cdstore.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;
import com.ottawau.cdstore.jasonentity.Member;
import com.ottawau.cdstore.rest.MemberManager;
import com.ottawau.cdstore.viewModel.Cd;
import com.ottawau.cdstore.viewModel.Response;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String method = request.getParameter("method").toString();
		if(method.equals("login")){
			memberLogin(request, response);
		}
	}

	private void memberLogin(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		PrintWriter out = null;
    	response.setContentType("application/json");
		response.setHeader("Cache-Control", "nocache");
    	response.setCharacterEncoding("utf-8");
    	out = response.getWriter();
    	
		Member member = new Member();
		member.setUsername(request.getParameter("username"));
		member.setPassword(request.getParameter("password"));
		HttpSession session = request.getSession();
		boolean ret= new MemberManager().isLoginSuccess( member ); 
			if (session.getAttribute("member") == null) {
	            session.setAttribute("member", new Member());
	            new Response().sendSuccess(response);
	        	
	        }
			else{
				new Response().sendError(response);
			}
		
		out.flush();
	}
}
