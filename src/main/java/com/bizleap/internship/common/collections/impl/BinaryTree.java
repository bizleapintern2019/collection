package com.bizleap.internship.common.collections.impl;

import com.bizleap.internship.common.collection.BinaryTreeOperation;

public class BinaryTree implements BinaryTreeOperation{
	private BinaryTreeNode root;

	public BinaryTree(){
		root = null;
	}

	public void add(int value) {
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

	private BinaryTreeNode deleteRecursive(BinaryTreeNode current, int value) {
		if (current == null) 
			return null;

		if (value < current.getValue()) //input is in left side
			
			// Set the left side of this node with the revised tree resulting from deletion in the recursive call
			current.setLeft(deleteRecursive(current.getLeft(), value));

		else if (value > current.getValue())  //input is in right side
			
			// Set the right side of this node with the revised tree resulting from deletion in the recursive call
			current.setRight(deleteRecursive(current.getRight(), value));
		
		else {     // check for child when the node to delete is found
			
			if (current.getLeft() == null) 
				// return the right side of this node to attach back to the tree as the current node is going to be deleted
				return current.getRight();

			else if (current.getRight() == null) 
				// return the left side of this node to attach back to the tree as the current node is going to be deleted
				return current.getLeft();

			else{// nodes with both left and right child
				/*current.setValue(getMinimumValueNode(current.getRight()).getValue());
			current.setRight(deleteRecursive(current.getRight(),current.getValue()));*/

				// find the replacement minimum node
				BinaryTreeNode replacementNode = getMinimumValueNode(current.getRight());

				//remove the replacement node from the tree
				current.setRight(deleteRecursive(current.getRight(),replacementNode.getValue()));

				// update the replacement node with the target node information
				replacementNode.setLeft(current.getLeft());
				replacementNode.setRight(current.getRight());

				// return the replacement node to be attached to the tree so that the current node will be dropped from the tree 
				return replacementNode;
			}
		}
		return current;
	}

	private BinaryTreeNode getMinimumValueNode(BinaryTreeNode node) {
		if(node.getLeft()==null){
			return node;
		}else{
			BinaryTreeNode smallNode = getMinimumValueNode(node.getLeft());
			return smallNode;
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

	public int getRootNode() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void add2(int value) {
		// TODO Auto-generated method stub
		
	}
}
