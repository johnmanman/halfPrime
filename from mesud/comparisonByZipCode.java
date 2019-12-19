package org.learn.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Application {

// TODO: sort the list using the zip code of the mailing address;

// there are two ways to compare Student objects in the list: 
//1. by creating a new class that implements comparator() 
// 2. by making the Address class implements comparable
}






package org.learn.java;

public class Address implements Comparable<Address> {
	// general - fix the class if there is any issue

	private int streetNumber;
	private String streetName;
	private String steetName2; // optional
	private String city;
	private String state;
	private int zipcode;

	public Address(int streetNumber, String streetName, String steetName2, String city, String state, int zipcode) {
		super();
	}

	// set the values before using them; otherwise it prints nulls and 0's;
	public Address(int streetNumber, String streetName, String city, String state, int zipcode) {
		super();
		this.streetNumber = streetNumber;
		this.streetName = streetName;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}

	public int getStreetNumber() {
		return streetNumber;
	}

	public void setStreetNumber(int streetNumber) {
		this.streetNumber = streetNumber;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getSteetName2() {
		return steetName2;
	}

	public void setSteetName2(String steetName2) {
		this.steetName2 = steetName2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	@Override
	public String toString() {
		return "Address [streetNumber=" + streetNumber + ", streetName=" + streetName + ", steetName2=" + steetName2
				+ ", city=" + city + ", state=" + state + ", zipcode=" + zipcode + "]";
        
        
        
        @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + zipcode;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		if (zipcode != other.zipcode)
			return false;
		return true;
	}
	}



