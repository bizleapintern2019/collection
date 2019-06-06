package com.bizleap.internship.common.collections.impl;

import com.bizleap.internship.common.collections.Tree;

public class BinaryTree implements Tree {

	private BinaryNode node;

	public BinaryTree() {

	}

	public void insert(int value) {
		System.out.println("Inserting " + value + "\n");
		if(node == null) 
			node = new BinaryNode(value);
		else insertRecursive(node, value);
	}

	private void insertRecursive(BinaryNode node, int value) {

		if (value < node.getValue()) {
			if(node.getLeft() == null) 
				node.setLeft(new BinaryNode(value));

			else insertRecursive(node.getLeft(), value); 
		} 

		if (value > node.getValue()) {
			if(node.getRight() == null) 
				node.setRight(new BinaryNode(value));

			else insertRecursive(node.getRight(), value);
		}
	} 

	public boolean contains(int value) {
		return containsRecursive(node, value);
	}

	private boolean containsRecursive(BinaryNode node, int value) {
		if (node == null) {
			return false;
		} 
		if (node.getValue() == value) {
			return true;
		} 
		return value < node.getValue() ? containsRecursive(node.getLeft(), value) : containsRecursive(node.getRight(), value);
	}

	public void inOrder() {
		inOrderRecursive(node);
	}

	private void inOrderRecursive(BinaryNode node) {
		if (node == null) 
			return; 
		inOrderRecursive(node.getLeft());
		System.out.print(node.getValue() + " ");
		inOrderRecursive(node.getRight());
	}

	public void preOrder() {
		preOrderRecursive(node);
	}

	private void preOrderRecursive(BinaryNode node) {
		if (node == null) 
			return; 
		System.out.print(node.getValue() + " ");
		preOrderRecursive(node.getLeft());
		preOrderRecursive(node.getRight());
	}

	public void postOrder() {
		postOrderRecursive(node);
	}

	private void postOrderRecursive(BinaryNode node) {
		if (node == null) 
			return; 
		postOrderRecursive(node.getLeft());
		postOrderRecursive(node.getRight());
		System.out.print(node.getValue() + " ");
	}

	//Use the minimum from right
	public void delete(int value) {
		System.out.println("Deleting " + value + "\n");
		node = deleteRecursive(node, value);
	}

	private BinaryNode deleteRecursive(BinaryNode node, int value) {

		if (node == null) 	
			return null;

		if (value < node.getValue()) // the input node is in the left side
			
			// Set the left side of this node with the revised tree resulting from deletion in the recursive call
			node.setLeft(deleteRecursive(node.getLeft(), value)); 

		else if(value > node.getValue()) // the input node is in the right side
			
			// Set the right side of this node with the revised tree resulting from deletion in the recursive call
			node.setRight(deleteRecursive(node.getRight(), value));

		else { 		// check for child when the node to delete is found
			
			if(node.getLeft() == null)    
				// return the right side of this node to attach back to the tree as the current node is going to be deleted
				return node.getRight();		

			else if(node.getRight() == null)  
				// return the left side of this node to attach back to the tree as the current node is going to be deleted
				return node.getLeft();

			else {  // nodes with left and right child 
								
				//find the replacement minimum node 
				BinaryNode replacementNode = getMinimumValueNode(node.getRight());
				
				//remove the replacement node from the tree
				node.setRight(deleteRecursive(node.getRight(), replacementNode.getValue()));
				
				//update the replacement node with the target node information
				replacementNode.setLeft(node.getLeft());
				replacementNode.setRight(node.getRight());
				
				//return the replacement node to be attached to the tree so that the current node will be dropped from the tree
				return replacementNode;
			}
		}
		// current node is not the one to be deleted so return it back to the tree
		// @see 101 & 106
		return node;
	}

	private BinaryNode getMinimumValueNode(BinaryNode node) {
		if(node.getLeft() == null) 
			return node;
		else 
			return  getMinimumValueNode(node.getLeft());
	}

	@Override
	public String toString() {
		return "BinaryTree [node=" + node + "]";
	}
}