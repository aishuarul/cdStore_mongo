package com.ottawau.cdstore.orderProcessing.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ottawau.cdstore.orderProcessing.DAO.CdDaoImpl;
import com.ottawau.cdstore.orderProcessing.entity.Cd;

@Path("/CdService")
public class CdService {
	
	static {
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
	
	@GET
	@Path("/getListByCategoryName/{i}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Cd> getListByCategoryName(@PathParam("i")String categoryName){
		return new CdDaoImpl().getListByCategoryName(categoryName);
	} 
	
	@GET
	@Path("/getById/{i}")
	@Produces(MediaType.APPLICATION_JSON)
	public Cd getById(@PathParam("i")int id){
		return new CdDaoImpl().getById(id);
	} 
	
}
