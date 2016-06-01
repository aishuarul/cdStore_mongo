package com.ottawau.cdstore.orderProcessing.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import com.ottawau.cdstore.orderProcessing.MongoDAO.AddressMongoDAOImpl;
import com.ottawau.cdstore.orderProcessing.MongoDAO.PurchaseOrderMongoDAOImpl;
import com.ottawau.cdstore.orderProcessing.entity.Address;
import com.ottawau.cdstore.orderProcessing.entity.MongoAddress;
import com.ottawau.cdstore.orderProcessing.entity.MongoPurchaseOrder;
import com.ottawau.cdstore.orderProcessing.entity.PurchaseOrder;
import com.ottawau.cdstore.orderProcessing.jasonentity.ProcessOrderJason;
import com.ottawau.cdstore.orderProcessing.session.AddressManager;
import com.ottawau.cdstore.orderProcessing.session.AddressManagerImpl;
import com.ottawau.cdstore.orderProcessing.session.PurchaseOrderManager;
import com.ottawau.cdstore.orderProcessing.session.PurchaseOrderManagerImpl;

@Path("/ProcessOrder")
public class ProcessPurchaseOrder {
	private static int counter = 0;
	@POST
	@Path("/saveNewPo")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response saveNewPO(ProcessOrderJason poJson) throws JSONException {
		counter = counter + 1;
		String responseText = null;
		String responseStatus = null;
		// TO-DO Implement logic for processing credit-card payment here
		boolean creditCardSucessfullyCharged = true;
		// Fail every 5th order
		if((counter%5)==0){
			creditCardSucessfullyCharged = false;
			counter = 0;
		}
		// Insert the address
		AddressManager adManager = new AddressManagerImpl();
		Address ad = new Address(poJson.getInputAddress(), poJson.getInputState(), poJson.getInputCountry(), poJson.getInputZip(), "613-111-1234");
		adManager.saveNewAddress(ad);
		
		ad.getAddress_id();
		if (creditCardSucessfullyCharged) {
			//Enter Process Order info in cd store tables.
			PurchaseOrderManager poManager = new PurchaseOrderManagerImpl();
			PurchaseOrder po = new PurchaseOrder(poJson.getInputFirstName(), poJson.getInputLastName(), "ORDERED", ad.getAddress_id());
			poManager.saveNewPurchaseOrder(po);
			
			responseStatus = "sucess";
			responseText = "Your Order Has been sucessfully processed =" + counter;
		} else{
			PurchaseOrder po = new PurchaseOrder(poJson.getInputFirstName(), poJson.getInputLastName(), "DENIED", ad.getAddress_id());
			PurchaseOrderManager poManager = new PurchaseOrderManagerImpl();
			poManager.saveNewPurchaseOrder(po);
			responseStatus = "failed";
			responseText = "There was some internal issue when your order was processed. Your Credit Card has not been charged. Please Contact support =" + counter;
		}
		
		
		JSONObject responseObj = new JSONObject();
		responseObj.put("Status", responseStatus);
		responseObj.put("Response", responseText);
		return Response.status(201).entity(responseObj).build();
	}
	
	@POST
	@Path("/saveNewMongoPo")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response saveNewMongoPO(ProcessOrderJason poJson) throws Exception {
		counter = counter + 1;
		String responseText = null;
		String responseStatus = null;
		// TO-DO Implement logic for processing credit-card payment here
		boolean creditCardSucessfullyCharged = true;
		// Fail every 5th order
		if((counter%5)==0){
			creditCardSucessfullyCharged = false;
			counter = 0;
		}
		// Insert the address
		AddressManager adManager = new AddressManagerImpl();
		MongoAddress ad = new MongoAddress(poJson.getInputAddress(), poJson.getInputState(), poJson.getInputCountry(), poJson.getInputZip(), "613-111-1234");
		new AddressMongoDAOImpl("Address").save(ad);
		
		ad.get_id();
		if (creditCardSucessfullyCharged) {
			//Enter Process Order info in cd store tables.
			MongoPurchaseOrder po = new MongoPurchaseOrder(poJson.getInputFirstName(), poJson.getInputLastName(), "ORDERED", ad.get_id());
			new PurchaseOrderMongoDAOImpl("PurchaseOrder").save(po);
			
			responseStatus = "sucess";
			responseText = "Your Order Has been sucessfully processed =" + counter;
		} else{
			MongoPurchaseOrder po = new MongoPurchaseOrder(poJson.getInputFirstName(), poJson.getInputLastName(), "DENIED", ad.get_id());
			PurchaseOrderManager poManager = new PurchaseOrderManagerImpl();
			new PurchaseOrderMongoDAOImpl("PurchaseOrder").save(po);
			responseStatus = "failed";
			responseText = "There was some internal issue when your order was processed. Your Credit Card has not been charged. Please Contact support =" + counter;
		}
		
		
		JSONObject responseObj = new JSONObject();
		responseObj.put("Status", responseStatus);
		responseObj.put("Response", responseText);
		return Response.status(201).entity(responseObj).build();
	}

}