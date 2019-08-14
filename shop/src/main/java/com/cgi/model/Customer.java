package com.cgi.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer_details")
public class Customer {
@Id
private String firstname;
private String address;
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}

}
