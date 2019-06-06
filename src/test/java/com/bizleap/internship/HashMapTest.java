package com.bizleap.internship;

import com.bizleap.intenship.common.collection.Map;
import com.bizleap.intenship.common.collection.impl.EntryImpl;
import com.bizleap.intenship.common.collection.impl.HashMap;
import java.util.List;
import java.util.Random;

import org.junit.Test;

public class HashMapTest {
	
public HashMap populateMap(int size) { 
		
		HashMap myHashMap= new HashMap();
		myHashMap.put("Nyan", "NyanLinHtet");
		myHashMap.put("yNan", "ThuyaOo");
		myHashMap.put("Shine", "ShineWanna");
		for(int i=0; i<size; i++) {
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
	public  void hashMapTest() {
		Map hashmap = new HashMap();
		hashmap.put("nyan", "nyanlinhtet");
		hashmap.put("shine", "shinewanna");
		hashmap.put("soe", "soeminthein");
		hashmap.put("kaung", "kaungpyaesone");
		hashmap.put("water", "sea");
		hashmap.put("winter", "snow");
		hashmap.put("summer", "hot");
		hashmap.put("drink", "coffee");
		System.out.println(hashmap.remove("water"));
		List<EntryImpl> entryList = hashmap.getAll();
		System.out.println(entryList);
		
//		if(myHashSet.contains("NyanLinHtet"))
//			System.out.println("\nIt is exist");
//		else System.out.println("Not Exist");
//		
//		if(myHashSet.remove("ThuyaOo"))
//			System.out.println("Remove successful");
//		if(myHashSet.contains("SoeMinThein"))
//			System.out.println("\nIt is exist");
//		else System.out.println("Not Exist");
	}
}