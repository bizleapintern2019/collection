package com.bizleap.internship.common.collections;

public interface Lifo extends Collections {
	
	public void push(String value);
	public String pop();
	public void resize();
	public int size();
}
