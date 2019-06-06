package com.bizleap.internship.common.collection;

public interface Lifo {
	
	public int size();
	public void push(String input);
	public String pop();
	public String peek();
	public boolean contains(String input);
	public void clear();
}

