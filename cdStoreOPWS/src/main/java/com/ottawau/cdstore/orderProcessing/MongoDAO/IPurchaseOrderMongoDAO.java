/**
 * 
 * 
 */

package com.ottawau.cdstore.orderProcessing.MongoDAO;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;

import com.ottawau.cdstore.orderProcessing.entity.MongoPurchaseOrder;

public interface IPurchaseOrderMongoDAO extends IMongoGenericDAO <MongoPurchaseOrder, Serializable> {
	
	public String findAll() throws Exception;
}
