package com.bizleap.intenship.common.collection;

import java.util.List;

import com.bizleap.intenship.common.collection.impl.EntryImpl;

public interface Set {
	public int getCapacity();
	public void setCapacity(int capacity);
	public boolean add(String key);
	public boolean contains(String key);
	public boolean remove(String key);
	public List<EntryImpl> getAll();
}
