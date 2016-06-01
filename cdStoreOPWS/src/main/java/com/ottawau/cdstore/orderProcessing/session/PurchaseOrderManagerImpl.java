package com.ottawau.cdstore.orderProcessing.session;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;

import com.ottawau.cdstore.orderProcessing.DAO.PurchaseOrderDAO;
import com.ottawau.cdstore.orderProcessing.DAO.PurchaseOrderDAOImpl;
import com.ottawau.cdstore.orderProcessing.entity.PurchaseOrder;
import com.ottawau.cdstore.orderProcessing.util.HibernateUtil;

public class PurchaseOrderManagerImpl implements PurchaseOrderManager {
	private PurchaseOrderDAO poDAO = new PurchaseOrderDAOImpl();

	@SuppressWarnings("unchecked")
	public List<PurchaseOrder> findAllPurchaseOrder() {
		List<PurchaseOrder> allPo = new ArrayList<PurchaseOrder>();
		try {
			HibernateUtil.beginTransaction();
			allPo = poDAO.findAll(PurchaseOrder.class);
			HibernateUtil.commitTransaction();
		} catch (HibernateException ex) {
			ex.printStackTrace();
		}
		return allPo;
	}

	public void saveNewPurchaseOrder(PurchaseOrder po) {
		try {
			HibernateUtil.beginTransaction();
			poDAO.save(po);
			HibernateUtil.commitTransaction();
		} catch (HibernateException ex) {
			ex.printStackTrace();
			System.out.println("Exception when saving new CD: Rolling back");
			HibernateUtil.rollbackTransaction();
		}
	}

}
