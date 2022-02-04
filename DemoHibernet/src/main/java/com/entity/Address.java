package com.entity;

import javax.persistence.Embeddable;

@Embeddable
public class Address {

private String Address1;
private String city;
private String landmark;

public String getAddress1() {
	return Address1;
}
public Address() {
	super();
	// TODO Auto-generated constructor stub
}
public void setAddress1(String address1) {
	Address1 = address1;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getLandmark() {
	return landmark;
}
public void setLandmark(String landmark) {
	this.landmark = landmark;
}
@Override
public String toString() {
	return "Address [Address1=" + Address1 + ", city=" + city + ", landmark=" + landmark + "]";
}
public Address(String address1, String city, String landmark) {
	super();
	Address1 = address1;
	this.city = city;
	this.landmark = landmark;
}


}
