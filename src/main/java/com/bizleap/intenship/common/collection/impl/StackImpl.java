package com.bizleap.intenship.common.collection.impl;

import com.bizleap.intenship.common.collection.Lifo;

public class StackImpl implements Lifo {

	private int current;
	private int size;
	String[] items;
	
	public StackImpl () {
		this.current=-1;
		this.size=6;
		this.items=new String[size];
	}
	
	public void push(String data) {
		if(current>=size-1) 
			resize();
		items[++current]=data;
	}
	
	public void resize() {
		size*=2;
		String [] resizedItems=new String[size];
		for(int i=0;i<items.length;i++)
			resizedItems[i]=items[i];
		items=resizedItems;
	}
	
	public String pop() {
		if(current<=-1)
			return null;
		String temp=items[current];
		items[current--]=null;
		return temp;
	}
	
	public void clear() {
		for(int i=0;i<current;i++)
			items[i]=null;
		current =-1;
	}
	
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	public String toString() {
		StringBuilder sb=new StringBuilder();
		if(current<=-1)
			return null;
		
		for(int i=0;i<=current;i++) 
			sb.append(items[i]+", ");
		return sb.toString();
	}
}