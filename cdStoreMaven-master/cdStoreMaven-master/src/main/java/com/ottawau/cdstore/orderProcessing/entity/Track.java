package com.ottawau.cdstore.orderProcessing.entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Track {
	
	@XmlElement(name="title")
	String title;
	
	@XmlElement(name="singer")
	String singer;
 
	
	public String getTitle() {
		return title;
	}
 
	public void setTitle(String title) {
		this.title = title;
	}
 
	public String getSinger() {
		return singer;
	}
 
	public void setSinger(String singer) {
		this.singer = singer;
	}
 
	@Override
	public String toString() {
		return "Track [title=" + title + ", singer=" + singer + "]";
	}
 
}