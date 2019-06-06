/*
 * Implement a hashing utility class, MyHashMap utilizing the hashing method implemented in assignment 8.
The class should have these methods:
1) put ( key, value) --- store the value in the bucket
2) get ( key ) - retrieve the value from the bucket and returns it
3) remove (key) - remove the value form the bucket return true if it is successful
 * */

package com.bizleap.internship.assignments.common.collections.impl.test;
import java.util.List;
import java.util.Random;
import org.junit.Test;
import com.bizleap.internship.assignments.common.collections.Map;
import com.bizleap.internship.assignments.common.collections.impl.EntryImpl;
import com.bizleap.internship.assignments.common.collections.impl.HashMap;

public class HashMapTest {

	public HashMap populateMap(int size) { 
		HashMap myHashMap = new HashMap();
		for(int i=0; i<size; i++) {
			myHashMap.put(makeString(i+3), makeString(i));
		}
		return myHashMap;
	}

	public String makeString(int length) {
		String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		Random random = new Random();
		int size = alphabet.length();
		StringBuilder stringbuilder = new StringBuilder();
		
		for (int i = 0; i<length; i++) {
			stringbuilder.append(alphabet.charAt(random.nextInt(size)));
		}
		//System.out.println(sb);
		return stringbuilder.toString();
	}
	
	@Test
	public void hashMapTest() {
		//		HashMapTest HashMapTest= new HashMapTest();
		//		Map HashMap=HashMapTest.populateMap(30000);
		//		System.out.println("Current Capacity is : "+HashMap.getCapacity()+".");
		//
		//		Bucket[] buckets=HashMap.getAll();
		//		for(Bucket bucket:buckets){
		//    		if(!(bucket==null)){
		//    			System.out.print("{"+bucket.head.getKey()+","+bucket.head.getValue()+"} ");
		//    		}
		//    		else System.out.print(" null");
		//		}
		Map hashmap = new HashMap();
		hashmap.put("stzl", "San Thinzar Linn");
		hashmap.put("Alpine", "Alpine");
		hashmap.put("purity", "purity");
		hashmap.put("water", "water");
		hashmap.put("remote", "remote");
		hashmap.put("Drinking", "Drinking");
		System.out.println(hashmap);
		System.out.println(hashmap.get("stzl"));
		System.out.println(hashmap.get("Alpine"));
		System.out.println(hashmap.get("purity"));
		System.out.println(hashmap.get("water"));
		System.out.println(hashmap.get("remote"));
		System.out.println(hashmap.get("Drinking"));
		System.out.println(hashmap.remove("Drinking"));
		
		System.out.println(hashmap.contains("water"));
		List<EntryImpl> entryList = hashmap.getAll();
		System.out.println(entryList);
	}
}