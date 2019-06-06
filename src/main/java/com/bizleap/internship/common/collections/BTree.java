package com.bizleap.internship.common.collections;

import com.bizleap.internship.common.collection.impl.BinaryNode;

public interface BTree{
	
	public int size(BinaryNode tree);
	public int height(BinaryNode tree);
	public void insert(int id, Object value);
	public Object search(int key);
	public BinaryNode getSuccessor(BinaryNode Node);
	public void delete (int key);
	public BinaryNode getRoot();
}
