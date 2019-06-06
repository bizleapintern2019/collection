package com.bizleap.internship.common.collections.impl;

import java.util.Arrays;
import com.bizleap.internship.common.collections.Lifo;

public class Stack implements Lifo{

	private String[] items;
	private int current;
	private int size;
	
	public Stack() {
		size=5;
		items= new String[size];
		current=-1;
	}
	
	public String[] getItems() {
		return items;
	}
	
	public int getCurrent() {
		return current;
	}

	public int size() {
		return size;
	}
	
	public void push(String value) {
		if(isOverflow())
			resize();
		items[++current]=value;
	}

	public String pop() {
		if(isUnderflow())
			return null;
		String item= items[current];
		items[current--]=null; //No more reference to the object to allow garbage collection
		return item;
	}

	private boolean isOverflow() {
		return (current>=size-1);
	}

	private boolean isUnderflow() {
		return (current<=-1);
	}

	private void resize() {
		String[] backup=getItems();
		size*=2;
		items= Arrays.copyOf(backup,size);
	}
	
	public void clear() {
		for(int i=0; i<=current; i++){//no need to clear unfilled items
			items[i]=null;
		}
		current=-1;
	}
	
	@Override
	public String toString() {
		return "StackImpl [items=" + Arrays.toString(items) + ", current=" + current + ", size=" + size + "]";
	}

}
