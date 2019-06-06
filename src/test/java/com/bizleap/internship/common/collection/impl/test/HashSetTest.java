package com.bizleap.internship.common.collection.impl.test;

import com.bizleap.internship.common.collection.impl.HashSet;

import org.junit.Test;

import com.bizleap.internship.common.collection.Set;

public class HashSetTest {

	@Test
	public void hashSetTest() {
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
