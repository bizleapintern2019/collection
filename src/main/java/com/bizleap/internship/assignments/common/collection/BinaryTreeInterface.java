package com.bizleap.internship.assignments.common.collection;

import com.bizleap.intern.assignment.collections.impl.BinaryNode;

public interface BinaryTreeInterface {
	public boolean contains(int data);
	public void insert(int key);
	//public boolean delete(int key);
	public void delete(int value);
	//public void displayTree();
	public String inorder() ;
	public String postorder();
	public String preorder();
	
}
