package com.bizleap.intersnip.common;

public class Company extends Information {
	String name,address,phone,email,CEO;
	public Company(String name,String address,String phone,String email,String CEO) {
		this.name=name;
		this.address=address;
		this.phone=phone;
		this.email=email;
		this.CEO=CEO;
	}
	public Company() {
		// TODO Auto-generated constructor stub
	}
	public void displayInfo() {
		System.out.println(name+"\t"+address+"\t"+phone+"\t"+email+"\t"+CEO);
	}

}
