package com.bizleap.intenship.common.collection.impl;

public class SinglyNode {
	private String value; 
    private SinglyNode next; 
    
    public SinglyNode(String value) {
    	
    	this.value=value;
    	next= null;
    }
		
	public SinglyNode() {
		// TODO Auto-generated constructor stub
	}
	
	public String getValue() {
		return value;
	}
	
	public void setValue(String value) {
		this.value = value;
	}
	
	public SinglyNode getNext() {
			return next;
	}

	public void setNext(SinglyNode tmpref) {
			this.next = tmpref;
	}
	
}
