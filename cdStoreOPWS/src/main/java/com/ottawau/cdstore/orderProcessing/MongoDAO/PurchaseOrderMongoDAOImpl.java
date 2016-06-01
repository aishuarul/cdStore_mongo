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

import org.hibernate.HibernateException;
import org.hibernate.Query;

import com.ottawau.cdstore.orderProcessing.DAO.GenericDAOImpl;
import com.ottawau.cdstore.orderProcessing.entity.MongoPurchaseOrder;
import com.ottawau.cdstore.orderProcessing.util.HibernateUtil;

public class PurchaseOrderMongoDAOImpl extends MongoGenericDAOImpl<MongoPurchaseOrder, Serializable> implements IPurchaseOrderMongoDAO {
	
	public PurchaseOrderMongoDAOImpl(String collectionName) {
		super(collectionName);
		
	}
	
}
