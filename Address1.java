package org.login;

import javax.persistence.Column;

public class Address1 {
@Column(name="Address_FirstLine")
private String firstLine;
@Column(name="Address_SecondLine")
private String secondLine;
@Column(name="Address_City")
private String city;
@Column(name="Address_pinCode")
private long pinCode;
public String getFirstLine() {
	return firstLine;
}
public void setFirstLine(String firstLine) {
	this.firstLine = firstLine;
}
public String getSecondLine() {
	return secondLine;
}
public void setSecondLine(String secondLine) {
	this.secondLine = secondLine;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public long getPinCode() {
	return pinCode;
}
public void setPinCode(long pinCode) {
	this.pinCode = pinCode;
}
}

