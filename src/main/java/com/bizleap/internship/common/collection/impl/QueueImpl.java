package com.bizleap.internship.common.collection.impl;

import java.util.Arrays;

import com.bizleap.internship.common.collections.Queue;

public class QueueImpl implements Queue {
	private int front;
	private int rear;
	private int size;
	private String[] items;

	public QueueImpl(){
		front =0;
		rear =0;
		size = 5;
		setItems(new String[size]);
	}

	public int getFront() {
		return front;
	}

	public void setFront(int front) {
		this.front = front;
	}

	public int getRear() {
		return rear;
	}

	public void setRear(int rear) {
		this.rear = rear;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String[] getItems() {
		return items;
	}

	public void setItems(String[] items) {
		this.items = items;
	}

	public boolean isFull(){
		return rear >= size;
	}

	public boolean isEmpty(){
		return rear< front;
	}

	private void resize() {
		items = Arrays.copyOf(items, items.length * 2);
		System.out.println("Resized stack length: "+ items.length);
	}

	public void add(String value){
		if(isFull()){
			resize();
		}
		if(items[0]==null && rear==size){
			shift();
		}
		items[rear++]=value;
	}
	public void shift(){
		int num=0;
		for(int i=front;i<rear;i++){
			items[num++]=items[i];
		}
		rear=num;
		front=0;
	}

	public String poll(){
		if(isEmpty()){
			return null;
		}
		String item = items[front];
		items[front++]=null;//No more reference to the object to allow garbage collection

		return item;
	}

	public boolean contains(String item){
		for(int i=front;i<rear;i++){
			if(items[i].equals(item)){
				return true;
			}
		}
		return false;
	}

	public boolean remove(String item){
		for(int i=front;i<rear;i++){
			if(items[i].equals(item)){
				items[i]=null;
				for(int j=i;j<=rear;j++){
					items[j]=items[j+1];
				}
				rear--;
				return true;
			}	
		}
		return false;
	}

	public void clear(){
		for(int i=0;i<=rear;i++)//No need to clear unfilled items
			items[i]=null;
		front=0;
		rear = 0;
	}

	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		for (String item : items)
			s.append(item + " ");
		return s.toString();
	}
}
