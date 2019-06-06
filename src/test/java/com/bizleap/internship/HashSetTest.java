package com.bizleap.internship;

import org.junit.Test;

import com.bizleap.internship.common.collections.Set;
import com.bizleap.internship.common.collections.impl.HashSet;

public class HashSetTest {

	@Test
	public void hashSetTest() {
		Set myHashSet = new HashSet();
		myHashSet.add("Alpine");
		myHashSet.add("Cold");
		myHashSet.add("ear");
		myHashSet.add("Bottle");
		myHashSet.add("ear");
		System.out.println(myHashSet);
		System.out.println(myHashSet.contains("ear"));
		System.out.println(myHashSet.contains("Cold"));
		System.out.println(myHashSet.contains("Alpine"));
		System.out.println(myHashSet.contains("Bottle"));
		System.out.println(myHashSet.remove("Cold"));
		System.out.println(myHashSet);
	}
}
