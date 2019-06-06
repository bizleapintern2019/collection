package com.bizleap.internship.common.collections;

public interface Tree {
	
	public void insert(int value);
	public boolean contains(int value);
	public void inOrder();
	public void preOrder();
	public void postOrder();
	public void delete(int value);
}
