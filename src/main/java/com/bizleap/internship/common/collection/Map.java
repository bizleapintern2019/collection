package com.bizleap.internship.common.collection;

import java.util.List;

import com.bizleap.internship.common.collection.impl.EntryImpl;

public interface Map {

	public int getCapacity();

	public void setCapacity(int capacity);

	public void put(String key, String value);

	public String get(String key);

	public boolean remove(String key);

	public List<EntryImpl> getAll();

	public boolean contains(String key);
}