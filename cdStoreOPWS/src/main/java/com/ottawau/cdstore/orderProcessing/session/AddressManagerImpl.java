package com.ottawau.cdstore.orderProcessing.session;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.NonUniqueResultException;

import org.hibernate.HibernateException;

import com.ottawau.cdstore.orderProcessing.DAO.AddressDAO;
import com.ottawau.cdstore.orderProcessing.DAO.AddressDAOImpl;
import com.ottawau.cdstore.orderProcessing.entity.Address;
import com.ottawau.cdstore.orderProcessing.util.HibernateUtil;


public class AddressManagerImpl implements AddressManager {

    private AddressDAO addressDAO = new AddressDAOImpl();

    public Address findByProvince(String province) {
        Address address = null;
        try {
            HibernateUtil.beginTransaction();
            address = addressDAO.findByProvince(province);
            HibernateUtil.commitTransaction();
        } catch (NonUniqueResultException ex) {
            System.out.println("Query returned more than one results.");
        } catch (HibernateException ex) {
        	ex.printStackTrace();
        }
        return address;
    }
    
    
	public List<Address> findAllAddress() {
        List<Address> allAddress = new ArrayList<Address>();
        try {
            HibernateUtil.beginTransaction();
            allAddress = addressDAO.findAll(Address.class);
            HibernateUtil.commitTransaction();
        } catch (HibernateException ex) {
        	ex.printStackTrace();
        }
        return allAddress;
    }
	
	public List<Address> findLatestAddress(String columnName) {
        List<Address> allAddress = new ArrayList<Address>();
        try {
            HibernateUtil.beginTransaction();
            allAddress = addressDAO.findMaxColumnOne(Address.class, columnName);
            HibernateUtil.commitTransaction();
        } catch (HibernateException ex) {
        	ex.printStackTrace();
        }
        return allAddress;
    }
	
    public void saveNewAddress(Address address) {
        try {
            HibernateUtil.beginTransaction();
            addressDAO.save(address);
            HibernateUtil.commitTransaction();
        } catch (HibernateException ex) {
        	ex.printStackTrace();
            System.out.println("Exception when saving new Address: Rolling back");
            HibernateUtil.rollbackTransaction();
        }
    }


    public void deleteAddress(Address address) {
        try {
            HibernateUtil.beginTransaction();
            addressDAO.delete(address);
            HibernateUtil.commitTransaction();
        } catch (HibernateException ex) {
        	ex.printStackTrace();
            System.out.println("Exception when Deleting Address: Rolling back");
            HibernateUtil.rollbackTransaction();
        }
    }
}
