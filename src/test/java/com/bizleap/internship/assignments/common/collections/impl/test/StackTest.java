package com.bizleap.internship.assignments.common.collections.impl.test;
import org.junit.Test;
import com.bizleap.internship.assignments.common.collections.Lifo;
import com.bizleap.internship.assignments.common.collections.impl.Stack;

public class StackTest {

	@Test
	public void stackTest() {
		Lifo stack= new Stack();
		stack.push("stzl");
		stack.push("kcmt");
		stack.push("ssdt");
		stack.push("spn");
		stack.push("kzh");
		stack.push("smt");
		stack.push("tyo");
		stack.push("water bottle");
		stack.push("lunch box");
		stack.push("coverage");

		System.out.println(stack);

//		for(int i=0; i<=stack.getSize(); i++) {
//			System.out.println(stack.pop());
//		}
//		System.out.println(stack);
		stack.clear();
		System.out.println(stack);
		//System.out.println("current= "+stackImpl.getCurrent());
		//System.out.println("size= "+stackImpl.getSize());
	}
}