package com.bizleap.internship.common.collections.impl.test;

import org.junit.Test;

import com.bizleap.internship.common.collections.Lifo;
import com.bizleap.internship.common.collections.impl.Stack;


public class StackTest {

	@Test
	public void stackTest() {
		Lifo stack= new Stack();
		stack.push("kcmt");
		stack.push("stzl");
		stack.push("ssdt");
		stack.push("spn");
		stack.push("ymz");
		stack.push("kzh");
		stack.push("kpsh");
		stack.push("nlh");
		stack.push("smt");
		stack.push("apple");
		stack.push("orange");
		stack.push("banana");
		stack.push("everything");
		stack.push("anything");
		stack.push("shirt");
		stack.push("mirror");
		stack.push("laptop");
		stack.push("glasses");
		System.out.println(stack);
		
//		for(int i=0;i<=stack.getSize();i++){
//			System.out.println(stack.pop());
//			System.out.println(stack.getCurrent());
//		}
//		System.out.println(stack);
		stack.clear();
		System.out.println(stack);
	}
}
