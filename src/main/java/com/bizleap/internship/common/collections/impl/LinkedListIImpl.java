package com.bizleap.internship.common.collections.impl;

import com.bizleap.internship.common.collecitons.LinkedList;

public class LinkedListIImpl implements LinkedList {
	private static int counter;
	private NodePointing head;
 
	public LinkedListIImpl() {
 
	}
 
	public void add(String data) {
		if (head == null) 
			head = new NodePointing(data);
		
		NodePointing temp = new NodePointing(data);
		NodePointing current = head;
 
		if (current != null) {
			while (current.getNext() != null) 
				current = current.getNext();
			current.setNext(temp);
		}
		incrementCounter();
	}
 
	public void add(String data, int index) {
		NodePointing temp = new NodePointing(data);
		NodePointing current = head;
 
		if (current != null) {

			for (int i = 0; i < index && current.getNext() != null; i++) {
				current = current.getNext();
			}
		}
		temp.setNext(current.getNext());
		current.setNext(temp);
		incrementCounter();
	}
 
	@SuppressWarnings("null")
	public String get(int index) {
		if (index < 0)
			return null;
		NodePointing current = null;
		if (head != null) {
			current = head.getNext();
			for (int i = 0; i < index; i++) {
				if (current.getNext() == null)
					return null;
 
				current = current.getNext();
			}
			return current.getData();
		}
		return current.getData();
 
	}
 
	public boolean remove(int index) {
 
		if (index < 1 || index > size())
			return false;
 
		NodePointing current = head;
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
 
	public int size() {
		return getCounter();
	}
 
	public String toString() {
		String output = "";
 
		if (head != null) {
			NodePointing current = head.getNext();
			while (current != null) {
				output += "[" + current.getData().toString() + "]";
				current = current.getNext();
			}
 
		}
		return output;
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
 
}