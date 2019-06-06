package com.bizleap.internship;

import com.bizleap.intenship.common.collection.Set;
import com.bizleap.intenship.common.collection.impl.HashSet;

public class HashSetTest {
	public static void main(String[] args) {
		Set myHashSet = new HashSet();
		myHashSet.add("Nyan");
		myHashSet.add("Lin");
		myHashSet.add("Htet");
		myHashSet.add("Shine");
		myHashSet.add("Thuya");
		System.out.println(myHashSet.toString());
		System.out.println(myHashSet.contains("Lin"));
		System.out.println(myHashSet.remove("Htet"));
		System.out.println(myHashSet.getAll());
	}
}