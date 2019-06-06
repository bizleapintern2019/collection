package com.bizleap.internship.common.collection.impl.test;

import org.junit.Test;

import com.bizleap.internship.common.collection.Lifo;
import com.bizleap.internship.common.collection.impl.StackImpl;

public class StackTest {

	@Test
	public  void StackTestImpl() {
		// TODO Auto-generated method stub
		Lifo stack = new StackImpl();
		stack.push("Hello1");
		stack.push("Hello2");
		stack.push("Hello3");
		stack.push("Hello4");
		stack.push("Hello5");
		stack.push("Hello6");
		stack.push("Hello7");
		stack.push("Hello8");
		stack.push("Hello9");
		stack.push("Hello10");

		System.out.println(stack.pop());
		System.out.println(stack.toString());
		System.out.println(stack.contain("Hello10"));
		System.out.println(stack.getSize());
		stack.clear();
		System.out.println(stack.toString());
	}

}
