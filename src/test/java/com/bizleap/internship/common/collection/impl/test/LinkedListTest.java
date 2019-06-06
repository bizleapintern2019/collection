package com.bizleap.internship.common.collection.impl.test;



import org.junit.Test;

import com.bizleap.internship.common.collection.impl.LinkedListImpl;
import com.bizleap.internship.common.collections.Collection;

public class LinkedListTest {
	
	@Test
	public void LinkedListTest(){
		Collection linkedList= new LinkedListImpl();
		linkedList.add("Orange");
		linkedList.add("apple");
		linkedList.add("banana");
		linkedList.add("peach");
		linkedList.add("pineapple");
		System.out.println(linkedList.contains("peach"));
		linkedList.remove("banana");
		linkedList.clear();
		System.out.println(linkedList);

	}
}
