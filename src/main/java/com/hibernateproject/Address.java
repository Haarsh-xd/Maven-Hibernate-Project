package com.hibernateproject;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "Student_Address")
public class Address {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column (name="House_Number")
	private int houseNo;
	
	@Column(length = 50,name="Street")
	private String street;
	
	@Column(name="CITY")
	private String city;
	
	@Transient
	private String x;
	
	@Column (name="Added_Date")
	@Temporal(TemporalType.DATE)
	private Date addedDate;
	
	@Lob
	private byte [] image;
	
	

	public int getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getX() {
		return x;
	}

	public void setX(String x) {
		this.x = x;
	}

	public Date getAddedDate() {
		return addedDate;
	}

	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public Address(int houseNo, String street, String city, String x, Date addedDate, byte[] image) {
		super();
		this.houseNo = houseNo;
		this.street = street;
		this.city = city;
		this.x = x;
		this.addedDate = addedDate;
		this.image = image;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
