/**
 * 
 * 
 */

package com.ottawau.cdstore.orderProcessing.MongoDAO;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.hibernate.Query;

public interface IMongoGenericDAO <T, ID extends Serializable> {

    public void save(T entity) throws Exception;

    public void merge(T entityOld,T entityNew) throws Exception;

    public void delete(T entity);

    public String findMany(Map<String, String> params) throws Exception;

    public String findOne(Map<String, String> params) throws Exception;
    
    public List findMaxColumnOne(Class clazz, String columnName);
    
    public String findAll() throws Exception;
}
