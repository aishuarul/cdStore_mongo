/**
 * 
 * 
 */

package com.ottawau.cdstore.orderProcessing.MongoDAO;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Query;

import com.ottawau.cdstore.orderProcessing.DAO.GenericDAOImpl;
import com.ottawau.cdstore.orderProcessing.DAO.IcdDao;
import com.ottawau.cdstore.orderProcessing.entity.Cd;
import com.ottawau.cdstore.orderProcessing.util.HibernateUtil;

public class CdMongoDAOImpl extends MongoGenericDAOImpl<Cd, Serializable> implements ICdMongoDAO {
	
	public CdMongoDAOImpl(String collectionName) {
		super(collectionName);
		
	}
	
	public String getListByCategoryName(String categoryName) throws Exception{
		Map<String, String> params = new HashMap();
		params.put("category", categoryName);
		return findMany(params);
	}
	
	public String getById(String id) throws Exception {
		// TODO Auto-generated method stub
		Map<String, String> params = new HashMap();
		params.put("_id", id);
		
		return  findOne(params);
		
	}
	
	
}
