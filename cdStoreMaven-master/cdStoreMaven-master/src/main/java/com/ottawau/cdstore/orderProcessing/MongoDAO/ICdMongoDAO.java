/**
 * 
 * 
 */

package com.ottawau.cdstore.orderProcessing.MongoDAO;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;

import com.ottawau.cdstore.orderProcessing.entity.Cd;

public interface ICdMongoDAO extends IMongoGenericDAO <Cd, Serializable> {
	
	public String findAll() throws Exception;
}
