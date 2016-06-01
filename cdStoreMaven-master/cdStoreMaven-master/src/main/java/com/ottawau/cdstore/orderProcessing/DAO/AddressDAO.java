package com.ottawau.cdstore.orderProcessing.DAO;

import java.math.BigDecimal;

import com.ottawau.cdstore.orderProcessing.entity.Address;



public interface AddressDAO extends GenericDAO<Address, BigDecimal> {

    public Address findByProvince(String name);
}