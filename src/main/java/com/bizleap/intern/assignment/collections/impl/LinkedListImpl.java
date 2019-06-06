package com.bizleap.intern.assignment.collections.impl;

import com.bizleap.internship.assignments.common.collection.Collections;
import com.bizleap.internship.assignments.common.collection.LinkedList;

public class LinkedListImpl implements Collections{
	private Node head ; 
	private  Node currentNode ; 
	private Node previousNode;
	private int size=0;

	public void add(String key) {
		Node node = new Node(key);

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

	public void display() {
		currentNode = this.head;
		while(currentNode != null) {
			System.out.println(currentNode.key);
			currentNode = currentNode.next;
		}
	}
	public String get(String key){
		if(head.getKey().equals(key))
			return head.getKey();

		head=head.getNext();
		while(head!= null && !(head.getKey().equals(key)))
			head= head.getNext();
		/*if(head == null)
			return null;
		 */
		return head.getKey();
	}
	public boolean remove(String key) {

		if (head.getKey().equals(key)) {
			for(int i=0;i<size;i++){
				head = head.getNext();
			}
			size--;
			return true;
		}
		currentNode =head.getNext(); 

		while (currentNode != null && currentNode.getKey() != key) { 
			previousNode = currentNode; 
			currentNode = currentNode.getNext(); 
		} 
		if (currentNode != null) { 
			previousNode.setNext(currentNode.getNext());
			size--;
			return true;
		} 
		return false;
	}
	public void search(String key){
		boolean flag=false;
		Node n=head;
		while(n!=null){
			if(n.key==key){
				flag=true;
				System.out.println(key+"contains in the linked list");
			}
			n=n.next;
		}

	}
	public String poll(){
		if(head==null)
			return null;
		String temp=head.getKey();
		head=null;
		return temp;
	}
	public void clear(){
		while(head.getNext()!=null){
			head=head.getNext();
		}
		head=null;
		size=0;
	}
	
}

