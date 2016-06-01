package com.ottawau.cdstore.orderProcessing.util;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.ottawau.cdstore.orderProcessing.DAO.AddressDAOImpl;
import com.ottawau.cdstore.orderProcessing.DAO.MemberDAOImpl;
import com.ottawau.cdstore.orderProcessing.DAO.PurchaseOrderDAOImpl;
import com.ottawau.cdstore.orderProcessing.MongoDAO.MongoGenericDAOImpl;
import com.ottawau.cdstore.orderProcessing.entity.Address;
import com.ottawau.cdstore.orderProcessing.entity.Member;
import com.ottawau.cdstore.orderProcessing.entity.PurchaseOrder;


public class Import {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		List<PurchaseOrder> cats = new ArrayList<PurchaseOrder>();
			cats = new PurchaseOrderDAOImpl().findAll(PurchaseOrder.class);
			
			for( PurchaseOrder cat :cats){
				new MongoGenericDAOImpl<PurchaseOrder, Serializable>("PurchaseOrder").save(cat);
			}
	}

}
