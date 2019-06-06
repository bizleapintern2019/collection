package com.bizleap.internship.common.collections;

public interface Lifo {
	public void push(String value);
	public String pop();
	public int getCurrent();
	public int size();
	public void clear();
}
