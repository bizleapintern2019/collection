package com.bizleap.internship.assignment;

import org.junit.Test;

import com.bizleap.internship.common.collections.Tree;
import com.bizleap.internship.common.collections.impl.BinaryTreeMax;

public class TreeTest1 {
	 enum Order { InOrder, PostOrder, PreOrder}
	 
	 @Test
	 public void main() {
		Tree binarytree = new BinaryTreeMax();
//		 binarytree.add(19);
//		 binarytree.add(7);
//		 binarytree.add(5);
//		 binarytree.add(15);
//		 binarytree.add(4);
//		 binarytree.add(6);
//		 binarytree.add(14);
//		 binarytree.add(16);
//		 binarytree.add(30);
//		 binarytree.add(31);
		 binarytree.add(50);
		 binarytree.add(30);
		 binarytree.add(70);
		 binarytree.add(20);
		 binarytree.add(40);
		 binarytree.add(60);
		 binarytree.add(90);
//		 binarytree.add(10);
//		 binarytree.add(22);
//		 binarytree.add(80);
//		 binarytree.add(100);
//		 binarytree.add(3);
//		 binarytree.add(12);
//		 binarytree.add(21);
//		 binarytree.add(26);
//		 binarytree.delete(5);
//		 System.out.println(binarytree.search(5));
//		 System.out.println(binarytree.getmaxNode());
//		 System.out.println(binarytree.getminNode());
		 String order = "PostOrder";
		 switch(order) {
		 case "InOrder": binarytree.traverseInOrder(binarytree.getRoot());break;
		 case "PostOrder": binarytree.traversePostOrder(binarytree.getRoot());break;
		 case "PreOrder": binarytree.traversePreOrder(binarytree.getRoot());break;
		 }
		 
	}

}
