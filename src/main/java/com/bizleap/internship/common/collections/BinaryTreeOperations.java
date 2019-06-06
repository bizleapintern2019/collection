package com.bizleap.internship.common.collections;

import com.bizleap.internship.common.collections.impl.BinaryNode;

public interface BinaryTreeOperations {
	public void insert(int value);
	public boolean contains(int value);
	public BinaryNode search(int value);
	public void deleteNode(int value);
	public void inOrder();
	public void preOrder();
	public void postOrder();

}
