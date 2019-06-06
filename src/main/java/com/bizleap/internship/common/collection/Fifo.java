package com.bizleap.internship.common.collection;

public interface Fifo {
	public int capacity();

	public int size();

	public void add(String input);

	public String poll();

	public String peek();

	public boolean remove(String input);

	public boolean contains(String input);

	public void clear();
}
