package com.ottawau.cdstore.orderProcessing.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class MongoCd {
	
	private int _id;
	private int category;
	private String title;
	private String artist;
	private String year;
	private double price;
	
	public MongoCd(){
		
	}
	public MongoCd(int id, int category, String title, String artist, String year,
			 double price) {
		this._id = id;
		this.category = category;
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.price = price;
	}

	public int getId() {
		return _id;
	}
	
	public int getCategory() {
		return category;
	}
	public void setCategory(int category) {
		this.category = category;
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

