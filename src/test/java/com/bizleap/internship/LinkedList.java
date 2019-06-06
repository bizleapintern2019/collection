package com.bizleap.internship;

import com.bizleap.intenship.common.collection.Linked;
import com.bizleap.intenship.common.collection.impl.SinglyLinkedList;
import com.bizleap.intenship.common.collection.impl.SinglyNode;

public class LinkedList {
	public static void main(String[] args) {
		Linked list = new SinglyLinkedList();
		list.add(new SinglyNode("Shine"), 0);
		list.add(new SinglyNode("Wanna"), -122);
		list.add(new SinglyNode("Kyaw"), 2);
		list.add(new SinglyNode("Thuya"), 3);
		list.add(new SinglyNode("Aung"), 4);

		list.get();
		list.remove(3);
		list.get();
		list.remove(0);
		list.get();
	}
}