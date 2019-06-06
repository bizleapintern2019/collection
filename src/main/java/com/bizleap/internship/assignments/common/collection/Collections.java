package com.bizleap.internship.assignments.common.collection;

public interface Collections {
	public boolean remove(String key);
	public String get(String key);
	public void add(String key);
	public void search(String key);
	public String poll();
	public void display();
	public void clear() ;
}
