package com.bizleap.intenship.common.collection;

public interface Binary {
	public void insert(int data);
	public boolean contain(int key);
	public int search(int key);
	public String inorder();
	public String preorder();
	public String postorder();
	public void delete(int key);
}