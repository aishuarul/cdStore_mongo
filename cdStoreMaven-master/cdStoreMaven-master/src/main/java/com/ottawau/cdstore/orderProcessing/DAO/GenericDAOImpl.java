package com.ottawau.cdstore.orderProcessing.DAO;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import org.hibernate.FlushMode;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.context.internal.ManagedSessionContext;

import com.ottawau.cdstore.orderProcessing.util.HibernateUtil;



public abstract class GenericDAOImpl<T, ID extends Serializable> implements GenericDAO<T, ID> {

    protected Session getSession() {
        return HibernateUtil.getSession();
    }

    public void save(T entity) {
        Session hibernateSession = this.getSession();
        hibernateSession.saveOrUpdate(entity);
    }

    public void merge(T entity) {
        Session hibernateSession = this.getSession();
        hibernateSession.merge(entity);
    }

    public void delete(T entity) {
        Session hibernateSession = this.getSession();
        hibernateSession.delete(entity);
    }

    public List<T> findMany(Query query) {
        List<T> t;
        Session hibernateSession = this.getSession();
    	hibernateSession.beginTransaction();
       
    	t = (List<T>) query.list();
        
    	 hibernateSession.getTransaction().commit();
        return t;
    }

    public T findOne(Query query) {
        T t;
        Session hibernateSession = this.getSession();
    	hibernateSession.beginTransaction();
    	
        t = (T) query.uniqueResult();
        
        hibernateSession.getTransaction().commit();
        return t;
    }
    
    public List findMaxColumnOne(Class clazz, String columnName) {
    	
    	 Session hibernateSession = this.getSession();
         List T = null;
         Query query = hibernateSession.createQuery("select max("+ columnName+")"+" from " + clazz.getName());
         T = query.list();
         return T;
    }

    public List findAll(Class clazz) {
    	List T = null;
    	Session hibernateSession = this.getSession();
    	hibernateSession.beginTransaction();
    	
    	Query query = hibernateSession.createQuery("from " + clazz.getName());
        T = query.list();
        
        hibernateSession.getTransaction().commit();
        return T;
    }
}
