package com.bizleap.internship.common.collection.impl.test;
import java.util.Random;

import org.junit.Test;

import com.bizleap.internship.common.collection.impl.HashMap;
import com.bizleap.internship.common.collections.Map;

public class HashMapTest{

	public Map populateMap(int size){

		Map myMap =  new HashMap();
		for(int i =0; i<size;i++){
			myMap.put(makeString(i+3),""+makeString(i));
		}
		return myMap;
	}

	public String makeString(int length){


		String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "abcdefghijklmnopqrstuvxyz";
		Random random = new Random();
		int size = alphabets.length();
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < length; i++){ 
			sb.append(alphabets.charAt(random.nextInt(size))); 
		} 
		return sb.toString(); 
	}
	
//	@Test
	public void hashMapTest(){

		Map myMap =new HashMap();
		myMap=new HashMapTest().populateMap(100);
		System.out.println(myMap.getAll());
		System.out.println("Current capacity is ="+myMap.getCapacity()+".");



	}
}
