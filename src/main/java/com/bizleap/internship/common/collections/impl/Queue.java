package com.bizleap.internship.common.collections.impl;

import com.bizleap.internship.common.collection.Fifo;

public class Queue implements Fifo{

	private int capacity;
	private String[] items;
	private int rear;
	private int front;

	public Queue(){
		this.capacity=10;
		this.items=new String[capacity];
		this.rear=0;
		this.front=0;
	}

	public int capacity(){
		return capacity;
	}

	public int size() {
		return rear;
	}

	public Boolean isEmpty(){
		return (rear <= front);
	}

	public Boolean isFull(){
		return (rear >= capacity);
	}

	public void add(String value){
		if(isFull()){
			if(items[0]==null)
				shift();
			else
				resize();
		}
		items[rear++]=value;
	}

	private void shift(){
		int count=0;
		for(int i=front;i<rear;i++)
			items[count++]=items[i];
		rear = count;
		front = 0;
	}

	public String poll(){
		if(isEmpty())
			return null; 
		String top=items[front];
		items[front++] = null;
		return top;
	}

	private void resize() {
		capacity *= 2;
		String[] resizedItems = new String[capacity];

		for (int i = 0; i < items.length; i++) {
			resizedItems[i] = items[i];
		}
		items = resizedItems;
	}

	public boolean remove(String input){
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

	public boolean contains(String input) {
		for (int i = front; i < rear; i++)
			if (items[i].equals(input))
				return true;
		return false;
	}

	public String peek() {
		return items[front];
	}

	public void clear() {	
		for (int i = front; i < rear; i++){
			items[i]=null;
		}
		rear = 0;
		front = 0;
		capacity = 10;
	}

	public String toString() {

		StringBuilder sb = new StringBuilder();

		if (rear <= 0 )
			return "[]";

		for (int i = front; i < rear; i++) {
			if (i == front)
				sb.append("[");
			else
				sb.append(",");

			sb.append(items[i]);
			if(i >= rear-1)
				sb.append("]");
		}
		return sb.toString();
	}
}
