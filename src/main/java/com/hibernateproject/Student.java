package com.hibernateproject;

import java.util.Scanner;

import javax.persistence.*;


@Entity
public class Student {
	
	@Id
	private int id;
	private String name;
	private long mobileNo;
	private String email;
	private String city;
	public Student() {
		super();
		this.id = id;
		this.name = name;
		this.mobileNo = mobileNo;
		this.email = email;
		this.city = city;
		
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.id + ":" + this.name + ":" + this.mobileNo + ":" + this.email + ":" + this.city;
	}
	
	
	
}
