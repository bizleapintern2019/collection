package com.bizleap.internship.assignments.common.collections.impl.test;
import com.bizleap.internship.assignments.common.collections.Set;
import com.bizleap.internship.assignments.common.collections.impl.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		Set myHashSet = new HashSet();
		myHashSet.add("Alpine");
		myHashSet.add("Cold");
		myHashSet.add("Water");
		myHashSet.add("Bottle");
		myHashSet.add("Water");
		System.out.println(myHashSet);
		System.out.println(myHashSet.contains("Alpine"));
		System.out.println(myHashSet.remove("Cold"));
		System.out.println(myHashSet.getAll());
	}
}