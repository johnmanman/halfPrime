
// TODO: sort the list using the zip code of the mailing address;
//Answer
// implement Comparator in Address class;
implement the unimplemented compare method to compare according to Zip Code;
(Overriden below - you can see it down);

//call the Collections.sort(list, new Address());
import Collections from java.util;
run it;




package org.learn.java;

import java.util.Comparator;

public class Address implements Comparator<Address> {
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
	}

	@Override
	public int compare(Address o1, Address o2) {
		// TODO Auto-generated method stub
		if((o1.zipcode -o2.getZipcode())>0 ) return 1;
		if((o1.zipcode -o2.getZipcode())<0 ) return -1;
		else return 0;
	}


}
