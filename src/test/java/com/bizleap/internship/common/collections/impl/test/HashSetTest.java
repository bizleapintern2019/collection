package com.bizleap.internship.common.collections.impl.test;

import org.junit.Test;

import com.bizleap.internship.common.collection.Set;
import com.bizleap.internship.common.collections.impl.HashSet;

public class HashSetTest {
@Test
	public void hashSetTest() {
		Set myHashSet = new HashSet();
		myHashSet.add("PineApple");
		myHashSet.add("Cold");
		myHashSet.add("eye");
		myHashSet.add("Water");
		myHashSet.add("eye");
		System.out.println(myHashSet.getAll());
		System.out.println(myHashSet.contains("Water"));
		System.out.println(myHashSet.getCapacity());
	}
}