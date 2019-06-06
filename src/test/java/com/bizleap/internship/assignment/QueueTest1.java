package com.bizleap.internship.assignment;

import org.junit.Test;

import com.bizleap.internship.common.collections.Queue;
import com.bizleap.internship.common.collections.impl.QueueImpl;

public class QueueTest1 {

	@Test
	public void main() {
		// TODO Auto-generated method stub
		Queue queue = new QueueImpl();
		queue.enqueue("Kaung");
		queue.enqueue("Pyae");
		queue.enqueue("Sone");
		queue.enqueue("Tun");
		
		System.out.println(queue.hasContain("Pyae"));
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		queue.clear();
		System.out.println(queue.dequeue());
		System.out.println(queue.hasContain("Sone"));
	}

}
