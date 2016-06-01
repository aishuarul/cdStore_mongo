package com.ottawau.cdstore.rest;

import com.google.gson.Gson;
import com.ottawau.cdstore.viewModel.MongoCd;

public class MongoCdManager extends GeneralRestClientManager{
	String servicePath = "/MongoCdService";
	String methodPath;
	
	public MongoCd getById(String id){
		methodPath = "/getById/"+id;
		MongoCd mc = new Gson().fromJson(getResource(servicePath+methodPath), MongoCd.class);
		System.out.println("\n****"+mc._id+" "+mc.title+"****\n");
		return (MongoCd) new Gson().fromJson(getResource(servicePath+methodPath), MongoCd.class); 
	}
}