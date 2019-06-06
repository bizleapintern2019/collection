package com.bizleap.internship.common.collections;

import java.util.List;

public interface Set {
	
	public boolean add(String key);
	public boolean contains(String key);
	public boolean remove(String value);
	public List<String> getAll();
}
