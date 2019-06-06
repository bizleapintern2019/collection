package com.bizleap.internship.common.collection.impl.test;

import org.junit.Test;

import com.bizleap.internship.common.collection.Lifo;
import com.bizleap.internship.common.collection.impl.Stack;

public class StackTest {

	@Test
	public void stackTest() {
		
		Lifo stack=new Stack();
		
		stack.push("1");
		stack.push("2");
		stack.push("3");
		stack.push("4");
		stack.push("5");
		stack.push("6");
		stack.push("7");
		stack.push("8");
		stack.push("9");
		stack.push("10");
		stack.push("11");
		stack.push("12");
		stack.push("13");
		
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.getSize());
		System.out.println(stack.contains("13"));
		stack.clear();
		System.out.println(stack);

	}

}