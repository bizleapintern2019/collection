package com.bizleap.internship.common.collections;

import java.util.List;

public interface Map {
	
	public int getCapacity();
	public void setCapacity(int capacity);
	public void put(String key,String value);
	public String get(String key);
	public boolean remove(String key);
	public List<Entry> getAll();
	public boolean contains(String key);
}