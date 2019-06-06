package com.bizleap.intenship.common.collection;

public interface Fifo {
	public String peek();
	public void add(String item);
	public String poll();
	public boolean contains(String item);
	public void clear();
	public int size();
	public boolean remove(String input);
}
