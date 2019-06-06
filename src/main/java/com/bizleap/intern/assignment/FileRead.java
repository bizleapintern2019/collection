package com.bizleap.intern.assignment;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import com.bizleap.intern.assignment.FileReading.Company;
import com.bizleap.intern.assignment.FileReading.Employee;

public class FileRead {
	public String getResult(List<Employee> employee,List<Company> company){
		String result="";
		for(Company companyItem :company){
			for(Employee employeeItem:employee){
				if(companyItem.getCid()==employeeItem.getEid())
					result+=employeeItem.getFirstName()+" "+employeeItem.getLastName()+" "+
					"work for"+" "+companyItem.getCompanyName() + "\n";
			}
		}
		return result;
	}
		public static void main(String[] args)throws IOException {
			List<Employee> employees=new ArrayList<Employee>();
			List<Company> companys=new ArrayList<Company>();
			FileReading ad=new FileReading();
			System.out.println(ad.getResult(ad.getEmployee(employees),ad.getCompany(companys)));
			
		}
}		
			
			
	



