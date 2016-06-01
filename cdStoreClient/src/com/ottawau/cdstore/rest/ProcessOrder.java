package com.ottawau.cdstore.rest;


import javax.ws.rs.core.MediaType;

import org.codehaus.jettison.json.JSONException;

import com.ottawau.cdstore.jasonentity.ProcessOrderJason;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.json.JSONConfiguration;


 
/**
 * @author Aishvarya Arul Nambi
 * 
 */
 
public class ProcessOrder extends GeneralRestClientManager {
	public String submitProcessOrder(ProcessOrderJason poDAO) throws JSONException{
		ClientConfig clientConfig = new DefaultClientConfig();
		clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);
		Client client = Client.create(clientConfig);
		WebResource webResource = client.resource("http://localhost:8080/cdStoreOPWS/POService/ProcessOrder/saveNewMongoPo");
		ClientResponse response = webResource.accept(MediaType.APPLICATION_JSON).type(MediaType.APPLICATION_JSON).post(ClientResponse.class, poDAO);
		String output = response.getEntity(String.class);
		return output;
	  }
	}
