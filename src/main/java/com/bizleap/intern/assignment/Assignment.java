
/*Implement a hashing utility class, MyHashMap utilizing the hasing method implemented in assignment 8.*/

package com.bizleap.intern.assignment;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Assignment {
	static String st="Hello";
 public static void main(String[] args) {
	 HashMap<String,Object> map=new LinkedHashMap<String,Object>();
	/* Scanner sc=new Scanner(System.in);
	 System.out.println("Enter a string");
	 String st=sc.nextLine();*/
	// String string="Hello"
	 int i;
	 for( i=0;i<=255;i++){
	 	String num=Integer.toString(i);
	 	map.put(num,st);
	 }


	 String[] strs=map.keySet().toArray(new String[map.size()]);
	 for(String str:strs){
	 	System.out.println(str);
	 }
	 	}




	}


