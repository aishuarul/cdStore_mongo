package com.ottawau.cdstore.orderProcessing.rest;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;




import com.ottawau.cdstore.orderProcessing.entity.Address;
import com.ottawau.cdstore.orderProcessing.entity.PurchaseOrder;
import com.ottawau.cdstore.orderProcessing.session.AddressManager;
import com.ottawau.cdstore.orderProcessing.session.AddressManagerImpl;
import com.ottawau.cdstore.orderProcessing.session.PurchaseOrderManager;
import com.ottawau.cdstore.orderProcessing.session.PurchaseOrderManagerImpl;
 
@Path("/testConnection")
public class TestConnection {
	

 
	
	@GET
	@Path("/saveNewPoJason/{i}")
	@Produces(MediaType.APPLICATION_JSON)
	 public String consumeJSON(@PathParam("i") String firstName) {
		String name = firstName;
		System.out.println("name =" + name);
		AddressManager adManager = new AddressManagerImpl();
		Address ad = new Address("street", "province", "country", "zip", "phone");
		adManager.saveNewAddress(ad);
		
		System.out.println("new address id ="+ ad.getAddress_id());
		
		
		
		/*
		 * poManager.saveNewPurchaseOrder(po);
		StringBuffer sb = new StringBuffer(); 
		sb.append(" First Name :").append(name).append(" Last Name : Alder ").append(" ordered : orderStatus");
		
		 */
		
		
		return "Address Saved id =" + ad.getAddress_id();
		//return Response.status(200).entity(sb).build();

	 }

	@GET
	@Path("/first/{id}")
	public Response getUserById(@PathParam("id") String id) {
 
	   return Response.status(200).entity("getUserById is called, id : " + id).build();
 
	}
	
	
}
