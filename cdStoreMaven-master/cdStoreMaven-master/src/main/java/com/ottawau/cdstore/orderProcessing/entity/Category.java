package com.ottawau.cdstore.orderProcessing.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

@Entity
public class Category {
	
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private Date created;
	private Date modified;

	  @PrePersist
	  protected void onCreate() {
	    this.created = new Date();
	  }

	  @PreUpdate
	  protected void onModified() {
		 this.modified = new Date();
	  }
	
	  public Category() {
			
	  }
	  public Category(String name) {
		this.name = name;
		onCreate();
		onModified();
	}

	public int getId() {
		return id;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
