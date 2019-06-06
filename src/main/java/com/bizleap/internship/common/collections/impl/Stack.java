package com.bizleap.internship.common.collections.impl;

import java.util.Arrays;

import com.bizleap.internship.common.collection.Lifo;

public class Stack implements Lifo {

	private int size;
	private String[] items;
	private int current;

	public Stack(){

		this.current=-1;
		this.size=10;
		this.items=new String[size];
	}
	
	public int size() {
		return size;
	}

	public void push(String input) {
		if (current >= size - 1)
			resize();
		items[++current] = input;
	}

	public String pop() {
		if (current <= -1)
			return "UnderFlow";
		String top=items[current];
		// No more reference to the object to allow garbage collection
		items[current--] = null; 
		return top;
	}

	private void resize() {
		size *= 2;
		String[] newStack = new String[size];

		for (int i = 0; i < items.length; i++) {
			newStack[i] = items[i];
		}
		items = newStack;
	}

	public String peek() {
		if (current <= -1)
			return "UnderFlow";
		return items[current];
	}

	public boolean contains(String input) {
		for (int i = 0; i <= current; i++)
			if (items[i].equals(input))
				return true;
		return false;
	}

	public void clear() {
		//stack = new String[10];	
		for (int i = 0; i <= current; i++){
			items[i]=null;
		}
		current = -1;
	}

	public String toString() {

		StringBuilder sb = new StringBuilder();

		if (current <= -1)
			return "[]";

		for (int i = 0; i <= current; i++) {
			if (i == 0)
				sb.append("[");
			else
				sb.append(",");
			sb.append(items[i]);
			if (i >= current)
				sb.append("]");
		}
		return sb.toString();
	}
}
