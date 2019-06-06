package com.bizleap.internship.assignments.common.collections.impl.test;
import org.junit.Test;
import com.bizleap.internship.assignments.common.collections.Fifo;
import com.bizleap.internship.assignments.common.collections.impl.Queue;

public class QueueTest {
	public void cyclicTest(Fifo queue) {
		for(int i=0; i<100; i++) {
			queue.add("" + i);
			queue.poll();
		}
	}
	
	public void resizeTest(Fifo queue) {
		for(int i=0; i<100; i++) {
			queue.add("" + i);
		}
	}
	
	@Test
	public void queueTest() {
		Fifo queue = new Queue();
		cyclicTest(queue);
		resizeTest(queue);
		System.out.println(queue);
		
//		queue.add("korea");
//		queue.poll();
//		queue.add("memory");
//		queue.add("collection");
//		queue.add("garbage");
//		System.out.println(queue);
//		System.out.println(queue.contains("memory"));
//		System.out.println(queue.poll());
//		System.out.println(queue);
//		queue.clear();
//		System.out.println(queue);
	}
}