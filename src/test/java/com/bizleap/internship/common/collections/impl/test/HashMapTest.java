/*
Implement a hashing utility class, MyHashMap utilizing the hashing method implemented in assignment 8.

The class should have these methods:
1) put ( key, value) --- store the value in the bucket
2) get ( key ) - retrieve the value from the bucket and returns it
3) remove (key) - remove the value form the bucket return true if it is successful

References:
    how is hashmap internally implemented in java using linkedlist or array
    Custom HashMap in Java
 */

package com.bizleap.internship.common.collections.impl.test;

import java.util.Random;

import org.junit.Test;

import com.bizleap.internship.common.collection.Map;
import com.bizleap.internship.common.collections.impl.HashMap;

public class HashMapTest {

	public Map populateMap(int size) {
		Map myMap= new HashMap();
		for(int i=0; i<size; i++){
			myMap.put(makeString(i+3), ""+i);
		}
		return myMap;
	}

	public String makeString(int length) {
		String ALPHABET = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int size= ALPHABET.length();
		Random random = new Random();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < length; i++) {
			sb.append(ALPHABET.charAt(random.nextInt(size)));
		}
		//System.out.println(sb);
		return sb.toString();
	}
	@Test
	public void HashMapImpl() {
		//		MyHashMapTest myHashMapTest= new MyHashMapTest();
		//		MyMap myHashMap=myHashMapTest.populateMap(30000);
		//		System.out.println("Current Capacity is : "+myHashMap.getCapacity()+".");
		//
		//		Bucket[] buckets=myHashMap.getAll();
		//		for(Bucket bucket:buckets){
		//    		if(!(bucket==null)){
		//    			System.out.print("{"+bucket.head.getKey()+","+bucket.head.getValue()+"} ");
		//    		}
		//    		else System.out.print(" null");
		//		}
		Map hashmap = new HashMap();
		hashmap.put("sst", "sawsanditin");
		hashmap.put("Alpine", "Alpine");
		hashmap.put("purity", "purity");
		hashmap.put("water", "water");
		hashmap.put("p", "promises");
		hashmap.put("remote", "remote");
		hashmap.put("Drinking", "Drinking");
		System.out.println(hashmap.get("sst"));
		System.out.println(hashmap.get("Alpine"));
		System.out.println(hashmap.get("purity"));
		System.out.println(hashmap.get("water"));
		System.out.println(hashmap.get("p"));
		System.out.println(hashmap.get("remote"));
		System.out.println(hashmap.get("Drinking"));
		System.out.println(hashmap.toString());
		System.out.println("**************************");

		//		List<EntryImpl> entry = hashmap.getAll();
		//		for(EntryImpl e:entry){
		//			System.out.println("{"+e.getKey().toString()+","+e.getValue().toString());
		//		}
		//
		//		System.out.println(entry.toString());
	}
}
