package com.bizleap.internship.assignments.common.collections.impl.test;

import com.bizleap.internship.assignments.common.collection.Queue;
import com.bizleap.internship.assignments.common.collections.impl.QueueImpl;

public class QueueTest {
	
	public static void main(String[] args) {
		Queue myQueue=new QueueImpl();
		for(int i=0;i<100;i++){
			myQueue.enqueue("kk");
			myQueue.dequeue();
		}
	//	System.out.println(myQueue.capacity());
		myQueue.enqueue("Hsu Hsu");
		myQueue.enqueue("Saw Sandi");
		myQueue.enqueue("Kayzin");
		myQueue.enqueue("San");
		myQueue.enqueue("Ma Ma");
		myQueue.enqueue("Aung Aung");
		myQueue.enqueue("Mg Mg");
		myQueue.enqueue("Mi Mi");
		myQueue.enqueue("Mo Mo");
		myQueue.enqueue("Myo Myo");
		System.out.println(myQueue.contains("Mi Mi"));
		System.out.println("resize of queue is "+myQueue.size());
		System.out.println("Enqueue list is "+myQueue);
		System.out.println(myQueue.dequeue());
		System.out.println(myQueue.dequeue());
		System.out.println(myQueue.dequeue());
		System.out.println(myQueue.dequeue());
		System.out.println("Dequeue  List---> "+myQueue);
		myQueue.clear();
		System.out.println(myQueue);
	
	}

}
