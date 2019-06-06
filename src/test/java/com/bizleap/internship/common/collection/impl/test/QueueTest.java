package com.bizleap.internship.common.collection.impl.test;

//import org.junit.Test;
import com.bizleap.internship.common.collections.Queue;
import com.bizleap.internship.common.collection.impl.QueueImpl;

public class QueueTest {
	public static void cyclicTest(Queue queue){
		for(int i=0; i<100; i++){
			queue.add(""+i);
			queue.poll();
		}
	}

	public static void resizeTest(Queue queue){
		for(int i=0;i<100;i++){
			queue.add(" "+i);
		}
	}
	//	@Test
	public static void main(String args[]){

		Queue queue = new QueueImpl();
		cyclicTest(queue);
//		resizeTest(queue);
		System.out.print(queue);
//		queue.add("Thi Han Hein");
//		queue.poll();
//		queue.add("Nyan Lin Htet");
//		queue.poll();
//		queue.add("Kay Zin Han");
//		queue.add("Harbe");
//		queue.add("San Thinzar Lin");
//		queue.add("Su Pyae Naing");
//		System.out.println(queue);
//
//				System.out.println("Original stack size: " + queue.getSize());
//				//	queue.clear();
//				System.out.println(queue.contains("Harbe"));
//				queue.remove("Kay Zin Han");
//				for(int i =0;i<queue.getSize();i++){
//					System.out.println(queue.poll());
//				}
	}
}
