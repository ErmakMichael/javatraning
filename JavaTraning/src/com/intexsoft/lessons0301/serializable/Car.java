package com.intexsoft.lessons0301.serializable;

import java.io.Serializable;

public class Car implements Serializable{

	private static final long serialVersionUID = 5770891494809668123L;
	
	private String brand;
	private int year;
	private transient Object object = new Object();
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	
	
}
