package com.bizleap.internship.assignments.common.collections.impl.test;

import org.junit.Test;

import com.bizleap.internship.assignments.common.collection.Set;
import com.bizleap.internship.assignments.common.collections.impl.HashSet;
import com.bizleap.internship.assignments.common.collections.impl.HashMap;

public class HashSetTest {
	

	public static void main(String[] args) {
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


