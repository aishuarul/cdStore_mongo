/**
 * @author Aishvarya Arul Nambi
 *
 * Address Entity class
 */
package com.ottawau.cdstore.orderProcessing.entity;

import javax.persistence.*;

@Entity
@Table(name="purchase_order")
public class PurchaseOrder implements java.io.Serializable {

	@Id @GeneratedValue
	@Column(name = "purchase_order_id")
	private Integer purchase_order_id;
	
	@Column(name = "last_name")
	private String last_name;
	
	@Column(name = "first_name")
	private String first_name;
	
	@Column(name = "status")
	private String status;
	
	@Column(name = "address")
	private int address;
	
  //  private  Address address;
	
	public int getAddress() {
		return address;
	}

	public void setAddress(int address) {
		this.address = address;
	}

	public PurchaseOrder(){
	}
	
	public PurchaseOrder(Integer purchase_order_id, String last_name, String first_name, String status, int address){
		this.purchase_order_id = purchase_order_id;
		this.last_name = last_name;
		this.first_name = first_name;
		this.status = status;
		this.address = address;
	}
	
	public PurchaseOrder(String last_name, String first_name, String status, int address){
		this.last_name = last_name;
		this.first_name = first_name;
		this.status = status;
		this.address = address;
	}
	
	public Integer getPurchase_order_id() {
		return purchase_order_id;
	}

	public void setPurchase_order_id(Integer purchase_order_id) {
		this.purchase_order_id = purchase_order_id;
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


	/*
    @JoinColumn(name = "address_id")
    @OneToOne(cascade = CascadeType.ALL)
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	*/	

}
