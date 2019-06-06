package  com.bizleap.internship.assignments.common.collection;

import java.util.List;

import com.bizleap.internship.assignments.common.collections.impl.EntryImpl;

public interface Map {
	public int getCapacity();
	public void setCapacity(int capacity);
	public void put(String key,String value);
	public String get(String key);
	public boolean remove(String key);
	public boolean contains(String key);
	public List<EntryImpl> getAll();
	
}