package com.bizleap.internship.common.collections;

import java.util.List;

import com.bizleap.internship.common.collections.impl.EntryImpl;

public interface Set {
	public int getCapacity();
	public void setCapacity(int capacity);
	public boolean add(String key);
	public boolean contains(String key);
	public boolean remove(String key);
	public String toString();
	public List<EntryImpl> getAll();
}
