package com.bizleap.internship.assignments.common.collections.impl;

import java.util.Arrays;
import java.util.List;

import com.bizleap.internship.assignments.common.collection.Queue;

public class QueueImpl implements Queue {
	private int capacity;
	private int size;
	private int front;
	private int rear;
	private String[] items;

	public QueueImpl(){
		this.front=0;
		this.rear=0;
		this.capacity=20;
		items=new String[capacity];
	}
	private void shift(){
		int count=0;
		for(int i=front;i<rear;i++)
			items[count++]=items[i];
		rear=count;
		front=0;
	}
	public String peek(){
		return items[front];
	}

	public void enqueue(String data){
		if(rear>=capacity)
			if(items[0]==null)
				shift();
			else
			resize();
		items[rear++]=data;
	}

	public String dequeue(){
		if(rear<=front)
			return null;
		String value=items[front];
		items[front++]=null;
		return value;
	}

	public int size(){
		return size;
	}

	public void resize(){
		size*=2;
		String[] resizeItem=new String[size];
		for(int i=0;i<items.length;i++){
			resizeItem[i]=items[i];
		}
		items=resizeItem;
	}

	public void clear(){
		for(int i=0;i<=rear;i++){
			items[i]=null;
		}
		rear=0;
		front=0;
	}

	public boolean contains(String input){
		for(int i=front;i<rear;i++)
			if(items[i].equals(input))
				return true;
		return false;
	}
	public boolean remove(String input){
		for(int i=front;i<rear;i++)
			if(items[i].equals(input)){
				items[i]=null;
				for(int j=i;j<rear;j++)
					items[j]=items[j+1];
				rear--;
				return true;
			}
			return false;
	}
	public String toString(){
		StringBuilder stringBuilder=new StringBuilder();
		if(rear<=0)
			return "[]";
		for(int i=0;i<rear;i++){
			if(i==0)
				stringBuilder.append("[");
			if(items[i]!=null){
				stringBuilder.append(items[i]);
				if(i>=rear-1)
					stringBuilder.append("]");
				else
					stringBuilder.append(",");
			}
		}
		return stringBuilder.toString();
	}
}



