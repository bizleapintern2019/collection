package com.bizleap.internship.common.collection.impl;

import java.util.Arrays;

import com.bizleap.internship.common.collection.Lifo;

public class Stack implements Lifo {

	private int size;
	private String[] items;
	private int current;

	public Stack() {
		this.size = 10;
		this.current = -1;
		this.items = new String[size];
	}

	public int getSize() {
		return size;
	}

	public void push(String input) {
		if (current >= size - 1)
			resize();
		items[++current] = input;
	}

	private void resize() {
		items=Arrays.copyOf(items, size*=2);
	}

	public String pop() {
		if (current <= -1)
			return null;
		String val = items[current];
		//No more reference to the object to allow garbage collection
		items[current--] = null;
		return val;
	}

	public String peek() {
		if (current <= -1)
			return null;
		return items[current];
	}

	public boolean contains(String input) {
		for (int i = 0; i <= current; i++)
			if (items[i].equals(input))
				return true;
		return false;
	}

	public void clear() {
		for (int i = 0; i <= current; i++) // no need to clear unfilled items
			items[i] = null;
		current = -1;
	}
	
	@Override
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