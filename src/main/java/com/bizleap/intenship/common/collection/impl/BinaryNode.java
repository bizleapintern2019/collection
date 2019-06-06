package com.bizleap.intenship.common.collection.impl;

public class BinaryNode {
	private BinaryNode left, right;
	private int data;

	public BinaryNode() {
		left = null;
		right = null;
		data = 0;
	}

	public BinaryNode(int n) {
		left = null;
		right = null;
		data = n;
	}

	public void setLeft(BinaryNode n) {
		left = n;
	}

	public void setRight(BinaryNode n) {
		right = n;
	}

	public BinaryNode getLeft() {
		return left;
	}

	public BinaryNode getRight() {
		return right;
	}

	public void setData(int d) {
		data = d;
	}

	public int getData() {
		return data;
	}
}
