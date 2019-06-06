package com.bizleap.internship.assignment;

import com.bizleap.internship.common.collections.impl.LinkedListIImpl;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedListIImpl list=new LinkedListIImpl();
		list.add("Soe");
		list.add("Min");
		list.add("Thein");
		list.add("Kaung",2);
		System.out.println(list.toString());
		System.out.println(list.get(3));
		System.out.println(list.remove(3));
		System.out.println(list.get(3));
		System.out.println(list.toString());
		list.add("Pyae",0);
		list.add("Sone",4);
		list.add("Sone",9);
		System.out.println(list.toString());
	}

}
