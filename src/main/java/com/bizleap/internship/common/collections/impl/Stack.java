package com.bizleap.internship.common.collections.impl;

import java.util.Arrays;

import com.bizleap.internship.common.collections.Lifo;

public class Stack implements Lifo {

	private int size;
	private String[] items;
	private int current;

	public Stack(){
		this.current = -1;
		this.size = 1;
		this.items = new String[size];
	}

	public int size() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public void push(String value) {
		if(current >= size-1)
			resize();
		items[++current] = value;
	}

	public String pop() {
		if(current <= -1)
			return null;
		String top = items[current];
		//No more reference to the object to allow garbage collection
		items[current--] = null; 
		return  top;
	}
	
	public void clear() {
		for(int i=0; i<= current; i++) {
			items[i] = null;
		}
		current = -1;
	}

	public void resize() {
		items = Arrays.copyOf(items, size *= 2);
	}

	public boolean contains(String input) {
		for(int i=0; i<current; i++) 
			if(items[i].equals(input))
				return true;
		return false;

	}

	@Override
	public String toString() {
		return "StackImpl [size=" + size + ", items=" + Arrays.toString(items) + ", current=" + current + "]";
	}

	public void add(String value) {
		// TODO Auto-generated method stub
		
	}

	public String poll() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean remove(String value) {
		// TODO Auto-generated method stub
		return false;
	}
}