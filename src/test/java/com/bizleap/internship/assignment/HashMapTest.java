package com.bizleap.internship.assignment;

import java.util.Random;

import org.junit.Test;

import com.bizleap.internship.common.collections.Map;
import com.bizleap.internship.common.collections.Set;
import com.bizleap.internship.common.collections.impl.HashMap;
import com.bizleap.internship.common.collections.impl.HashSet;

public class HashMapTest {

	public Map populateMap(int size) { 

		HashMap myHashMap= new HashMap();
		for(int i=0; i<size; i++){
			myHashMap.put(makeString(i+1), makeString(i));
		}
		return myHashMap;
	}

	public String makeString(int length) {

		String ALPHABET = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		Random random = new Random();
		int size=ALPHABET.length();
		StringBuilder stringbuilder = new StringBuilder();
		for (int i = 0; i < length; i++) {
			stringbuilder.append(ALPHABET.charAt(random.nextInt(size)));
		}
		//System.out.println(sb);
		return stringbuilder.toString();
	}

	@Test
	public void test() {
//		HashingTest hashingImpl= new HashingTest();
//		Map myHashMap= hashingImpl.populateMap(100);
		Map myHashMap = new HashMap();
		myHashMap.put("First Insert", "First");
		myHashMap.put("First Insert", "Second");
//		System.out.println(myHashMap.get("First Insert"));
	//	System.out.println(myHashMap.getAll());
		System.out.println(myHashMap.toString());
		System.out.println("\nCapacity: "+myHashMap.getCapacity());

		Set myHashSet=new HashSet();
		myHashSet.add("Kaung");
		myHashSet.add("Pyae");
		myHashSet.add("Sone");

		if(myHashSet.contains("Kaung"))
			System.out.println("\nIt is exist");
		else System.out.println("\nNot Exist");
		if(myHashSet.remove("Pyae"))
			System.out.println("Remove successful");
		if(myHashSet.contains("a"))
			System.out.println("\nIt is exist");
		else System.out.println("Not Exist");
		//System.out.println(myHashSet.getAll());
	}
}
