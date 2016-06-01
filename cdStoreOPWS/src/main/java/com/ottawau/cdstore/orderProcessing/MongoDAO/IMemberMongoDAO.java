/**
 * 
 * 
 */

package com.ottawau.cdstore.orderProcessing.MongoDAO;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;

import com.ottawau.cdstore.orderProcessing.entity.MongoMember;
import com.ottawau.cdstore.orderProcessing.entity.PurchaseOrder;

public interface IMemberMongoDAO extends IMongoGenericDAO <MongoMember, Serializable> {
	
	public String findAll() throws Exception;
}
