package com.bizleap.internship.common.collection.impl;

public class LinkedListNode {
	public LinkedListNode[] buckets;  

	private String value;
	private Node next;


	public LinkedListNode(){

	}

	public LinkedListNode(String dataValue){
		next = null;
		value = dataValue;
	}

	public LinkedListNode(String dataValue, Node nextValue){

		next = nextValue;
		value = dataValue;
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
}
