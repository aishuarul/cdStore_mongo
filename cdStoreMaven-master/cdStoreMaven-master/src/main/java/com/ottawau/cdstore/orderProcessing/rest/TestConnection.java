package com.ottawau.cdstore.orderProcessing.rest;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;



import com.ottawau.cdstore.orderProcessing.entity.Track;
import com.ottawau.cdstore.orderProcessing.session.AddressManager;
import com.ottawau.cdstore.orderProcessing.session.AddressManagerImpl;
 
@Path("/testConnection")
public class TestConnection {
	
	@GET
	@Path("/getTrack")
	@Produces("application/json")
	public Track getTrackInJSON() {
 
		Track track = new Track();
		track.setTitle("Enter Sandman");
		track.setSinger("Metallica");
 
		return track;
 
	}
 
	

	@GET
	@Path("/first/{id}")
	public Response getUserById(@PathParam("id") String id) {
 
	   return Response.status(200).entity("getUserById is called, id : " + id).build();
 
	}
	
}
