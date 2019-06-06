package com.bizleap.intenship.common.collection;

import com.bizleap.intenship.common.collection.impl.SinglyNode;

public interface Linked {
	public void remove(int position);
	public void get();
	public void add(SinglyNode node, int position);
}
