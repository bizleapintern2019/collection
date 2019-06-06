package com.bizleap.internship.common.collections.impl;

import java.util.Arrays;

import com.bizleap.internship.common.collections.Fifo;

public class Queue implements Fifo{
	String[] items;
	int front;
	int rear;
	int size;
	
	public Queue() {
		size = 3;
		items = new String[size];
		front = 0;
		rear = 0;
	}
	public int size() {
		return size;
	}
	
	public void add(String value) {
			if(isFull()){
				resize();
			}
			items[rear++]=value;
	}
	
	private void resize() {
		size*=2;
		items= Arrays.copyOf(items, size); 
		
	}
	public String poll() {
		if(isEmpty()){
			front=0;
			rear=0;
			return null;
		}
		String temp=items[front];
		items[front++]=null;
		for(int i=front; i<=rear; i++){
			items[i]=items[i+1];
		}
		rear--;
		if(front >= rear || items[front-1]==null){
			front=0;
			rear=0;
		}
		return temp;
	}
	
	private boolean isFull() {
		return rear>=size;
	}
	
	private boolean isEmpty() {
		return rear<=front;
	}
	
	public boolean contains(String item) {
		for(int i=front; i<rear ; i++){
			if(items[i].equals(item)){
				return true;
			}
		}
		return false;
	}
	
	public void clear() {
		for(int i=0; i<rear; i++){
			items[i]=null;
		}
		front=0;
		rear=0;	
	}
	
	@Override
	public String toString() {

		 StringBuilder stBuilder = new StringBuilder();
	        for (String item : items) {
	        	if(item!=null)
	            stBuilder.append(item +" ");
	        }
	        return stBuilder.toString();
	}
	
	public boolean remove(String value) {
		// TODO Auto-generated method stub
		return false;
	}
}
