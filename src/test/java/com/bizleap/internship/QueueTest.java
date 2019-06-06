package com.bizleap.internship;

import com.bizleap.internship.common.collections.Fifo;
import com.bizleap.internship.common.collections.impl.Queue;

public class QueueTest {
	
	public static void main(String[] args) {
		
		Fifo queueTest =new Queue();

		queueTest.add("Saw Sandi Tin");
		queueTest.add("Su Pyae Naing");
		queueTest.add("Khin Chanmyae Thu");
		queueTest.add("San Thinzar Linn");
		queueTest.add("Ya Mone Zin");
		queueTest.add("Shin Wanna");
		queueTest.add("Nyan Linn Htet");	
		queueTest.add("Thura Oo");
		queueTest.add("Soe Min Thein");
		queueTest.add("Kaung Pyaesone Htun");
		
		System.out.println(queueTest.contains("San Thinzar Linn"));
		System.out.println(queueTest.poll());
		System.out.println(queueTest.poll());
		System.out.println(queueTest.poll());
		System.out.println(queueTest.poll());
		System.out.println(queueTest.poll());
		System.out.println(queueTest.poll());
		System.out.println(queueTest.poll());
		System.out.println(queueTest.poll());
		System.out.println(queueTest.poll());
		System.out.println(queueTest.poll());
		
	}
}