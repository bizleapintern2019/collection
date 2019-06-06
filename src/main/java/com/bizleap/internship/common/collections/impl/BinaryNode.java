package com.bizleap.internship.common.collections.impl;

public class BinaryNode
{ 
	int key; 
	public int getKey() { 
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public BinaryNode getLeft() {
		return left;
	}

	public void setLeft(BinaryNode left) {
		this.left = left;
	}

	public BinaryNode getRight() {
		return right;
	}

	public void setRight(BinaryNode right) {
		this.right = right;
	}

	BinaryNode left, right; 

	public BinaryNode(int item) 
	{ 
		key = item; 
		left = right = null; 
	} 
} 
