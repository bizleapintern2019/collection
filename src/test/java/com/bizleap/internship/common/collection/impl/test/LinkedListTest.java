package com.bizleap.internship.common.collection.impl.test;

import org.junit.Test;

import com.bizleap.internship.common.collection.LinkedList;
import com.bizleap.internship.common.collection.impl.LinkedListImpl;

public class LinkedListTest {

	public void dataInput(LinkedList linkedList) {
		for(int i=0; i<100; i++) {
			linkedList.add("Hello" + i);
		}
	}

	@Test
	public void linkedListTest() {
		LinkedList linkedList = new LinkedListImpl();
		dataInput(linkedList);
		System.out.println(linkedList);
		System.out.println(linkedList.contains("Hello55"));
		linkedList.clear();
		System.out.println(linkedList);
	}
}
