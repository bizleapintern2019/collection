package com.bizleap.internship.common.collection.impl.test;

import com.bizleap.internship.common.collections.Stack;

import org.junit.Test;

import com.bizleap.internship.common.collection.impl.StackImpl;

public class StackTest{
//	@Test
	public void stackTest(){
		Stack stack = new StackImpl();
		stack.add("Kaung San Kyaw");
		stack.add("Phyu Mon Thant");
		stack.add("Ya Mone Zin");
		stack.add("Kaung Pyae Sone Tun");
		stack.add("Soe Min Thein");
		stack.add("Thura Oo");
		System.out.println("Original stack size: " + stack.size());
//		stack.clear();
		for(int i =stack.getSize();i>=-3;i--){
			System.out.println(stack.poll());
			System.out.println("After pop item: " + stack.size());
		}

		System.out.println(stack);
	}
}
