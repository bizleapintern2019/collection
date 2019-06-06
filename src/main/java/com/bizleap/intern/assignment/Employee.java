package com.bizleap.intern.assignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.StringTokenizer;


public class Employee extends FileRead{
	String firstName,lastName;
	int eid;
	public Employee(int eid,String fName,String lname){
		this.eid=eid;
		this.firstName=fName;
		this.lastName=lname;
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
	public  List<Employee> getEmployee(List<Employee> employee) throws IOException{
		BufferedReader br=new BufferedReader(new FileReader("E:\\bizleap english\\employeeinformation.txt"));
		String str;
		String firstName,lastName;
		int eid;
		while((str=br.readLine())!=null){
			StringTokenizer stringtokenizer=new StringTokenizer(str," ");
			eid=Integer.parseInt(stringtokenizer.nextToken());
			firstName=stringtokenizer.nextToken();
			lastName=stringtokenizer.nextToken();
			employee.add(new Employee(eid,firstName,lastName));
		}
		return employee;
		
	}
}
	

