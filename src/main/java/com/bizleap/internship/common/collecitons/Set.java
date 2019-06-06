package com.bizleap.internship.common.collecitons;
import java.util.List;

public interface Set {
	public int getCapacity();
	public void setCapacity(int capacity);
	public boolean add(String key);
	public boolean contains(String key);
	public boolean remove(String key);
	public String toString();
}
