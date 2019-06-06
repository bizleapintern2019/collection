package com.bizleap.intenship.common.collection.impl;

import java.util.Arrays;

public class ArrayList {
	private String [] items;
	private int size;
	private int current;
	
	public ArrayList() {
		this.size=2;
		this.current= 0 ;
		this.items=new String[size];
	}
	
	public String add(String data) {
		if(current>size)
			resize();
		return items[++current]=data;
	}

	private void resize() {
		items= Arrays.copyOf(items, size*2);
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
