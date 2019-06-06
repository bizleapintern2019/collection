package com.bizleap.internship.common.collections.impl;

import com.bizleap.internship.common.collections.BinaryTreeOperations;

public class BinaryTree implements BinaryTreeOperations {
	private BinaryNode root;

	public BinaryTree() {
	}
	
	//get root
	public BinaryNode getRoot() {
		return root;
	}
	
	//insert methods
	public void insert(int value) {
		if(root == null) {
			root = new BinaryNode(value); //create a new tree.
		} else insertRecursive(root, value);
	}

	private void insertRecursive(BinaryNode current, int value) {
		
		if (value < current.getValue()) {
			if(current.getLeft()==null) {
				current.setLeft(new BinaryNode(value));
			}
			else insertRecursive(current.getLeft(), value); 
		} 
		if (value > current.getValue()) {
			if(current.getRight()==null) {
				current.setRight(new BinaryNode(value));
			}
			else insertRecursive(current.getRight(), value);
		} 
	}

	//contains methods
	public boolean contains(int value) {
		    return containsRecursive(root, value);
	}

	private boolean containsRecursive(BinaryNode current, int value) {
		if (current == null) {
	        return false;
	    } 
	    if (current.getValue() == value) {
	        return true;
	    } 
	    return value < current.getValue() ? containsRecursive(current.getLeft(), value) : containsRecursive(current.getRight(), value);
	}
	
	//search methods
	public BinaryNode search(int value) {
	    return searchRecursive(root, value); //search the whole tree and return
    }

	private BinaryNode searchRecursive(BinaryNode current, int value) {
		if (current == null) {
	        return null;	// there is no searched node in the tree.
	    } 
	    if (current.getValue() == value) {
	        return current;	// current is the searching node.
	    } 
	    if (value< current.getValue())
	    	return searchRecursive(current.getLeft(),value); 	//go and search to the left of the tree.
		    return searchRecursive(current.getRight(),value);	//go and search to the right of the tree.
		}

	//delete a node
	public void deleteNode(int value) {
		delete(root,value);
	}

	private BinaryNode delete(BinaryNode current,int value) {
		
		 if(current==null)
			   return null;					 //there is no node wanted to delete in the tree.
			 
		 if(value==current.getValue()) {	//found that node
			
			 if(current.getLeft()!=null && current.getRight()!=null){	// it has two childs
				   
				    BinaryNode minNode = getSmallestNodeFromRight(current.getRight());		// search smallest node at the right side
				    current.setValue(minNode.getValue());									// replace that node's value with the smallest node's value
				    current.setRight(delete(current.getRight(), minNode.getValue()));		// delete the smallest node
				    
			  }else if(current.getLeft()==null) 	//it has right child
				  current= current.getRight();  	// replace that node with the right child node
			  else
				  current=current.getLeft();		// replace that node with the left child node
		 }
			 //search the node wanted to delete.
		 else if(value>current.getValue()){
			 //the node is at the right side
			  current.setRight(delete(current.getRight(), value));		//after the node is deleted,the result right node is put at the right side of the parent.
		 }else current.setLeft(delete(current.getLeft(), value));		//after the node is deleted,the result left node is put at the left side of the parent.
		 
		 return current;// return the node
	}
	
	// search and return the node that is smallest at the right side of deleted node.
	private BinaryNode getSmallestNodeFromRight(BinaryNode node) {
		  if(node.getLeft()==null){
			  return node;
		  }else{
			   BinaryNode smallestNode = getSmallestNodeFromRight(node.getLeft());
			   return smallestNode;
		  }
	}
	
	//search and return the node that is smallest at the right side of deleted node.
	private BinaryNode getLargestNodeFromLeft(BinaryNode node) {
		  if(node.getRight()==null){
			  return node;
		  }else{
			   BinaryNode largestNode = getSmallestNodeFromRight(node.getRight());
			   return largestNode;
		  }
	}


	//inorder traversal
	public void inOrder() {
	    inOrderRecursive(root);
	}
	private void inOrderRecursive(BinaryNode node) {
		if (node == null) 
			return; 
		inOrderRecursive(node.getLeft());
		System.out.print(" "+ node.getValue());
		inOrderRecursive(node.getRight());
	}
	
	//preorder traversal
	public void preOrder() {
	    preOrderRecursive(root);
	}
	private void preOrderRecursive(BinaryNode node) {
		if (node == null) 
			return; 
		System.out.print(" "+ node.getValue());
		preOrderRecursive(node.getLeft());
		preOrderRecursive(node.getRight());
	}
	
	//postorder traversal
	public void postOrder() {
	    postOrderRecursive(root);
	}
	private void postOrderRecursive(BinaryNode node) {
		if (node == null) 
			return; 
		postOrderRecursive(node.getLeft());
		postOrderRecursive(node.getRight());
		System.out.print(" "+ node.getValue());
	}

	@Override
	public String toString() {
		return "BinaryTree [root=" + root + "]";
	}
}