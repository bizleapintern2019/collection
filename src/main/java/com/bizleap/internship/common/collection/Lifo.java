package com.bizleap.internship.common.collection;

public interface Lifo {

	public void push(String key);

	public String pop();

	public boolean contain(String key);

	public String toString();

	public int getSize();

	public void clear();
}
