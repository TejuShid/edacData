package com.pack.model;

public class Student {
	private Integer studId;
	private String  studName;
	private String  studClass;
	private String  email;
	private String  address;



	
	/*public String getAddss() {
		return addss;
	}
	public void setAddss(String addss) {
		this.addss = addss;
		
	}	*/
	
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	public Integer getStudId() {
		return studId;
	}
	
	public void setStudId(Integer studId) {
		this.studId = studId;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public String getStudClass() {
		return studClass;
	}
	public void setStudClass(String studClass) {
		this.studClass = studClass;
	}
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
