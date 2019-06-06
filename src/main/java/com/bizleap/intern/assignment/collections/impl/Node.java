package com.bizleap.intern.assignment.collections.impl;



public class Node {
	Node next;
    String key;

    Node(String key) {
       this.next = null;
        this.key = key;
        
    }
  
    public String getKey(){
		return key;
	}
	
	public void setKey(String key){
		this.key=key;
	}
	public Node getNext(){
		return next;
	}
	
	public void setNext(Node next){
		this.next=next;
	}
	
	public String toString() {
		return "Node [" + key + ", " +  ", next=" + next + "]";
	}  
}

