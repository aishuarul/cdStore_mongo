package com.ottawau.cdstore.orderProcessing.DAO;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.ottawau.cdstore.orderProcessing.entity.Address;
import com.ottawau.cdstore.orderProcessing.entity.Category;
import com.ottawau.cdstore.orderProcessing.entity.Cd;
import com.ottawau.cdstore.orderProcessing.util.HibernateUtil;

public class CdDaoImpl extends GenericDAOImpl<Cd, BigDecimal> implements IcdDao {
public List<Cd> getListByCategoryName(String categoryName ){
		List<Cd> cds;
		Category cat;
		CategoryImpl cateImpl = new CategoryImpl();
		String sql;
		Query query;
		
		sql = " FROM Category WHERE name=:categoryParameterValue";
		query = HibernateUtil.getSession().createQuery(sql).setParameter("categoryParameterValue", categoryName);
       
    	cat = cateImpl.findOne(query);
		
    	sql = " FROM Cd WHERE categoryId=:categoryId"; 
    	query = HibernateUtil.getSession().createQuery(sql).setParameter("categoryId", cat.getId());
    	cds = findMany(query);
		cds = (List<Cd>) query.list();
		
		return cds;
    }

	public Cd getById(int id) {
		// TODO Auto-generated method stub
		String sql = " from Cd where id=:id";
		Query query = HibernateUtil.getSession().createQuery(sql).setParameter("id", id);
		return  (Cd)findOne(query);
		
	}
}
