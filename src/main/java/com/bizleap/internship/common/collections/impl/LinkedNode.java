package com.bizleap.internship.common.collections.impl;

public class LinkedNode {
	private String value;
	private LinkedNode next;
	
	LinkedNode(){

	}
	
	public LinkedNode(String value){
		this.value=value;
		next=null;
	}
	
	public String getValue(){
		return value;
	}
		
	public LinkedNode getNext(){
		return next;
	}
	
	public void setNext(LinkedNode next){
		this.next=next;
	}
	
	public String toString() {
		return "Node [ value="  + value + ", next=" + next + "]";
	}  
}

