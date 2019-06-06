package com.bizleap.internship.common.collection.impl;

public class BinaryTreeNode {

	private BinaryTreeNode left, right;
	private int data;

	public BinaryTreeNode() {
		left = null;
		right = null;
		data = 0;
	}

	public BinaryTreeNode(int n) {
		left = null;
		right = null;
		data = n;
	}

	public void setLeft(BinaryTreeNode n) {
		left = n;
	}

	public void setRight(BinaryTreeNode n) {
		right = n;
	}

	public BinaryTreeNode getLeft() {
		return left;
	}

	public BinaryTreeNode getRight() {
		return right;
	}

	public void setValue(int d) {
		data = d;
	}

	public int getValue() {
		return data;
	}
}