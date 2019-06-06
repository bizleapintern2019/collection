package com.bizleap.internship.common.collections.impl.test;

import org.junit.Test;

import com.bizleap.internship.common.collection.Fifo;
import com.bizleap.internship.common.collections.impl.Queue;

public class QueueTest {
	@Test
	public void cyclicTest() {
		Fifo queue=new Queue();
		for(int i=0;i<100;i++){
			queue.add("a");
			queue.poll();
		}
		System.out.println(queue.capacity());

		for(int i=0;i<100;i++){
			queue.add("a");
		}

		System.out.println(queue.capacity());
		queue.clear();

		queue.add("1");
		queue.add("2");
		queue.add("3");
		queue.add("4");
		queue.add("5");
		queue.add("6");
		queue.add("7");
		queue.add("8");
		queue.add("9");
		queue.add("10");
		queue.add("11");

		System.out.println(queue.size());
		System.out.println(queue.peek());
		System.out.println(queue.contains("6"));
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue);
		queue.remove("6");
		System.out.println(queue);
		queue.clear();
		System.out.println(queue);
	}
}
