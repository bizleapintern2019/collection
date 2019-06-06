package com.bizleap.internship;

import org.junit.Test;

import com.bizleap.internship.common.collections.Lifo;
import com.bizleap.internship.common.collections.impl.Stack;

public class StackTest {

	@Test
	public void stackTest() {
		Lifo stackTest =new Stack();

		stackTest.push("Saw Sandi Tin");
		stackTest.push("Su Pyae Naing");
		stackTest.push("Khin Chanmyae Thu");
		stackTest.push("San Thinzar Linn");
		stackTest.push("Ya Mone Zin");
		stackTest.push("Shin Wanna");
		stackTest.push("Nyan Linn Htet");	
		stackTest.push("Thura Oo");
		stackTest.push("Soe Min Thein");
		stackTest.push("Kaung Pyaesone Htun");
		
		System.out.println(stackTest.pop());
		System.out.println(stackTest.pop());
		System.out.println(stackTest.pop());
		System.out.println(stackTest.pop());
		System.out.println(stackTest.pop());
		System.out.println(stackTest.pop());
		System.out.println(stackTest.pop());
		System.out.println(stackTest.pop());
		System.out.println(stackTest.pop());
		System.out.println(stackTest.pop());
		System.out.println(stackTest.pop());
	}
}