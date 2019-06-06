package com.bizleap.intenship.common.collection.impl;

import java.util.Arrays;
import com.bizleap.intenship.common.collection.Fifo;

public class Queue implements Fifo{
	private int size;
	private String items[];
	private int front;
	private int rear;
	
	public Queue() {
		this.size = 10;
		this.items = new String[size];
		this.rear = 0;
		this.front = 0;
	}

	public int capacity() {
		return size;
	}

	public int size() {
		return rear;
	}

	public void add(String data) {				
		if (rear >= size) {
			if (items[0] == null)
				shift();
			else
				resize();
		}
		items[rear++] = data;
	}

	private void shift() {
		int count = 0;
		for (int i = front; i < rear; i++)
			items[count++] = items[i];
		rear = count;
		front = 0;
	}

	private void resize() {
		items = Arrays.copyOf(items, size *= 2);
	}

	public String poll() {
		if (rear <= front)
			return null;
		String data = items[front];
		items[front++] = null;
		return data;
	}

	public String peek() {
		return items[front];
	}

	public boolean remove(String data) {
		for (int i = front; i < rear; i++)
			if (items[i].equals(data)) {
				items[i] = null;
				for (int j = i; j < rear; j++)
					items[j] = items[j + 1];
				rear--;
				return true;
			}
		return false;
	}

	public boolean contains(String data) {
		for (int i = front; i < rear; i++)
			if (items[i].equals(data))
				return true;
		return false;
	}

	public void clear() {
		for (int i = front; i <= rear; i++) // no need to clear unfilled items
			items[i] = null;
		rear = 0;
		front = 0;
		size = 10;
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
