package com.bizleap.internship.assignments.common.collections.impl.test;

import com.bizleap.intern.assignment.collections.impl.LinkedListImpl;
import com.bizleap.internship.assignments.common.collection.Collections;

public class LinkedListTest {

	public static void main(String[] args) {
		Collections myLinkedList=new LinkedListImpl();
		myLinkedList.add("Apple");
		myLinkedList.add("Orange");
		myLinkedList.add("Hsu Hsu");
		myLinkedList.add("Saw");
		myLinkedList.add("Kayzin");
		myLinkedList.add("San");
		myLinkedList.add("Khin");
		System.out.println("The node addeed in the linked list is "+myLinkedList);
	    myLinkedList.display();
	    myLinkedList.search("khin");
	    System.out.println("The node get int the linked list is "+myLinkedList.get("Saw"));
	    System.out.println("The node remove in the linked list "+myLinkedList.remove("San"));
	    myLinkedList.clear();

	}

}


