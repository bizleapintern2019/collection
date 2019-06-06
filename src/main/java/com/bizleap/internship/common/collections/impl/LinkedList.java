package com.bizleap.internship.common.collections.impl;

import com.bizleap.internship.common.collections.Collections;

public class LinkedList implements Collections {

	private LinkedNode head;
	int size = 0;

	public LinkedNode getHead() {
		return head;
	}

	public void setHead(LinkedNode head) {
		this.head = head;
	}

	public int getSize() {
		return size;
	}

	public void add(String value) {
		LinkedNode node = new LinkedNode(value);

		if(head == null)
			head = node;
		else {
			LinkedNode n = head;
			
			while(n.getNext() != null){
				n = n.getNext();
			}
			n.setNext(node);
		}
		size++;
	}

	public String poll() {
		if(head == null)
			return null;
		String temp = head.getValue();
		head = null;
		return temp;
	}

	public boolean contains(String value) {
		if(head.getValue().equals(value))
			return true;

		head = head.getNext();
		while(head!= null && !(head.getValue().equals(value)))
			head = head.getNext();
		if(head == null)
			return false;

		return true;
	}

	public boolean remove(String value) {
		if (head.getValue().equals(value)) {
			head = head.getNext();	
			size--;
			return true;
		}
		
		LinkedNode currNode = head.getNext(), prev = null; 

		while (currNode != null && currNode.getValue() != value) { 
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

	public void clear() {
		
		while(head.getNext() != null) {
			head = head.getNext();
		}
		
		head = null;
		size = 0;
	}

	@Override
	public String toString() {
		return "LinkedListImpl [head=" + head + ", size=" + size + "]";
	}
}