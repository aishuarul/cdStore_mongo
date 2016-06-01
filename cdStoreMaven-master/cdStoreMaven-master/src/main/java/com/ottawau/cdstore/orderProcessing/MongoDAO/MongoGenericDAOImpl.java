/**
 * 
 * 
 */


package com.ottawau.cdstore.orderProcessing.MongoDAO;

import java.io.Serializable;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.hibernate.Query;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.ottawau.cdstore.orderProcessing.DAO.GenericDAO;
import com.ottawau.cdstore.orderProcessing.util.HibernateUtil;
import com.ottawau.cdstore.orderProcessing.util.MongoUtil;


public class MongoGenericDAOImpl <T, ID extends Serializable> implements IMongoGenericDAO<T, ID> {

    String collectionName,key,value;
    
	public MongoGenericDAOImpl(String collectionName) {
		this.collectionName = collectionName;
	}

	protected DB getMongoDb() throws Exception {
    	MongoClient mongo = new MongoClient( "localhost" , 27017 );
    	DB db = mongo.getDB("cd_store");
    	return db;
    }

    public void save(T entity) throws Exception {
    	DB db = this.getMongoDb();
    	DBCollection table = db.getCollection(collectionName);
    	BasicDBObject document = new BasicDBObject();
    	Iterator it = null;
    	Map<String, String> map = (Map<String, String>) new MongoUtil().documentMapper(entity);
    	it = map.entrySet().iterator();
		while (it.hasNext()) {
        	Map.Entry pairs = (Map.Entry)it.next();
        	System.out.println(pairs.getKey() + " = " + pairs.getValue());
        	String[] notAllowed = {"categoryId","id"};
        	
        	if(pairs.getKey().equals("categoryId") && pairs.getValue().equals("1"))
        		document.put("category", "pop");
        	if(pairs.getKey().equals("categoryId") && pairs.getValue().equals("2"))
        		document.put("category", "rock");
        	if(pairs.getKey().equals("categoryId") && pairs.getValue().equals("3"))
        		document.put("category", "country");
        	
        	if(pairs.getKey().toString() == "id")
        		document.put("_id", pairs.getValue());
        	
        	if(!Arrays.asList(notAllowed).contains(pairs.getKey()))
        		document.put((String) pairs.getKey(), pairs.getValue());
            
           // System.out.println(pairs.getKey() + " = " + pairs.getValue());
        }
		table.insert(document);
    }
    
    @Override
	public void merge(T entityOld, T entityNew) throws Exception {
		DB db = this.getMongoDb();
    	DBCollection table = db.getCollection(collectionName);
    	BasicDBObject documentOld = new BasicDBObject();
    	BasicDBObject documentNew = new BasicDBObject();
    	Iterator it = null;
    	Map<String, String> mapOld = (Map<String, String>) new MongoUtil().documentMapper(entityOld);
    	Map<String, String> mapNew = (Map<String, String>) new MongoUtil().documentMapper(entityNew);
    	it = mapOld.entrySet().iterator();
		while (it.hasNext()) {
        	Map.Entry pairs = (Map.Entry)it.next();
        	
        	documentOld.put((String) pairs.getKey(), pairs.getValue());
           // System.out.println(pairs.getKey() + " = " + pairs.getValue());
        }
		it = mapNew.entrySet().iterator();
		while (it.hasNext()) {
        	Map.Entry pairs = (Map.Entry)it.next();
        	
        	documentNew.put((String) pairs.getKey(), pairs.getValue());
           // System.out.println(pairs.getKey() + " = " + pairs.getValue());
        }
		
		BasicDBObject updateObj = new BasicDBObject();
		updateObj.put("$set", documentNew);
		
		table.update(documentOld, updateObj);
	
	}
    
    @Override
	public String findAll() throws Exception {
		DB db = this.getMongoDb();
		DBCollection table = db.getCollection(collectionName);
		DBCursor cursor = table.find();
		System.out.println(table.getStats());
		String response ="{\"response\":["; 
		while (cursor.hasNext()) {
			 response += cursor.next()+",";
		}
		response = response.substring(0,response.length()-1);
		response += "]}";
		return response;
	}
    
	

	@Override
	public void delete(T entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String findOne(Map<String, String> params) throws Exception {
		DB db = this.getMongoDb();
		DBCollection table = db.getCollection(collectionName);
		
		BasicDBObject searchQuery = new BasicDBObject();
		Iterator it = null;
		
		it = params.entrySet().iterator();
		while (it.hasNext()) {
        	Map.Entry pairs = (Map.Entry)it.next();
        	if(pairs.getKey() == "_id"){
        		//searchQuery.put((String) pairs.getKey(), );
        	}
        	System.out.println(pairs.getKey() + " = " + pairs.getValue());
        	searchQuery.put((String) pairs.getKey(), pairs.getValue());
        }
		
		DBCursor cursor = table.find(searchQuery);
	 
		//String response ="{\"response\":["; 
		String response ="";
		while (cursor.hasNext()) {
			System.out.println("in While");
			System.out.println(cursor.count());
			response += cursor.next();
			//response += cursor.next()+",";	
		}
		//response = response.substring(0,response.length()-1);
		//response += "]}";
		System.out.println(response);
		return response;
	}

	@Override
	public String findMany(Map<String, String> params) throws Exception {
		DB db = this.getMongoDb();
		DBCollection table = db.getCollection(collectionName);
		
		BasicDBObject searchQuery = new BasicDBObject();
		Iterator it = null;
		
		it = params.entrySet().iterator();
		while (it.hasNext()) {
        	Map.Entry pairs = (Map.Entry)it.next();
        	System.out.println(pairs.getKey() + " = " + pairs.getValue());
        	searchQuery.put((String) pairs.getKey(), pairs.getValue());
        }
		
		DBCursor cursor = table.find(searchQuery);
	 
		String response ="{\"response\":["; 
		
		while (cursor.hasNext()) {
			System.out.println("in While");
			System.out.println(cursor.count());
			 response += cursor.next()+",";
		}
		response = response.substring(0,response.length()-1);
		response += "]}";
		System.out.println(response);
		return response;
	}

	@Override
	public List findMaxColumnOne(Class clazz, String columnName) {
		// TODO Auto-generated method stub
		return null;
	}

	

   /* public void merge(T entity) throws Exception {
    	DB db = this.getMongoDb();
        // mongoObj.merge(entity);
    }

    public void delete(T entity) throws Exception {
    	DB db = this.getMongoDb();
        mongoObj.delete(entity);
    }

    public List<T> findMany(Query query) throws Exception {
        List<T> t;
        DB db = this.getMongoDb();
    	
    	t = (List<T>) query.list();
        
    	return t;
    }

    public T findOne(Query query) {
        T t;
        DB db = this.getMongoDb();
    	db.beginTransaction();
    	
        t = (T) query.uniqueResult();
        
        db.getTransaction().commit();
        return t;
    }
    
    public List findMaxColumnOne(Class clazz, String columnName) {
    	
    	 DB db = this.getMongoDb();
         List T = null;
         Query query = // mongoObj.createQuery("select max("+ columnName+")"+" from " + clazz.getName());
         T = query.list();
         return T;
    }

    public List findAll(Class clazz) {
    	List T = null;
    	DB db = this.getMongoDb();
    	db.beginTransaction();
    	
    	Query query = db.createQuery("from " + clazz.getName());
        T = query.list();
        
        db.getTransaction().commit();
        return T;
    }*/
	
	
}
