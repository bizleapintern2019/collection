package com.bizleap.internship.common.collection.impl.test;

import org.junit.Test;

import com.bizleap.internship.common.collection.Fifo;
import com.bizleap.internship.common.collection.impl.QueueImpl;

public class QueueTest {
	
	@Test
	public void cycleQueueTest() {
		Fifo queueTest = new QueueImpl();
		for(int i=0;i<100;i++)
		{
			queueTest.add("Data");
			queueTest.poll();
		}
		System.out.println(queueTest.capacity());
		
		queueTest.add("1");
		queueTest.add("2");
		queueTest.add("3");
		queueTest.add("4");
		queueTest.add("5");
		queueTest.add("5");
		queueTest.add("6");
		queueTest.add("7");
		queueTest.add("8");
		queueTest.add("9");
		queueTest.add("10");
		
		System.out.println(queueTest.poll());
		System.out.println(queueTest.capacity());
		System.out.println(queueTest.size());
		System.out.println(queueTest.remove("5"));
		System.out.println(queueTest.size());
		System.out.println(queueTest);
		System.out.println(queueTest.peek());
		System.out.println(queueTest.poll());
		System.out.println(queueTest.contains("1"));
		System.out.println(queueTest);
		queueTest.clear();
		System.out.println(queueTest);
	}
}
