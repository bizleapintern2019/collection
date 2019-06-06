package com.bizleap.intern.assignment.collections.impl;

public class TreeNode {
	private TreeNode left;
	private TreeNode right;
	private int data;

	public TreeNode(int n) {
		left = null;
		right = null;
		data = n;
	}

	public void setLeft(TreeNode node) {
		left = node;
	}

	public void setRight(TreeNode n) {
		right = n;
	}

	public TreeNode getLeft() {
		return left;
	}

	public TreeNode getRight() {
		return right;
	}

	public void setData(int d) {
		data = d;
	}

	public int getData() {
		return data;
	}
}


