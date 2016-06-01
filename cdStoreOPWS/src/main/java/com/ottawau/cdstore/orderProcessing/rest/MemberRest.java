package com.ottawau.cdstore.orderProcessing.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import com.ottawau.cdstore.orderProcessing.DAO.MemberDAOImpl;
import com.ottawau.cdstore.orderProcessing.entity.Member;

@Path("/Member")
public class MemberRest {
	@POST
	@Path("/isLoginSuccess")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response isLoginSuccess(Member member) throws JSONException {
		
		String responseText = null;
		String responseStatus = null;
		
		MemberDAOImpl obj = new MemberDAOImpl();
		int id = obj.isLoginSuccess(member.getUsername() , member.getPassword());
		JSONObject responseObj = new JSONObject();
		if(id == 0){
			System.out.println("Member not Found");
			responseObj.put("Status", "false");
			responseObj.put("Response", "0");
		}
		else
		{	
			
			responseObj.put("Status", "true");
			responseObj.put("Response", id);
			
		}
		return Response.status(201).entity(responseObj).build();
	}
	
		
	@POST
	@Path("/registerUser")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response registerUser(Member member) throws JSONException {
		
		
		JSONObject responseObj = new JSONObject();
		responseObj.put("Status", "true");
		responseObj.put("Response", 1);
		
		return Response.status(201).entity(responseObj).build();
	}
}
