package com.bizleap.internship.common.collection.impl;
import java.util.Arrays;

import com.bizleap.internship.common.collections.Collection;


public class LinkedListImpl implements Collection{
	
	public LinkedListNode[] buckets;
	private Node head;
	private int size;

	public LinkedListImpl(){
		size =0;
		head =null;
	}
	public Node getHead(){
		return head;
	}
	public void setHead(Node head){
		this.head = head;
	}

	public int getSize(){
		return size;
	}
	public void setSize(int size){
		this.size = size;
	}

	public void add(String value){
		
		Node node = new Node();
		node.setValue(value);

		if(head == null){
			head = node;
		}else{
			Node n = head;
			while(n.getNext() != null){
				n = n.getNext();
			}
			n.setNext(node);
		}
		size++;
	}

	public boolean contains(String value){
		
		if(head.getValue().equals(value)){
			return true;
		}
		head = head.getNext();

		while(head != null && !(head.getValue().equals(value))){
			head = head.getNext();
		}

		if(head == null)
			return false;

		return true;
	}

	public String poll() {
		
		if(head == null){
			return null;
		}
		String temp=head.getValue();
		head =null;
		return temp;
	}

	@SuppressWarnings("unused")
	public boolean remove(String value){
		
		if(head.getValue().equals(value)){
			head = head.getNext();
			size--;
			return true;
		}

		Node currNode = head.getNext(), prev = null;
		while(currNode != null && currNode.getValue() != value){
			prev = currNode;
			currNode = currNode.getNext();
		}

		if(currNode != null){
			prev.setNext(currNode.getNext());
			size--;
			return true;
		}
		
		if(currNode == null){
			return false;
		}
		return true;	
	}

	public void clear() {
		
		while(head.getNext()!=null){
			head = head.getNext();
		}
		head=null;
		size=0;
	}
	@Override
	public String toString() {
		return "LinkedListImpl [buckets=" + Arrays.toString(buckets) + " head=" + head + ", size=" + size + "]";
	}




}
