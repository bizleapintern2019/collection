package com.bizleap.intern.assignment;

//import com.bizleap.intern.assignment.MyHashMap.Node;

public class Node {
	public String key;
	String value;
	public Node next;
	Node(String key,String value){
		this.key=key;
		this.value=value;
		next=null;
	}
	public Node(){
		
	}

	public void setKey(String key){
		this.key=key;
	}
	public String getKey(){
		return key;
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
		return "Node [key=" + key + ", value=" + value + ", next=" + next + "]";
	}  
		public static void main(String[] args) {
		

	}

}
