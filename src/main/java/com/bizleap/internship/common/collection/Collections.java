package com.bizleap.internship.common.collection;

public interface Collections {
	public void add(String value);
	public String poll();
	public boolean contains(String value);
	public boolean remove(String value);
	public void clear();
}