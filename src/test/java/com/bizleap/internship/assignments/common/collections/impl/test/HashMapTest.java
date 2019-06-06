package com.bizleap.internship.assignments.common.collections.impl.test;

import java.util.HashSet;
import java.util.List;
import java.util.Random;

import org.junit.Test;

import com.bizleap.internship.assignments.common.collection.Map;
import com.bizleap.internship.assignments.common.collections.impl.EntryImpl;
import com.bizleap.internship.assignments.common.collections.impl.HashMap;

public class HashMapTest {

	public Map populateMap(int size) {
		Map myMap = new HashMap();
		for (int i = 0; i < size; i++) {
			myMap.put(makeString(i + 3), "" + i);
		}
		return myMap;
	}

	public String makeString(int length) {
		String ALPHABET = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int size = ALPHABET.length();
		Random random = new Random();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < length; i++) {
			sb.append(ALPHABET.charAt(random.nextInt(size)));
		}
		// System.out.println(sb);
		return sb.toString();
	}

	@Test
	public void hashMapTest() {

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

	}
}
