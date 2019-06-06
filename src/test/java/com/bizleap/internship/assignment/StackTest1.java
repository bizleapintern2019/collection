package com.bizleap.internship.assignment;



import org.junit.Test;

import com.bizleap.internship.common.collections.Stack;
import com.bizleap.internship.common.collections.impl.StackImpl;


public class StackTest1 {
	@Test
	public void test () {
		// TODO Auto-generated method stub
		Stack stack=new StackImpl();
		stack.push("Kaung");
		stack.push("Pyae");
		stack.push("Sone");
		stack.push("Tun");
		stack.push("a");
		System.out.println(stack.size());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		stack.clear();
		System.out.println(stack.pop());
	}

}
