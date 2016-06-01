package com.ottawau.cdstore.orderProcessing.session;

import java.util.List;

import com.ottawau.cdstore.orderProcessing.entity.Address;


public interface AddressManager {

    public Address findByProvince(String name);
    
    public List<Address> findAllAddress();
    
    public List<Address> findLatestAddressId();
    
    public void saveNewAddress(Address address);

    public void deleteAddress(Address address);
    
}
