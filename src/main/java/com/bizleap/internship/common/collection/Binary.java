package com.bizleap.internship.common.collection;

public interface Binary {
	public boolean isEmpty();

	public void insert(int data);

	public int countNodes();

	public int search(int val);

	public String inorder();

	public String preorder();

	public String postorder();

	public void delete(int key);
}
