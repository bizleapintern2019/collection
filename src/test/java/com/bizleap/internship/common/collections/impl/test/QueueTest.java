package com.bizleap.internship.common.collections.impl.test;

import org.junit.Test;

import com.bizleap.internship.common.collections.Collections;
import com.bizleap.internship.common.collections.Fifo;
import com.bizleap.internship.common.collections.impl.Queue;

public class QueueTest {
	public void insertDataCyclic(Fifo queue){	
		for(int i=0; i<100; i++){
			queue.add(""+i);
			queue.poll();
		}
	}
	
	public void insertDataResize(Fifo queue){	
		for(int i=0; i<100; i++){
			queue.add(""+i);
		}
	}

	@Test
	public void queueTest() {
		Fifo queue = new Queue();
		insertDataCyclic(queue);
		//insertDataResize(queue);
		System.out.println("Queue : "+queue);
	}
}
