package com.bizleap.intenship.common.collection.impl;

import com.bizleap.intenship.common.collection.Linked;

public class SinglyLinkedList implements Linked{

	private SinglyNode head;
	private int count;

	public SinglyLinkedList() {
		head = null;
		count = 0;
	}

	public int getCount() {
		return count;
	}

	public void add(SinglyNode node, int position) {

		if (head == null) {
			head = node;

		} else if (position <= 0) {
			SinglyNode next = head;
			head = node;
			head.setNext(next);

		} else {
			position = position > count ? count : position;
			SinglyNode next = head;
			for (int i = 0; i < position - 1; i++) {
				next = next.getNext();
			}
			node.setNext(next.getNext());
			next.setNext(node);
		}
		count++;
	}

	public void get() {
		SinglyNode next = head;
		while (next != null) {
			System.out.print("->" + next.getValue());
			next = next.getNext();
		}
		System.out.println();
	}

	public void remove(int position) {
		position = position > count ? count : position;
		if (head == null)
			return;
		else if (position <= 1) {
			head = head.getNext();
		} else {
			SinglyNode next = head;
			for (int i = 0; i < position - 1; i++) {
				next = next.getNext();
			}
			next.setNext(next.getNext().getNext());
		}
		count--;
	}
}