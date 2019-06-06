package com.bizleap.internship.common.collection.impl;

import com.bizleap.internship.common.collection.BTree;

public class BinaryTreeMax implements BTree {
	private BinaryTreeNode root;
	int count = 0;

	public BinaryTreeMax() {
		root = null;
	}

	public void insert2(int value) {
		 root = insertRecursive(root, value);
	}

	/*
	 @param current  the root of the current tree
	 @param value  the value of target node to be deleted
	 */
	private BinaryTreeNode insertRecursive(BinaryTreeNode current, int value) {
		if(current == null) {
			//System.out.println(current + ": " +value);
			return new BinaryTreeNode(value);
		}
		if(value < current.getValue()) 
			current.setLeft(insertRecursive(current.getLeft(),value));
		else if(value > current.getValue()) 
			current.setRight(insertRecursive(current.getRight(), value));

		//System.out.println(current.getValue() + ": " +value);
		return current;
	}

	public void insert(int value) {
		if (root == null) {
			root = new BinaryTreeNode(value);
		} else insert(root, value);
	}

	private void insert(BinaryTreeNode current, int value) {

		if (value < current.getValue()) {
			if (current.getLeft() == null) {
				current.setLeft(new BinaryTreeNode(value));
			} else insert(current.getLeft(), value);
		}

		if (value > current.getValue()) {
			if (current.getRight() == null) {
				current.setRight(new BinaryTreeNode(value));
			} else insert(current.getRight(), value);
		}
	}

	public void delete(int value) {
		root = delete(root, value);
	}

	/*
	 @param current  the root of the current tree
	 @param value  the value of target node to be deleted
	 */
	private BinaryTreeNode delete(BinaryTreeNode current, int value) {
		if (current == null) 
			return null;

		if (value < current.getValue()) // input is in left side

			// set the left side of this node with the revised tree resulting from deletion in the recursive call 
			current.setLeft(delete(current.getLeft(), value));

		else if (value > current.getValue())  //input is in right side

			// set the right side of this node with the revised tree resulting from deletion in the recursive call 
			current.setRight(delete(current.getRight(), value));

		else {     // delete node is found
			if (current.getLeft() == null)
				// return the right side of this node to attach back to the tree as the current node
				// is going to be deleted
				return current.getRight();

			else if (current.getRight() == null) // node with one left child
				return current.getLeft();

			// nodes with both left and right child

			//find the replacement node from the tree
			//min ko phote lite p min yae left bat ka kg ko tin pay lite p
			BinaryTreeNode replacementNode = getMaximumValueNode(current.getLeft());

			//12 ko phote cha lite tl
			//remove the replacement node from the tree(ngar replace lote mae kg ko tawe p min aee mar delete lite tot)
			current.setLeft(delete(current.getLeft(), replacementNode.getValue()));

			//left nae right ko pyan retain lote ya ml
			//update the replacement node with the target node information
			replacementNode.setLeft(current.getLeft());
			replacementNode.setRight(current.getRight());

			//return the replacement node to be attached to the tree so that
			//current node will be drop from the tree

			//12 ka d ka pyan twr mhr p yin line no: 105,110 tawe mr win mr
			//20 ka 12 htet gyi yin right ko twr gyi yin left ko twr
			return replacementNode;
		}
		//current node is not the out to be deleted so it will go back to the tree
		//@see 51 & 56
	
		return current;
	}

	private BinaryTreeNode getMaximumValueNode(BinaryTreeNode node) {
		return node.getRight() == null? node : getMaximumValueNode(node.getRight());
	}


	public boolean contains(int value) {
		return contains(root, value);
	}

	private boolean contains(BinaryTreeNode current, int value) {
		if (current.getValue() == value)
			return true;

		if (current.getLeft() != null)
			if (contains(current.getLeft(), value))
				return true;

		if (current.getRight() != null)
			if (contains(current.getRight(), value))
				return true;

		return false;
	}

	public int search(int key) {
		if(contains(root,key))
			return key;
		return 0;
	}
	/* Function for inorder traversal Left,Root,Right */
	public String inorder() {
		StringBuilder sb = new StringBuilder();
		return inorder(root, sb);
	}

	private String inorder(BinaryTreeNode current, StringBuilder sb) {
		if (current != null) {
			inorder(current.getLeft(), sb);
			sb.append(current.getValue() + " ");
			inorder(current.getRight(), sb);
		}
		return sb.toString();
	}

	/* Function for preorder traversal Root,Left,Right */
	public String preorder() {
		StringBuilder sb = new StringBuilder();
		return preorder(root, sb);
	}

	private String preorder(BinaryTreeNode current, StringBuilder sb) {
		if (current != null) {
			sb.append(current.getValue() + " ");
			preorder(current.getLeft(), sb);
			preorder(current.getRight(), sb);
		}
		return sb.toString();
	}

	/* Function for postorder traversal Left,Right,Root */
	public String postorder() {
		StringBuilder sb = new StringBuilder();
		return postorder(root, sb);
	}

	private String postorder(BinaryTreeNode current, StringBuilder sb) {
		if (current != null) {
			postorder(current.getLeft(), sb);
			postorder(current.getRight(), sb);
			sb.append(current.getValue() + " ");
		}
		return sb.toString();
	}
}