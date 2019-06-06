package com.bizleap.internship.common.collections;

import com.bizleap.internship.common.collections.impl.TreeNode;

public interface Tree {
	public void add(int value);
	public void traverseInOrder(TreeNode node);
	public void traversePreOrder(TreeNode node);
	public void traversePostOrder(TreeNode node);
	public TreeNode getRoot();
	public int search(int val);
	public void delete(int value);
//	public int getmaxNode();
//	public int getminNode();
}
