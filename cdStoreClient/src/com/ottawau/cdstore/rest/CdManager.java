package com.ottawau.cdstore.rest;

import com.google.gson.Gson;
import com.ottawau.cdstore.viewModel.Cd;

public class CdManager extends GeneralRestClientManager{
	String servicePath = "/CdService";
	String methodPath;
	
	public Cd getById(int id){
		methodPath = "/getById/"+id;
		return (Cd) new Gson().fromJson(getResource(servicePath+methodPath), Cd.class);
	}
}
