package com.bizleap.internship.assignment;

import org.junit.Test;

import com.bizleap.internship.common.collections.LinkedList;
import com.bizleap.internship.common.collections.impl.LinkedListImpl;

public class LinkedListTest1 {
	@Test
	public void main() {
		LinkedList linkedList=new LinkedListImpl();
		linkedList.add("Kaung");
		linkedList.add("Pyae");
		linkedList.add("Sone");
		linkedList.add("Tun");
		linkedList.add("Kaung Pyae Sone Tun");
		
		System.out.println("Print: LinkedList: " + linkedList);
		System.out.println("LinkedList size is " + linkedList.size());
		System.out.println("Print item at index 3: : " + linkedList.get(3));
		System.out.println("Check item at index 2: " + linkedList.hasContain(2));
		System.out.println("Remove item at index 2: " + linkedList.remove(2) + " (element removed)");
		System.out.println("Print item at index 3 " + linkedList.get(3) );
		System.out.println("Removed LinkedList  size is " + linkedList.size());
		System.out.println("Print again: LinkedList: " + linkedList);
	}
}
