package com.bizleap.intersnip.common;

public class Employee extends Information {
	String ename,age,title,salary,email,phone;
	public Employee(String ename,String age,String title,String salary,String email,String phone) {
		this.ename=ename;this.age=age;this.title=title;this.salary=salary;this.email=email;this.phone=phone;
	}

	public void displayInfo() {
		System.out.println(ename+"\t"+age+"\t"+title+"\t"+salary+"\t"+email+"\t"+phone+"\n");
	}

}
