/**
 * @author Aishvarya Arul Nambi
 *
 * Address Entity class
 */
package com.ottawau.cdstore.orderProcessing.entity;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Cd implements Serializable {
	@Id
	@GeneratedValue
	private int id;
	private int categoryId;
	private String title;
	private String artist;
	private String year;
	private double price;
	
	public Cd(){
		
	}
	public Cd(int categoryId, String title, String artist, String year,
			 double price) {
		this.categoryId = categoryId;
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.price = price;
	}

	public int getId() {
		return id;
	}
	
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
