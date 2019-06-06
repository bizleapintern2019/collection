package com.bizleap.internship.common.collection.impl;

import com.bizleap.internship.common.collection.Lifo;

public class StackImpl implements Lifo {

	private int size;
	private String[] items;
	private int current;

	public StackImpl() { //Always initialize value in
		this.size = 4;
		this.items = new String[size];
		this.current = -1;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getCurrent() {
		return current;
	}

	public void setCurrent(int current) {
		this.current = current;
	}

	public void push(String key) {
		if (current >= size - 1)
			reSize();
		items[++current] = key;
	}

	public String pop() {
		if (current <= -1)
			return null;
		String temp = items[current];
		//
		items[current--] = null;
		return temp;
	}

	public String[] reSize() {
		size *= 2;
		String newStack[] = new String[size];
		for (int i = 0; i < items.length; i++) {
			newStack[i] = items[i];
		}
		items = newStack;
		return items;
	}

	public boolean contain(String key) {
		for (int i = 0; i < items.length; i++)
			if (items[i] == key)
				return true;
		return false;
	}

	public void clear() {
		for (int i = 0; i < current; i++) { // no need to clear unfilled items
			items[i] = null;
		}
		current = -1;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i <= current; i++) {
			if (items[i] != null)
				sb.append(items[i] + ",");
		}
		return sb.toString();
	}
	
	
}