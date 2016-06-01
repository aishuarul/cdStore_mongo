/**
 * 
 * 
 */


package com.ottawau.cdstore.orderProcessing.util;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;

public class MongoUtil {

	public Map documentMapper(Object obj) {
		Map<String,String> map = new HashMap<String,String>();
		Field[] fields = obj.getClass().getDeclaredFields();
	    for (Field f : fields) {
	      if (!Modifier.isStatic(f.getModifiers())) {
	        f.setAccessible(true);
	        Object value = null;
	        try {
				value = f.get(obj);
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
			 map.put(f.getName(), value.toString());
			}
	    }
		return map;
	}
}
