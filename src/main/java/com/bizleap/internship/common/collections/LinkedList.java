package com.bizleap.internship.common.collections;

public interface LinkedList {
	
	public void add(String data);
	public void add(String data, int index);
	public String get(int index);
	public int size();
	public boolean remove(int index);
	public boolean hasContain(int index);
}
