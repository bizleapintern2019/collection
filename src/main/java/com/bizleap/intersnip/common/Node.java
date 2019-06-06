package com.bizleap.intersnip.common;

public class Node {

	private Node next;
	private Object data;
	private String key;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	@SuppressWarnings("unused")
	public Node(Object dataValue) {
		next = null;
		data = dataValue;
	}

	public Node(String hashKey,Object dataValue, Node nextValue) {
		key=hashKey;
		next = nextValue;
		data = dataValue;
	}

	public Object getData() {
		return data;
	}

	@SuppressWarnings("unused")
	public void setData(Object dataValue) {
		data = dataValue;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node nextValue) {
		next = nextValue;
	}

}
 