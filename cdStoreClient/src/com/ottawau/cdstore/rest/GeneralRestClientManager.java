package com.ottawau.cdstore.rest;

import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

public class GeneralRestClientManager {
	static {
	    //for localhost testing only
	    javax.net.ssl.HttpsURLConnection.setDefaultHostnameVerifier(
	    new javax.net.ssl.HostnameVerifier(){
 
	        public boolean verify(String hostname,
	                javax.net.ssl.SSLSession sslSession) {
	            if (hostname.equals("localhost")) {
	                return true;
	            }
	            return false;
	        }
	    });
	}
	//Base Url 
	final String BASE_URI="http://localhost:8080/CDOrderProcessing/CatalogService";
	//General method to get resource
	public String getResource(String path){
		ClientConfig config = new DefaultClientConfig();
		Client client = Client.create(config);
		WebResource resource = client.resource(BASE_URI);
		WebResource nameResource = resource.path(path);
		System.out.println("Client Response \n"+ getClientResponse(nameResource));
		System.out.println("Response \n" + getResponse(nameResource) + "\n\n");
		return getResponse(nameResource);
	}
	
	private static String getClientResponse(WebResource resource) {
		return resource.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class).toString();
	}
	
	private static String getResponse(WebResource resource) {
		return resource.accept(MediaType.APPLICATION_JSON).get(String.class);
	}
}
