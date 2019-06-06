package com.bizleap.internship.common.collections.impl;

import java.util.ArrayList;
import java.util.List;

import com.bizleap.internship.common.collections.Entry;

public class Bucket {
	
	private Node head;
	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	int size=0;
	
	public List<EntryImpl> getEntryList(){
		List<EntryImpl> entryList=new ArrayList<EntryImpl>();
		for(int i=0;i<getSize();i++) {
			entryList.add(head.getEntry());
			head=head.getNext();
		}
		return entryList;
	}
	
	public void add(String key,String value) {
		Node node = new Node();
		node.key=key;
		node.value=value;

		if(head==null){
			head=node;
		}
		else{
			Node n= head;
			while(n.next != null){
				n=n.next;
			}
			n.next=node;
		}
		size++;
	}

	public String get(String key){
		if(head.getKey().equals(key))
			return head.getValue();

		head=head.next;
		while(head!= null && !(head.getKey().equals(key)))
			head= head.next;
		if(head == null)
			return null;

		return get(head.getKey());
	}

	@SuppressWarnings("unused")
	public boolean remove(String key) {
		if (head.key.equals(key)) {
			head = head.next;
			size--;
			return true;
		}
		Node currNode =head.next, prev = null; 

		while (currNode != null && currNode.key != key) { 
			prev = currNode; 
			currNode = currNode.next; 
		} 
		if (currNode != null) { 
			prev.next = currNode.next;
			size--;
			return true;
		} 

		if (currNode == null){ 
			return false;
		}
		return true;
	}
	
	@Override
	public String toString() {
		return "Bucket [head=" + head == null ? "]": head+ ", size=" + size + "]";
	}
}
