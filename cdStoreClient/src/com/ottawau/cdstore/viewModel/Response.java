package com.ottawau.cdstore.viewModel;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

public class Response {
	public String result;
	public Error error;
	
	public Response(){}
	public Response(String result, Error error) {
		this.result = result;
		this.error = error;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public Error getError() {
		return error;
	}
	public void setError(Error error) {
		this.error = error;
	}
	public void sendSuccess(HttpServletResponse response) throws IOException {
		Response responseObj;
		PrintWriter out = null;
    	response.setContentType("application/json");
		response.setHeader("Cache-Control", "nocache");
    	response.setCharacterEncoding("utf-8");
    	out = response.getWriter();
    	responseObj = new Response("true", null);
		out.print(new Gson().toJson(responseObj).replace("\"true\"", "true"));
	}
	public void sendError(HttpServletResponse response) throws IOException {
		Response responseObj;
		PrintWriter out = null;
    	response.setContentType("application/json");
		response.setHeader("Cache-Control", "nocache");
    	response.setCharacterEncoding("utf-8");
    	out = response.getWriter();
    	responseObj = new Response("true", null);
		out.print(new Gson().toJson(responseObj).replace("\"false\"", "false"));
	}
	
	
}
