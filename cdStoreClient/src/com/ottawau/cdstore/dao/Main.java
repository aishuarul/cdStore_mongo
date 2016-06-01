package com.ottawau.cdstore.dao;

import com.google.gson.Gson;
import com.ottawau.cdstore.viewModel.Cd;

public class Main {
	public static void main(String[] str){
		System.out.println("Works");
		String json = "{\"id\":1,\"year\":\"1982\",\"price\":50.0,\"title\":\"Thriller\",\"categoryId\":1,\"artist\":\"Michael Jackson\"}";
		Cd cd = new Cd();
		cd = (Cd) new Gson().fromJson(json, Cd.class);
		System.out.println(cd.artist);
		
	}
}
