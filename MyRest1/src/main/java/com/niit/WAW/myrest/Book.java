package com.niit.WAW.myrest;

//import javax.xml.bind.annotation.XmlElement;
//import javax.xml.bind.annotation.XmlRootElement;

import javax.xml.bind.annotation.*;
@XmlRootElement(name="Book")
public class Book {
	private String id;
	private String Name;
	private String authorName;
	private int volumeNumber;
	private String publisher;

@XmlElement(name="ID",required=true)
	
public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@XmlElement(name="NAME",required=true)
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	@XmlAttribute
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	@XmlElement(name="VOLUME",required=true)
	public int getVolumeNumber() {
		return volumeNumber;
	}
	public void setVolumeNumber(int volumeNumber) {
		this.volumeNumber = volumeNumber;
	}
	@XmlTransient                   //It will not save the data
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
}

