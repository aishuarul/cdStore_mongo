package com.ottawau.cdstore.orderProcessing.DAO;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.ottawau.cdstore.orderProcessing.util.HibernateUtil;



public abstract class GenericDAOImpl<T, ID extends Serializable> implements GenericDAO<T, ID> {

    protected Session getSession() {
        return HibernateUtil.getSession();
    }

    public void save(T entity) {
        Session hibernateSession = this.getSession();
        HibernateUtil.beginTransaction();
        hibernateSession.saveOrUpdate(entity);
        HibernateUtil.commitTransaction();
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
        t = (List<T>) query.list();
        return t;
    }

    public T findOne(Query query) {
        T t;
        t = (T) query.uniqueResult();
        return t;
    }
    
    public List findMaxColumnOne(Class clazz, String columnName) {
    	
    	 Session hibernateSession = this.getSession();
         List T = null;
         Query query = hibernateSession.createQuery("select max("+ columnName+") from " + clazz.getName());
         T = query.list();
         return T;
    }

    public List findAll(Class clazz) {
        Session hibernateSession = this.getSession();
        List T = null;
        Query query = hibernateSession.createQuery("from " + clazz.getName());
        T = query.list();
        return T;
    }
}