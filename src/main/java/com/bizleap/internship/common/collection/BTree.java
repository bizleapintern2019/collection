package com.bizleap.internship.common.collection;

public interface BTree {
	public void insert(int data);
	
	public void insert2(int value);

	public boolean contains(int val);
	
	public int search(int key); 
	
	public void delete(int val);

	public String inorder();

	public String preorder();

	public String postorder();
}
