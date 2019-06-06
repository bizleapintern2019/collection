package com.bizleap.internship.assignments.common.collections.impl.test;
import org.junit.Test;
import com.bizleap.internship.assignments.common.collections.Collections;
import com.bizleap.internship.assignments.common.collections.impl.LinkedListImpl;

public class LinkedListTest {
	
	public void insertData(Collections linkedList) {
		for(int i=0; i<100; i++) {
			linkedList.add("" + i);
		}
	}

	@Test
	public void linkedListTest() {
		Collections linkedList = new LinkedListImpl();
		insertData(linkedList);
		System.out.println(linkedList);
		System.out.println(linkedList.contains("50"));
		linkedList.clear();
		System.out.println(linkedList);
	}
}