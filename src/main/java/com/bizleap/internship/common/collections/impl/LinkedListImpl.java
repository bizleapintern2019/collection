package com.bizleap.internship.common.collections.impl;

import com.bizleap.internship.common.collections.LinkedList;

public class LinkedListImpl implements LinkedList {
	private static int counter;
	private Node1 head;
 
	public LinkedListImpl() {
 
	}
 
	public void add(String data) {		
		if (head == null) {
			head = new Node1(data);
		}
		
		Node1 temp = new Node1(data);
		Node1 current = head;
 
		if (current != null) { 
			// starting at the head node, crawl to the end of the list and then add element after last node
			while (current.getNext() != null) {
				current = current.getNext();
			}
			current.setNext(temp);
		}
		incrementCounter();
	}
 
	// inserts the specified element at the specified position in this list
	public void add(String data, int index) {
		Node1 temp = new Node1(data);
		Node1 current = head;
 
		if (current != null) {

			for (int i = 0; i < index && current.getNext() != null; i++) {
				current = current.getNext();
			}
		}
		temp.setNext(current.getNext());
		current.setNext(temp);
		incrementCounter();
	}
 

	public String get(int index) {
	// returns the element at the specified position in this list.
		if (index < 0)
			return null;
		Node1 current = null;
		if (head != null) {
			current = head.getNext();
			for (int i = 0; i < index; i++) {
				if (current.getNext() == null)
					return null;
				current = current.getNext();
			}
		}
		return current.getData(); 
	}
	
	public boolean hasContain(int index) {
		// returns the element at the specified position in this list.
			if (index < 0)
				return false;
			Node1 current = null;
			if (head != null) {
				current = head.getNext();
				for (int i = 0; i < index; i++) {
					if (current.getNext() == null)
						return false;
					current = current.getNext();
				}
			}
			return true; 
		}
 
	// removes the element at the specified position in this list.
	public boolean remove(int index) {
 
		if (index < 1 || index > size())
			return false;
 
		Node1 current = head;
		if (head != null) {
			for (int i = 0; i < index; i++) {
				if (current.getNext() == null)
					return false;
 
				current = current.getNext();
			}
			current.setNext(current.getNext().getNext());
 
			decrementCounter();
			return true;
 
		}
		return false;
	}

	// returns the number of elements in this list.
	public int size() {
		return getCounter();
	}
 	
	private static int getCounter() {
		return counter;
	}
 
	private static void incrementCounter() {
		counter++;
	}
 
	private void decrementCounter() {
		counter--;
	}
	
	public String toString() {
		String output = "";
 
		if (head != null) {
			Node1 current = head.getNext();
			while (current != null) {
				output += "[" + current.getData() + "]";
				current = current.getNext();
			}
 
		}
		return output;
	}
 
}