package com.bizleap.internship.common.collection;

public interface Fifo {
	public int size();
	public Boolean isEmpty();
	public Boolean isFull();
	public void add(String value);
	public String poll();
	public boolean contains(String input);
	public int capacity();
	public boolean remove(String input);
	public String peek();
	public void clear();
}
