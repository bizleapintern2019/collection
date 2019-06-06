package com.bizleap.internship.common.collections.impl;

public class LinkedNode {
	
	private String value; 
	private LinkedNode next; 
	 
	public LinkedNode() {
 		 
	}
	
    public LinkedNode(String value) {
     	this.value=value;
     	next= null;
     }

	public String getValue() {
		return value;
	}
	
	public LinkedNode getNext() {
			return next;
	}
		
	public void setNext(LinkedNode  next) {
			this.next = next;
	}

	@Override
	public String toString() {
		return "LinkedNode [value=" + value + ", next=" + next + "]";
	}
	
	
}