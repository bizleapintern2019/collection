package com.bizleap.internship.common.collections.impl;

public class BinaryNode {    

	BinaryNode left, right;
	int value;  

	public BinaryNode(int value) {
		left = null;
		right = null;
		this.value = value;
	}   

	public void setLeft(BinaryNode left) {
		this.left = left;
	}  

	public void setRight(BinaryNode right) {
		this.right = right;
	}
	
	public void setValue(int value) {
		this.value = value;
	}

	public BinaryNode getLeft() {
		return left;
	}

	public BinaryNode getRight() {
		return right;
	}

	public int getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "TreeNode [left=" + left + ", right=" + right + ", data=" + value + "]";
	}  
}