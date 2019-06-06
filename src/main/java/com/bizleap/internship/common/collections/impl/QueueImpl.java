package com.bizleap.internship.common.collections.impl;

import java.util.Arrays;

import com.bizleap.internship.common.collecitons.Queue;

public class QueueImpl implements Queue {
	private String[] queueAr;
	private int size;

	private int rear;
	private int front;

	public QueueImpl(int size) {
		this.size = size;
		queueAr = new String[this.size];
		rear = 0;
		front = 0;
	}

	public void add(String item) {
			if((rear-front)==size) {
				resize();
			}
			if (rear >= size || rear<=front)
				rear = 0;
			queueAr[rear++] = item;
	}

	public void resize() {
		String[] previous = queueAr;
		queueAr = new String[size *= 2];
		for (int i = 0; i < previous.length; i++)
			queueAr[i] = previous[i];
	}

	public String poll() {
		if((rear-front)==0)
			return null;
			String deletedValue = queueAr[front++];
			if(front>=size || rear<=front)
				front=0;
			return deletedValue;
	}

	public boolean contains(String item) {
		for(int i=0;i<queueAr.length;i++) {
			if (queueAr[i]==null) 
				return false;
			else if(queueAr[i].equals(item))
				return true;
		}
		return false;
	}

	public String toStirng() {
		return "Data in the Queue is :"+Arrays.toString(queueAr);
	}

	public void clear() {
		for(int i=0;i<queueAr.length;i++) {
			queueAr[i]=null;
			rear=0;
			front=0;
		}

	}
}
