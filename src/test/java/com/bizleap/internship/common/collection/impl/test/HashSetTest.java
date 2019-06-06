package com.bizleap.internship.common.collection.impl.test;

import com.bizleap.internship.common.collection.impl.HashSet;
import com.bizleap.internship.common.collection.Set;

public class HashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set myHashSet = new HashSet();
		myHashSet.add("Wolf");
		myHashSet.add("Cow");
		myHashSet.add("Dear");
		myHashSet.add("Goat");
		System.out.println(myHashSet.contains("Dear"));
		System.out.println(myHashSet.remove("Dear"));
		System.out.println(myHashSet.getAll());
	}
}
