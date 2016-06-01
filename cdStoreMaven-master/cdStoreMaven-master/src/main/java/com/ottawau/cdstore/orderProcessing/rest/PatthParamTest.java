package com.ottawau.cdstore.orderProcessing.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.ottawau.cdstore.orderProcessing.session.AddressManager;
import com.ottawau.cdstore.orderProcessing.session.AddressManagerImpl;
 
@Path("/users")
public class PatthParamTest {
 
	@GET
	@Path("/first/{id}")
	public Response getUserById(@PathParam("id") String id) {
 
	   return Response.status(200).entity("getUserById is called, id : " + id).build();
 
	}
	

}
