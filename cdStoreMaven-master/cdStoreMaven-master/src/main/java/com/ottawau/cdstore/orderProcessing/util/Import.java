package com.ottawau.cdstore.orderProcessing.util;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.ottawau.cdstore.orderProcessing.DAO.CategoryImpl;
import com.ottawau.cdstore.orderProcessing.DAO.CdDaoImpl;
import com.ottawau.cdstore.orderProcessing.MongoDAO.MongoGenericDAOImpl;
import com.ottawau.cdstore.orderProcessing.entity.Category;

public class Import {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		List<Category> cats = new ArrayList<Category>();
			cats = new CategoryImpl().findAll(Category.class);
			
			for( Category cat :cats){
				new MongoGenericDAOImpl<Category, Serializable>("Category").save(cat);
			}
	}

}
