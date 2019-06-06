package com.bizleap.internship.common.collection;

public interface Fifo {
	public void add(String value);

	public String poll();

	public int size();

	public String peek();

	public boolean contain(String value);

	public void clear();
	
	public String[] getItem();
	
	public int capacity();
	
	public boolean remove(String input);
	
	public boolean contains(String input);
}
