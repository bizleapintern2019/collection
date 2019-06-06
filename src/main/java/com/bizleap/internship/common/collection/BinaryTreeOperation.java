package com.bizleap.internship.common.collection;

public interface BinaryTreeOperation {
	//public void add(int value);
	public void add2(int value);
	public boolean containsNode(int value);
	public int search(int value);
	public void delete(int value);
	public String inorder();
	public String preorder();
	public String postorder();
}
