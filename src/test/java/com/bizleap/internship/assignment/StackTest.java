package com.bizleap.internship.assignment;

import com.bizleap.internship.common.collections.impl.StackImpl;

public class StackTest {

	public static void main(String[] args) {
		
		StackImpl stackImpl=new StackImpl();
		stackImpl.push("Soe");
		stackImpl.push("Min");
		stackImpl.push("Thein");
		stackImpl.push("Kaung");
		stackImpl.push("Pyae");
		stackImpl.push("Sone");
		stackImpl.push("Htun");
		System.out.println(stackImpl.pop());
		System.out.println(stackImpl.pop());
		System.out.println(stackImpl.pop());
		System.out.println(stackImpl.pop());
		System.out.println(stackImpl.pop());
		System.out.println(stackImpl.pop());
		System.out.println(stackImpl.pop());
		System.out.println(stackImpl.pop());
		stackImpl.display();
		
	}

}
