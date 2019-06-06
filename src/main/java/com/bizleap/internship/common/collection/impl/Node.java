package com.bizleap.internship.common.collection.impl;

public class Node{
	public Node[] buckets;  

	private String key;
	private String value;
	private Node next;

	public String getKey(){
		return key;
	}

	public void setKey(String key){
		this.key = key;
	}

	public Node(){

	}
	
	public Node(String dataValue){
		next = null;
		value = dataValue;
	}

	public Node(String hashKey,String dataValue, Node nextValue){
		key = hashKey;
		next = nextValue;
		value = dataValue;
	}

	public EntryImpl getEntry(){
		return new EntryImpl(key,value);
	}

	public String getValue(){
		return value;
	}

	public void setValue(String dataValue){
		value = dataValue;
	}

	public Node getNext(){
		return next;
	}

	public void setNext(Node nextValue){
		next = nextValue;
	}

	public String toString(){
		return "Node[key="+key+", value="+value + next ==null? "]":", next="+next+"]";
	}
}
