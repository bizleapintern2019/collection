package com.bizleap.internship.assignments.common.collections.impl;

import java.util.ArrayList;

import java.util.List;

//import com.bizleap.internship.assignments.common.collection.Node;
import com.bizleap.internship.assignments.common.collection.Set;

public class Bucket {
	private Node head;
	int size=0;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Node getHead(){
		return head;
	}

	public void setHead(Node head){
		this.head = head;
	}

	public void add(String key,String value) {
		Node node = new Node(key, value);

		if(head==null){
			head=node;
		}
		else{
			Node n= head;
			while(n.getNext() != null){
				n=n.getNext();
			}
			n.setNext(node);
		}
		size++;
	}

	public String get(String key){
		if(head.getKey().equals(key))
			return head.getValue();

		head=head.getNext();
		while(head!= null && !(head.getKey().equals(key)))
			head= head.getNext();
		if(head == null)
			return null;

		return get(head.getKey());
	}

	public List<EntryImpl> getEntryList(){
		List<EntryImpl> entryList = new ArrayList<EntryImpl>();
		for(int i=0;i<getSize();i++){
			entryList.add(head.getEntry());
			head = head.getNext();
		}
		return entryList;
	}

	public boolean remove(String key) {
		if (head.getKey().equals(key)) {
			for(int i=0;i<size;i++){
				head = head.getNext();
			}
			size--;
			return true;
		}
		Node currNode =head.getNext(), prev = null; 

		while (currNode != null && currNode.getKey() != key) { 
			prev = currNode; 
			currNode = currNode.getNext(); 
		} 
		if (currNode != null) { 
			prev.setNext(currNode.getNext());
			size--;
			return true;
		} 
		return false;
	}
	public String toString(){
		return "Bucket [ head"+getHead() ==null ? "]" :head +",size+"+size+"]";
	}
}


	