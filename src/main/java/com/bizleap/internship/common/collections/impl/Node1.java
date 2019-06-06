package com.bizleap.internship.common.collections.impl;

class Node1{
	Node1 next;
	 
	String data;

	public Node1(String data) {
		next = null;
		this.data = data;
	}
	
	public Node1(Node1 next,String data) {
		this.next = next;
		this.data = data;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Node1 getNext() {
		return next;
	}

	public void setNext(Node1 next) {
		this.next = next;
	}

}
	