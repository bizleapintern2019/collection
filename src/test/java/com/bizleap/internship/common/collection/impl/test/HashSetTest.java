package com.bizleap.internship.common.collection.impl.test;

//import org.junit.Test;

import com.bizleap.internship.common.collection.impl.HashSet;
import com.bizleap.internship.common.collections.Set;

public class HashSetTest{
	
	//@Test
	public static void main(String args[]){

		Set hashSet=new HashSet();
		hashSet.add("Phyumonthant");
		hashSet.add("Kaungsankyaw");
		hashSet.add("Shinewana");
		hashSet.add("Kayzinhan");
		hashSet.add("Thihanhein");
		hashSet.add("Thuraoo");
		hashSet.add("Nyanlinhtet");
		hashSet.add("Yamonezin");
		hashSet.add("Yamonezin");
		hashSet.add("KhinChanMyae");
		hashSet.add("KaungPyaeSone");
		hashSet.add("Soeminthein");
		hashSet.add("Santhinzar");
		hashSet.add("Sawsandi");
		hashSet.add("Supyaenaing");
		System.out.print(hashSet);

		if(hashSet.contains("Yamonezin"))
			System.out.println("\nIt is exist");
		else System.out.println("Not Exist");

		if(hashSet.remove("Yamonezin"))
			System.out.println("Remove successful");
		System.out.println(hashSet.getAll());

	}
}
