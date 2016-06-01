/**
 * 
 * 
 */

package com.ottawau.cdstore.orderProcessing.util;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import com.ottawau.cdstore.orderProcessing.MongoDAO.CdMongoDAOImpl;
import com.ottawau.cdstore.orderProcessing.MongoDAO.MongoGenericDAOImpl;
import com.ottawau.cdstore.orderProcessing.entity.Cd;
import com.ottawau.cdstore.orderProcessing.entity.MongoCd;



public class Main {
	
	public static void main(String[] args) throws Exception {
   
	//	Cd cdOld = new Cd(1,"Nothing but Air","Ilayaraja","1988",400);
		//new MongoGenericDAOImpl<Cd, Serializable>("Cd").save(cdOld);
	//	Cd cdNew = new Cd(1,"Nothing but Mind","Ilayaraja","1989",200);
		//new MongoGenericDAOImpl<Cd, Serializable>("Cd").save(cdNew);
    
		//new MongoGenericDAOImpl<Cd, Serializable>("Cd").merge(cdOld, cdNew);
		//   System.out.print(spyFields(cd));
		//  System.out.print(num);
		String key="title";
		String value="Title Chaned";
		//new MongoGenericDAOImpl<Cd, Serializable>("Cd").merge(key,value);
		System.out.print( new CdMongoDAOImpl("Cd").getById("1"));
	//	System.out.print(new CdMongoDAOImpl("Cd").getById("547967fd5a6ff4acfeb9aaf5"));
		
		
		
//		DB db = getMongoDb();
//		DBCollection table = db.getCollection("Cd");
//		
//		BasicDBObject searchQuery = new BasicDBObject();
//		
//		searchQuery.put("_id", "1");
//        
//		
//		DBCursor cursor = table.find(searchQuery);
//	 
//		String response ="{\"response\":["; 
//		
//		while (cursor.hasNext()) {
//			System.out.println("in While");
//			System.out.println(cursor.count());
//			 response += cursor.next()+",";	
//		}
//		response = response.substring(0,response.length()-1);
//		response += "]}";
//		System.out.println(response);
		//return response;
		
		
		
		}

//  public static String spyFields(Object obj) throws IllegalAccessException {
//   
//	StringBuffer buffer = new StringBuffer();
//    Field[] fields = obj.getClass().getDeclaredFields();
//    for (Field f : fields) {
//      if (!Modifier.isStatic(f.getModifiers())) {
//        f.setAccessible(true);
//        Object value = f.get(obj);
//       // buffer.append(f.getType().getName());
//        buffer.append(" ");
//        buffer.append(f.getName());
//       // buffer.append("=");
//        buffer.append(" " + value);
//        buffer.append("\n");
//      }
//    }
//    return buffer.toString();
//  }
	
	protected static DB getMongoDb() throws Exception {
    	MongoClient mongo = new MongoClient( "localhost" , 27017 );
    	DB db = mongo.getDB("cd_store");
    	return db;
    }
}