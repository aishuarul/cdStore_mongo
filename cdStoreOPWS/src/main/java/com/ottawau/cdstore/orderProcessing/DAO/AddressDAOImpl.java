package com.ottawau.cdstore.orderProcessing.DAO;

import java.math.BigDecimal;

import org.hibernate.Query;

import com.ottawau.cdstore.orderProcessing.entity.Address;
import com.ottawau.cdstore.orderProcessing.util.HibernateUtil;

public class AddressDAOImpl extends GenericDAOImpl<Address, BigDecimal> implements AddressDAO {

    public Address findByProvince(String province) {
		
		Address address = null;
        String sql = "SELECT DISTINCT province FROM Address WHERE province =:provinceParameterValue";
        Query query = HibernateUtil.getSession().createQuery(sql).setParameter("provinceParameterValue", province);
        address = findOne(query);
        return address;
    }
}