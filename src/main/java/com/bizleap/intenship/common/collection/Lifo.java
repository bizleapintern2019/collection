package com.bizleap.intenship.common.collection;

public interface Lifo {
	public void push(String data);
	public void resize();
	public String pop();
	public int getSize();
	public void clear();
}