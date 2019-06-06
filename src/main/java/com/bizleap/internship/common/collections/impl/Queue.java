package com.bizleap.internship.common.collections.impl;

import java.util.Arrays;

import com.bizleap.internship.common.collections.Fifo;

public class Queue implements Fifo {

	private int front;
	private int rear;
	private int size;
	private String[] items;

	public Queue() {
		this.front = 0;
		this.rear = 0;
		this.size = 20;
		this.items = new String[size];
	}

	public int size() {
		return size;
	}

	public void add(String value) {
		if(rear >= size)
			resize();
		items[rear++] = value;		
	}

	public String poll() {
		if(rear <= front) 
			return null;

		String top = items[front];
		//No more reference to the object to allow garbage collection
		items[front++] = null; 
		return  top;
	}

	public void resize() {
		items = Arrays.copyOf(items, size *= 2);
	}

	public boolean contains(String input) {
		for(int i=front; i<rear; i++)
			if(items[i].equals(input))
				return true;
		return false;
	}

	public void clear() {
		for(int i=0; i<= front; i++) {
			items[i] = null;
		}
		front = 0;
		rear = 0;
	}
	
	public boolean remove(String input) {
		for(int i = front;i < rear;i++){
			if(items[i].equals(input)){
				items[i] = null;
				for(int j = i;j < rear;j++){
					items[j] = items[j+1];
				}
				rear--;
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "QueueImpl [front=" + front + ", rear=" + rear + ", size=" + size + ", items=" + Arrays.toString(items) + "]";
	}
}