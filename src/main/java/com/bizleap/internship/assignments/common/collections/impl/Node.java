package com.bizleap.internship.assignments.common.collections.impl;

public class Node {
	private String key,value;
	private Node next;
	
	Node(){

	}
	
	public Node(String key,String value){
		this.key=key;
		next=null;
	}
	
	public EntryImpl getEntry(){
		return new EntryImpl(key,value);
	}
	
	public String getKey(){
		return key;
	}
	
	public void setKey(String key){
		this.key=key;
	}
	
	public String getValue(){
		return value;
	}
	
	public void setValue(String value){
		this.value=value;
	}
	
	public Node getNext(){
		return next;
	}
	
	public void setNext(Node next){
		this.next=next;
	}
	
	public String toString() {
		return "Node [" + key + ", " + value + ", next=" + next + "]";
	}  
}

