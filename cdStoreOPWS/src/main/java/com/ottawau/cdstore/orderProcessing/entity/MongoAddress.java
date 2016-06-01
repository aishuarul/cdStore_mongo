package com.ottawau.cdstore.orderProcessing.entity;

public class MongoAddress {
	
	private Integer _id;
	private String street;
	private String province;
	private String country;
	private String zip;
	private String phone;
	
	public MongoAddress() {
	}
	
	public MongoAddress(Integer _id, String street, String province, String country, String zip, String phone){
		this._id = _id;
		this.street = street;
		this.province = province;
		this.country = country;
		this.zip = zip;
		this.phone = phone;
	}

	public MongoAddress(String street, String province, String country, String zip, String phone){
		this.street = street;
		this.province = province;
		this.country = country;
		this.zip = zip;
		this.phone = phone;
	}
	
	public String getStreet() {
		return this.street;
	}

	public Integer get_id() {
		return _id;
	}


	public void set_id(Integer _id) {
		this._id = _id;
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
