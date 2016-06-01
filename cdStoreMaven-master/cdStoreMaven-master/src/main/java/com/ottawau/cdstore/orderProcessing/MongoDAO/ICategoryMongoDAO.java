package com.ottawau.cdstore.orderProcessing.MongoDAO;

import java.io.Serializable;

import com.ottawau.cdstore.orderProcessing.entity.Category;

public interface ICategoryMongoDAO extends IMongoGenericDAO <Category, Serializable> {
	
	public String findAll() throws Exception;
}