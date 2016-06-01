package com.ottawau.cdstore.orderProcessing.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Cart {
	@Id
	@GeneratedValue
	public int id;
	public double subTotal;
	public double total;
	public List<Cd> cds = new ArrayList<Cd>();
	
}
