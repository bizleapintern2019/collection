package com.bizleap.internship.common.collections.impl;

public class BinaryTreeNode {

	int value;
	private BinaryTreeNode left;
	private BinaryTreeNode right;

	BinaryTreeNode(int value) {
		this.value = value;
		right = null;
		left = null;
	}
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public BinaryTreeNode getLeft() {
		return left;
	}

	public void setLeft(BinaryTreeNode left) {
		this.left = left;
	}

	public BinaryTreeNode getRight() {
		return right;
	}

	public void setRight(BinaryTreeNode right) {
		this.right = right;
	}

	@Override
	public String toString() {
		return "BinaryTreeNode [value=" + value + ", left=" + left + ", right=" + right + "]";
	}
}

