package com.bizleap.internship.assignments.common.collection;

import java.util.List;

import com.bizleap.internship.assignments.common.collections.impl.EntryImpl;

public interface Collection {
	public int size();
	public void resize();
	public boolean contains(String input);
	public void clear();
	//public void push(String string);
	
}
