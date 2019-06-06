//package com.bizleap.internship.assignment;
//import java.util.Random;
//
//import com.bizleap.internship.common.collecitons.Map;
//
//public class HashMapTest {
//
//	public Map populateMap(int size) {
//		Map myMap= new HashMap();
//		for(int i=0; i<size; i++){
//			myMap.put(makeString(i+3), ""+i);
//		}
//		return myMap;
//		
//	}
//
//	public String makeString(int length) {
//		String ALPHABET = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
//		int size= ALPHABET.length();
//		Random random = new Random();
//		StringBuilder sb = new StringBuilder();
//		for (int i = 0; i < length; i++) {
//			sb.append(ALPHABET.charAt(random.nextInt(size)));
//		}
//		//System.out.println(sb);
//		return sb.toString();
//	}
//
//	public static void main(String[] args) {
//		//		MyHashMapTest myHashMapTest= new MyHashMapTest();
//		//		MyMap myHashMap=myHashMapTest.populateMap(30000);
//		//		System.out.println("Current Capacity is : "+myHashMap.getCapacity()+".");
//		//
//		//		Bucket[] buckets=myHashMap.getAll();
//		//		for(Bucket bucket:buckets){
//		//    		if(!(bucket==null)){
//		//    			System.out.print("{"+bucket.head.getKey()+","+bucket.head.getValue()+"} ");
//		//    		}
//		//    		else System.out.print(" null");
//		//		}
//		Map hashmap = new HashMap();
//		hashmap.put("kcmt", "khinchanmyaethu");
//		hashmap.put("Alpine", "Alpine");
//		hashmap.put("purity", "purity");
//		hashmap.put("water", "water");
//		hashmap.put("p", "promises");
//		hashmap.put("remote", "remote");
//		hashmap.put("drink","Drinking");
//		System.out.println(hashmap.get("kcmt"));
//		System.out.println(hashmap.get("Alpine"));
//		System.out.println(hashmap.get("purity"));
//		System.out.println(hashmap.get("water"));
//		System.out.println(hashmap.get("p"));
//		System.out.println(hashmap.get("remote"));
//		System.out.println(hashmap.get("Drinking"));
//		System.out.println(hashmap.toString());
//		System.out.println(hashmap.contains("kcmt"));
//
//
//	}
//
//}
