package com.bizleap.internship.assignments.common.collections.impl.test;

import org.junit.Test;

import com.bizleap.internship.assignments.common.collection.Collection;
import com.bizleap.internship.assignments.common.collection.Stack;
import com.bizleap.internship.assignments.common.collections.impl.StackImpl;

public class StackTest {

	public static void main(String[] args) {
		Stack myStack= new StackImpl();
		myStack.push("Hsu");
		myStack.push("Saw Sandi");
		myStack.push("KayZin");
		myStack.push("Khin");
		myStack.push("San");
		myStack.push("Yamone");
		myStack.push("MaMa");
		myStack.push("Aung Aung");
		myStack.push("Hla Hla");
		myStack.push("Ni Ni");
		myStack.push("eain");
		myStack.push("Thin");
		myStack.push("Daw");
		System.out.println("Size of stack list is "+myStack.size());
		System.out.println("Push stack List---> "+myStack);
		System.out.println("----------");
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
		System.out.println("Size of stack list is "+myStack.size());
		System.out.println("Pop stack List---> "+myStack);
		System.out.println(myStack.contains("Hla Hla"));
		myStack.clear();
		
		
	}
}
