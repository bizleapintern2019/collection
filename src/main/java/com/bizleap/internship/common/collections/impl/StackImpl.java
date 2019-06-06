package com.bizleap.internship.common.collections.impl;

import com.bizleap.internship.common.collecitons.Stack;

public class StackImpl implements Stack {
	private int current = 0;
	private int size = 3;
	private String[] stack = new String[size];

	public void overFlow() {
		System.out.println("OverFlow Condition Occured");
		resize();
		System.out.println("ReSizing  is : " + size );
	}

	public void underFlow() {
		System.out.println("UnderFlow Condition");
	}

	public void resize() {
		String[] previous = stack;
		//System.out.println("Previous length "+previous.length);
		stack = new String[size*=2];
		for (int i = 0; i < previous.length; i++) {
			stack[i] = previous[i];
			//System.out.println("Previous data to "+previous[i].toString()+" New Stack Data "+stack[i].toString());

		}
		//System.out.println("New Stack Length "+stack.length);
	}
	
	public void push(String item) {
		int cur = current++;
		if (cur >= size) {
		//	System.out.println("cur length before overflow is "+cur);
			overFlow();
			//System.out.println("cur length after overflow is "+cur);
			stack[cur] = item;
			//System.out.println(stack.length);
			//System.out.println(stack[cur].toString());

		} else
			stack[cur] = item;
	}

	public String pop() {
		if (current <= 0)
			underFlow();
		else
			return "Poping the index "+stack[--current];
		return "No Data Exists";
	}

	public void display() {
		System.out.println("All Stack Data Displaying ");
		for (int i = 0; i < stack.length; i++) {
			if (stack[i] != null) {
				System.out.println(stack[i].toString());
			}
		}
	}
}
