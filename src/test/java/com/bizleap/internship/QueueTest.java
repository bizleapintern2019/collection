package com.bizleap.internship;

import org.junit.Test;

import com.bizleap.intenship.common.collection.Fifo;
import com.bizleap.intenship.common.collection.impl.Queue;

public class QueueTest {
	
	@Test
	public void Queuetest () {
		Fifo queue = new Queue();
		//for cyclic
		for(int i=0;i<100;i++) {
			queue.add("a");
			queue.poll();
		}
		
		//for resize
		for(int i=0;i<100;i++) {
			queue.add("a");
		}
		queue.clear();
		
        queue.add("Nyan");
        queue.add("Lin");
        queue.add("Htet");
        queue.add("Shine");
        queue.add("Wanna");
        queue.add("Thuya");
        queue.add("Oo");
        
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue.peek());
        System.out.println(queue.contains("Oo"));
        System.out.println(queue.remove("Htet"));
        System.out.println(queue);
        System.out.println(queue.size());
        queue.clear();
        System.out.println(queue);
		
	}
}
