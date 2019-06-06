package com.bizleap.internship.common.collections.impl.test;

import org.junit.Test;

import com.bizleap.internship.common.collection.Collections;
import com.bizleap.internship.common.collections.impl.LinkedList;

public class LinkedListTest {
	
	public void insertData(Collections linkedList) {
		for(int i=0; i<100; i++) {
			linkedList.add("" + i);
		}
	}

	@Test
	public void linkedListTest() {
		Collections linkedList = new LinkedList();
		insertData(linkedList);
		System.out.println(linkedList);
		System.out.println(linkedList.contains("55"));
		linkedList.clear();
		System.out.println(linkedList);
	}
}
