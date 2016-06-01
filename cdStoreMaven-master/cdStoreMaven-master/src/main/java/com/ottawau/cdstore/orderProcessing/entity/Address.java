/**
 * @author Aishvarya Arul Nambi
 *
 * Address Entity class
 */
package com.ottawau.cdstore.orderProcessing.entity;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table(name = "address")
public class Address implements java.io.Serializable {
	
	
	private Integer address_id;
	
	@Column(name = "street")
	public String street;
	
	@Column(name = "province")
	public String province;
	
	@Column(name = "country")
	public String country;
	
	@Column(name = "zip")
	public String zip;
	
	@Column(name = "phone")
	public String phone;
	
	public Address() {
	}
	

	public Address(String street, String province, String country, String zip, String phone){
		this.street = street;
		this.province = province;
		this.country = country;
		this.zip = zip;
		this.phone = phone;
	}
	
	public String getStreet() {
		return this.street;
	}
	
	@Id @GeneratedValue
	@Column(name = "address_id")
	public Integer getAddress_id() {
		return address_id;
	}


	public void setAddress_id(Integer address_id) {
		this.address_id = address_id;
	}


	public void setStreet(String street) {
		this.street = street;
	}

	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getZip() {
		return this.zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
