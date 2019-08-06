package com.cgi.model;

import java.io.Serializable;

public class Employee implements Serializable {
private int id;
private String name;
private int basic;



public Employee() {
	super();
	// TODO Auto-generated constructor stub
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
public int getBasic() {
	return basic;
}
public void setBasic(int basic) {
	this.basic = basic;
}

}