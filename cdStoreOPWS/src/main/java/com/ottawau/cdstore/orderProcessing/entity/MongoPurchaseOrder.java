package com.ottawau.cdstore.orderProcessing.entity;

public class MongoPurchaseOrder {
	
	private int _id;
	private String last_name;
	private String first_name;
	private String status;
	private int address;
	public MongoPurchaseOrder( String last_name, String first_name,
			String status, int address) {
		this._id = _id;
		this.last_name = last_name;
		this.first_name = first_name;
		this.status = status;
		this.address = address;
	}
	public int get_id() {
		return _id;
	}
	public void set_id(int _id) {
		this._id = _id;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getAddress() {
		return address;
	}
	public void setAddress(int address) {
		this.address = address;
	}
}
