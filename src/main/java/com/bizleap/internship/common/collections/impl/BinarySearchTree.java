package com.bizleap.internship.common.collections.impl;

import com.bizleap.internship.common.collection.BinaryTreeOperation;

public class BinarySearchTree implements BinaryTreeOperation{
	private BinaryTreeNode root;

	public BinarySearchTree(){
		root = null;
	}

	/*public void add(int value) {
		System.out.println("Inserting" + value);

		if(root == null) {
			root = new BinaryTreeNode(value);
		} else addRecursive(root, value);
		System.out.println("------------------------------------------------------");
	}

	private void addRecursive(BinaryTreeNode current, int value) {

		if (value < current.getValue()) {
			if(current.getLeft()==null) 
				current.setLeft(new BinaryTreeNode(value));
			else addRecursive(current.getLeft(), value); 
		} 
		if (value > current.getValue()) {
			if(current.getRight()==null) 
				current.setRight(new BinaryTreeNode(value));
			else addRecursive(current.getRight(), value);
		} 
	}*/
	
	public void add2(int value) {
		root = addRecursive2(root, value);
	}

	private BinaryTreeNode addRecursive2(BinaryTreeNode current, int value) {
		if (current == null) {
			return new BinaryTreeNode(value);
		}
		else{
			if (value < current.getValue()) {
				current.setLeft(addRecursive2(current.getLeft(), value));
			}
			else if (value > current.getValue()) {
				current.setRight(addRecursive2(current.getRight(), value));
			}
			return current;
		}
	}

	public boolean containsNode(int value) {
		return containsNodeRecursive(root, value);
	}

	private boolean containsNodeRecursive(BinaryTreeNode current, int value) {
		if (current == null) {
			return false;
		} 
		if (value == current.getValue()) {
			return true;
		} 
		return value < current.getValue() ? containsNodeRecursive(current.getLeft(), value): containsNodeRecursive(current.getRight(), value);
	}

	public int search(int value){
		if(containsNodeRecursive(root,value)){
			return value;
		}
		return 0;
	}

	public void delete(int value) {
		root = deleteRecursive(root, value);
	}

	/*
	 * @param node  root of the current tree
	 * @param value  the value of target node to be deleted
	 * 
	 */
	private BinaryTreeNode deleteRecursive(BinaryTreeNode node, int value) {
		if (node == null) 
			return null;

		if (value < node.getValue()) //input is in left side
			
			// Set the left side of this node with the revised tree resulting from deletion in the recursive call
			node.setLeft(deleteRecursive(node.getLeft(), value));

		else if (value > node.getValue())  //input is in right side
			
			// Set the right side of this node with the revised tree resulting from deletion in the recursive call
			node.setRight(deleteRecursive(node.getRight(), value));
		
		else {     // the node to be deleted is found;find a child for a replacement node 
			
			if (node.getLeft() == null) 
				// return the right side of this node to attach back to the tree as the current node is going to be deleted
				return node.getRight();

			else if (node.getRight() == null) 
				// return the left side of this node to attach back to the tree as the current node is going to be deleted
				return node.getLeft();

			else{// nodes with both left and right child
				
				// find the replacement maximum node
				BinaryTreeNode replacementNode = getMaximumValueNode(node.getLeft());

				//remove the replacement node from the tree
				node.setLeft(deleteRecursive(node.getLeft(),replacementNode.getValue()));

				// update the replacement node with the target node information
				replacementNode.setLeft(node.getLeft());
				replacementNode.setRight(node.getRight());

				// return the replacement node to be attached to the tree so that the current node will be dropped from the tree 
				return replacementNode;
			}
		}
		// current node is not the one to be deleted so return it back to the tree
		// @see 72 & 77
		return node;
	}

	private BinaryTreeNode getMaximumValueNode(BinaryTreeNode node) {
		if(node.getRight()==null){
			return node;
		}else{
			BinaryTreeNode maximumNode = getMaximumValueNode(node.getRight());
			return maximumNode;
		}
	}

	public String inorder(){
		StringBuilder sb=new StringBuilder();
		return traverseInOrder(root,sb);
	}

	private String traverseInOrder(BinaryTreeNode node,StringBuilder sb) {
		if (node != null) {
			traverseInOrder(node.getLeft(),sb);
			sb.append(" " + node.getValue());
			traverseInOrder(node.getRight(),sb);
		}
		return sb.toString();
	}

	public String preorder(){
		StringBuilder sb=new StringBuilder();
		return traversePreOrder(root,sb);
	}

	private String traversePreOrder(BinaryTreeNode node,StringBuilder sb) {
		if (node != null) {
			sb.append(" " + node.getValue());
			traversePreOrder(node.getLeft(),sb);
			traversePreOrder(node.getRight(),sb);
		}
		return sb.toString();
	}

	public String postorder(){
		StringBuilder sb=new StringBuilder();
		return traversePostOrder(root,sb);
	}

	private String traversePostOrder(BinaryTreeNode node,StringBuilder sb) {
		if (node != null) {
			traversePostOrder(node.getLeft(),sb);
			traversePostOrder(node.getRight(),sb);
			sb.append(" " + node.getValue());
		}
		return sb.toString();
	}
}

