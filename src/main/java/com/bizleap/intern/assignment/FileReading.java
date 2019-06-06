/*1) There are three persons and three companies (you can add more)

Alice Kim -- works for Apple
Bob Gilman -- works for IBM
John Mark -- works for Adobe

Write a java program that will read from a file the above employees' first name, last name, age, title,
salary, email, phone ( add more fields to above people) as well as to read the company names, address, phone, email, CEO (make up some one for each company) from a second file and print out the company then it's employee(s) for all companies.

2) In the above assignment #4, find out what commonality do those two entity classess

have and reimplement it by using the inheritance features of Java.
*/
package com.bizleap.intern.assignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class FileReading {
	
 public class Employee{
	String firstName,lastName,title,email,phone;
	int eid,age,salary;
	public Employee(int eid,String fName,String lname,int age,String title,int salary,String email,String phone){
		this.eid=eid;
		this.firstName=fName;
		this.lastName=lname;
		this.age=age;
		this.title=title;
		this.salary=salary;
		this.email=email;
		this.phone=phone;
	}
	public String getFirstName(){
		return firstName;
	}
	public String getLastName(){
		return lastName;
	}
	public int getEid(){
		return eid;
	}
}
 
 public class Company{
	String cName,address,phone,email,ceo;
	int cid;
	public Company(int cid,String cname,String address,String phone,String email,String ceo){
		this.cid=cid;
		this.cName=cname;
		this.address=address;
		this.phone=phone;
		this.email=email;
		this.ceo=ceo;
	}
	public String getCompanyName(){
		return cName;
	}
	public int getCid(){
		return cid;
	}
 }

 public  List<Employee> getEmployee(List<Employee> employee) throws IOException{
	BufferedReader br=new BufferedReader(new FileReader("E:\\bizleap english\\employeeinformation.txt"));
	String data;
	String firstName,lastName,title,email,phone;
	int eid,age,salary;
	while((data=br.readLine())!=null){
		StringTokenizer stringtokenizer=new StringTokenizer(data," ");
		eid=Integer.parseInt(stringtokenizer.nextToken());
		firstName=stringtokenizer.nextToken();
		lastName=stringtokenizer.nextToken();
		age=Integer.parseInt(stringtokenizer.nextToken());
		title=stringtokenizer.nextToken();
		salary=Integer.parseInt(stringtokenizer.nextToken());
		email=stringtokenizer.nextToken();
		phone=stringtokenizer.nextToken();
		employee.add(new Employee(eid,firstName,lastName,age,title,salary,email,phone));
	}
	return employee;
 }
 
public  List<Company> getCompany(List<Company> company)throws IOException{
	BufferedReader brCompany=new BufferedReader(new FileReader("E:\\bizleap english\\companyinformation.txt"));
	String strCompany;
	String cName,address,phone,email,ceo;
	int cid;
	while((strCompany=brCompany.readLine())!=null){
		StringTokenizer stCompany=new StringTokenizer(strCompany," ");
		cid=Integer.parseInt(stCompany.nextToken());
		cName=stCompany.nextToken();
		address=stCompany.nextToken();
		phone=stCompany.nextToken();
		email=stCompany.nextToken();
		ceo=stCompany.nextToken();
		company.add(new Company(cid,cName,address,phone,email,ceo));
	}
	return company;
}

public String getResult(List<Employee> employee,List<Company> company){
	String result="";
	for(Company companyItem :company){
		for(Employee employeeItem:employee){
			if(companyItem.getCid()==employeeItem.getEid())
				result+=(employeeItem.getFirstName()+" "+employeeItem.getLastName()+" "+
						"work for"+" "+companyItem.getCompanyName()+ "\n");
		}
	}
	return result;
}
	
	public static void main(String[] args) throws IOException{
		List<Employee> employeelist=new ArrayList<Employee>();
		List<Company> companylist=new ArrayList<Company>();
		FileReading fileRead=new FileReading();
		System.out.println(fileRead.getResult(fileRead.getEmployee(employeelist),fileRead.getCompany(companylist)));
	}
}
