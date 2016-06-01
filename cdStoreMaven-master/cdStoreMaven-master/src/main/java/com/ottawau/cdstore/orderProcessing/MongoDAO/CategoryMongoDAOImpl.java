package com.ottawau.cdstore.orderProcessing.MongoDAO;

import java.io.Serializable;

import com.ottawau.cdstore.orderProcessing.entity.Category;

public class CategoryMongoDAOImpl extends MongoGenericDAOImpl<Category, Serializable> implements ICategoryMongoDAO {
	
	String collectionName = "Category";
	
	public CategoryMongoDAOImpl(String collectionName) {
		super(collectionName);
		
	}
}
