package com.bizleap.internship.common.collections;

public interface Queue {
	
	public void enqueue(String value);
	public String dequeue();
	public int size();
	public boolean hasContain(String value); 
	public void clear();
	public void remove(String value);
}
