package com.bizleap.internship.assignment;

import com.bizleap.internship.common.collections.impl.QueueImpl;

public class QueueTest {
	
	public static void main(String[] args) {
		QueueImpl queue = new QueueImpl(5);
		queue.add("Soe");
		queue.add("Min");
		queue.add("Thein");
		queue.add("Kaung");
		queue.add("Pyae");
		queue.poll();
		queue.poll();
	
		//System.out.println(queue.poll());
		
		//queue.poll();
		//queue.poll();
	
	
		System.out.println(queue.toStirng());
		//queue.clear();
		//System.out.println(queue.contains("Soe"));

	}

}
