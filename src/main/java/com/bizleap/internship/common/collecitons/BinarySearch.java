package com.bizleap.internship.common.collecitons;

import com.bizleap.internship.common.collections.impl.BinaryNode;

public interface BinarySearch {
	public void delete(int key);
	public int search(int key);
	public void insert(int key);
	public BinaryNode minNode(BinaryNode node);
	public BinaryNode getMaximumValueNode(BinaryNode node);
}
		