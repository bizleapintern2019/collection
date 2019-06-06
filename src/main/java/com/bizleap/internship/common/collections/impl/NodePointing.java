package com.bizleap.internship.common.collections.impl;
public class NodePointing {
	NodePointing next;
	String data;
	public NodePointing(String data) {
		next=null;
		this.data=data;
	}
	public NodePointing(NodePointing next,String data) {
		this.next=next;
		this.data=data;
	}

	public String getData() {
		return data;
	}
	
	public void setData(String data) {
		this.data=data;
	}
	public NodePointing getNext() {
		return next;
	}
	public void setNext(NodePointing next) {
		this.next = next;
	}
	
}
