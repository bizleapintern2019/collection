package com.bizleap.internship.common.collections.impl;

import java.util.Arrays;

import com.bizleap.internship.common.collections.Stack;

public class StackImpl implements Stack {
	
	private int initial;
	private int current;
	private String[] items;
	
	public StackImpl() {
		initial = 1;
		items = new String[initial];
		current = 0;
	}
 
	private boolean isUnderFlow() {
		return current <1 ;
	}
	
	private boolean isOverFlow() {
		return current >= items.length;
	}
	
	private void reSize() {
		int increasedSize = items.length * 2;
		items = Arrays.copyOf(items, increasedSize);
	}
 
	public void push(String item) {
		
		if (isOverFlow()) {
			reSize();
		}
		items[current++] = item;
	}
 
	public String pop() {
		
		if(isUnderFlow()) {
			return null;
		}
		String item = items[--current];
		items[current] = null; //No more reference to the object to allow garbage collection
		return item;
	}
	
	public int size() {
		return current;
	}
	
	public void clear() {
		for(int i=0;i<items.length;i++) {
			pop();
		}
	}
}
