package com.ottawau.cdstore.orderProcessing.rest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.ottawau.cdstore.orderProcessing.DAO.CategoryImpl;
import com.ottawau.cdstore.orderProcessing.entity.Address;
import com.ottawau.cdstore.orderProcessing.entity.Category;
import com.ottawau.cdstore.orderProcessing.session.AddressManager;
import com.ottawau.cdstore.orderProcessing.session.AddressManagerImpl;
import com.ottawau.cdstore.orderProcessing.util.HibernateUtil;

@Path("/CategoryService")
public class CategoryService {
	@GET
	@Path("/getList")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Category> getList(){
		List<Category> cats = new ArrayList<Category>();
		cats = new CategoryImpl().findAll(Category.class);
		return cats;
	} 
}
