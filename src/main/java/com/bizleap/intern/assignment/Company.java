package com.bizleap.intern.assignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.StringTokenizer;

public class Company extends FileRead {
	String cName;
	int cid;
	
	public Company(int cid,String cname){
	this.cid=cid;
	this.cName=cname;
	}
	public String getCompanyName(){
		return cName;
	}
	public int getCid(){
		return cid;
	}
	public  List<Company> getCompany(List<Company> company)throws IOException{
		String strCompany;
		String cName;
		int cid;
		BufferedReader brCompany=new BufferedReader(new FileReader("E:\\bizleap english\\companyinformation.txt"));
		while((strCompany=brCompany.readLine())!=null){
			StringTokenizer st=new StringTokenizer(strCompany," ");
			cid=Integer.parseInt(st.nextToken());
			cName=st.nextToken();
			company.add(new Company(cid,cName));
		}
		return company;
	}
}



