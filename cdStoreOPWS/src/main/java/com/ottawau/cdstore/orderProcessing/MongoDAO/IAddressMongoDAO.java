/**
 * 
 * 
 */

package com.ottawau.cdstore.orderProcessing.MongoDAO;

import java.io.Serializable;
import com.ottawau.cdstore.orderProcessing.entity.MongoAddress;


public interface IAddressMongoDAO extends IMongoGenericDAO <MongoAddress, Serializable> {
	
	public String findAll() throws Exception;
}
