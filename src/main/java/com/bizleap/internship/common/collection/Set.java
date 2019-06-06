package com.bizleap.internship.common.collection;

import java.util.List;

import com.bizleap.internship.common.collection.impl.EntryImpl;

public interface Set {
	public boolean contain(String key);
	public boolean remove(String value);
	public boolean add(String string);
	public boolean contains(String string);
	public List<EntryImpl> getAll();
}
