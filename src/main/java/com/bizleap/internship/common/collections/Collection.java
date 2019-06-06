package com.bizleap.internship.common.collections;

public interface Collection {
	public void add(String value);
	public String poll();
	public void clear();
	public boolean remove(String value);
	public boolean contains(String value);
}
