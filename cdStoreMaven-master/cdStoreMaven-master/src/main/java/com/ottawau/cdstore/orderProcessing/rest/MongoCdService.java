package com.ottawau.cdstore.orderProcessing.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ottawau.cdstore.orderProcessing.DAO.CdDaoImpl;
import com.ottawau.cdstore.orderProcessing.MongoDAO.CdMongoDAOImpl;
import com.ottawau.cdstore.orderProcessing.entity.Cd;

@Path("/MongoCdService")
public class MongoCdService {
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
	public String getListByCategoryName(@PathParam("i")String categoryName) throws Exception{
		return new CdMongoDAOImpl("Cd").getListByCategoryName(categoryName);
	} 
	
	@GET
	@Path("/getById/{i}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getById(@PathParam("i")String id) throws Exception{
		return new CdMongoDAOImpl("Cd").getById(id);
	}
}
