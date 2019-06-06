package com.bizleap.internship.common.collection.impl;

import java.util.Arrays;

import com.bizleap.internship.common.collection.Fifo;

public class Queue implements Fifo {

	private int capacity;
	private String[] items;
	private int rear;
	private int front;

	public Queue() {
		this.capacity = 10;
		this.items = new String[capacity];
		this.rear = 0;
		this.front = 0;
	}

	public int capacity() {
		return capacity;
	}

	public int size() {
		return rear;
	}

	public void add(String input) {
		if (rear >= capacity) {
			if (items[0] == null)
				shift();
			else
				resize();
		}
		items[rear++] = input;
	}

	private void shift() {
		int count = 0;
		for (int i = front; i < rear; i++)
			items[count++] = items[i];
		rear = count;
		front = 0;
	}

	private void resize() {
		items = Arrays.copyOf(items, capacity *= 2);
	}

	public String poll() {
		if (rear <= front)
			return null;
		String value = items[front];
		items[front++] = null;
		return value;
	}

	public String peek() {
		return items[front];
	}

	public boolean remove(String input) {
		for (int i = front; i < rear; i++)
			if (items[i].equals(input)) {
				items[i] = null;
				for (int j = i; j < rear; j++)
					items[j] = items[j + 1];
				rear--;
				return true;
			}
		return false;
	}

	public boolean contains(String input) {
		for (int i = front; i < rear; i++)
			if (items[i].equals(input))
				return true;
		return false;
	}

	public void clear() {
		for (int i = front; i <= rear; i++) // no need to clear unfilled items
			items[i] = null;
		rear = 0;
		front = 0;
		capacity = 10;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		if (rear <= 0)
			return "[]";

		for (int i = front; i < rear; i++) {
			if (i == front)
				sb.append("[");
			else
				sb.append(",");

			sb.append(items[i]);
			if (i >= rear - 1)
				sb.append("]");
		}
		return sb.toString();
	}
}