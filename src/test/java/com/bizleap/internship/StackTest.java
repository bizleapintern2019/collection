package com.bizleap.internship;

import org.junit.Test;

import com.bizleap.intenship.common.collection.Lifo;
import com.bizleap.intenship.common.collection.impl.StackImpl;

public class StackTest {
	@Test
	public  void StackTestImpl() {
		Lifo stack=new StackImpl();
		stack.push("Nyan");
		stack.push("Lin");
		stack.push("Htet");
		stack.push("Yangon");
		stack.push("ManC");
		stack.push("Man");
		stack.push("women");
		stack.push("cat");
		stack.push("dog");
		stack.push("cow");
		
		System.out.println("All items are: "+stack);
		System.out.println("Remove item is: "+stack.pop());
		System.out.println("After removing items are: "+stack);
		System.out.println(stack.getSize());
		stack.clear();
		System.out.println(stack);
	}
}