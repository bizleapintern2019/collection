package com.bizleap.internship.common.collection.impl;

import com.bizleap.internship.common.collections.BTree;

public class BinarySearchTree implements BTree{
	private BinaryNode root;
	private int noOfNodes;

	public BinarySearchTree(){                                     
		root = null;
		noOfNodes = 0;
	}

	public boolean isEmpty(){
		return noOfNodes == 0;
	}

	public BinaryNode getRoot(){
		return root;
	}

	public int count(){
		return noOfNodes;
	}

	public int size(BinaryNode tree){

		if (tree == null)
			return 0;
		else
			return(1 + size(tree.getLeft()) + size(tree.getRight()));
	}

	public int height(BinaryNode tree){

		if (tree == null)
			return 0;
		else
			return (1 + Math.max(height(tree.getLeft()), height(tree.getRight())));
	}

	public void insert(int id,Object value){
		root = insertRecursive(getRoot(),id,value);
	}

	public BinaryNode insertRecursive(BinaryNode current, int key, Object value){
		if(current==null){
			return new BinaryNode(key,value);//if the space is found insert the node;
		}
		
		if(current.hasGreater(key)){
			//if key is less than current key, go to left and insert the node
			current.setLeft(insertRecursive(current.getLeft(),key,value));
		}else if(current.hasSmaller(key)){
			//if key is grater than current key, go to right and insert the node
			current.setRight(insertRecursive(current.getRight(),key,value));
		}
		//increase the number of node after inserting 
		noOfNodes++;
		//return the inserted value;
		return current;
	}

	public Object search(int key){
		return searchRecursive(root,key);//return the match node's value
	}

	private Object searchRecursive(BinaryNode current, int key){

		if (current == null){
			//if current node is null return 0
			return 0;
		} 
		if (current.hasKey(key)){
			//if key is equal to the current key return the current node's value
			return current.getData();
		} 
		//if key is less than current key go to left subtree and find the key or go to right subtree and find the key
		return current.hasGreater(key) ? searchRecursive(current.getLeft(), key) : searchRecursive(current.getRight(), key);
	}

	public void delete(int key){
		root=deleteRecursive(getRoot(),key);
	}

	public BinaryNode deleteRecursive(BinaryNode current,int key){

		if(current==null){
			return null;
		}
		//node to be deleted is found
		if(current.hasKey(key)){

				if(current.hasNoChild())// if no children just delete the node
					return null;
	
				if(current.hasRightChild())// if it has right child replace it with right subtree
					return current.getRight();
				
				if(current.hasLeftChild())// if it has left child replace it with left subtree
					return current.getLeft();
			
				// target node has two children so need to find the successor node
				BinaryNode leftSuccessor= getSuccessor(current.getLeft());//get maximum of the left side
				current.setLeft(deleteRecursive(current.getLeft(),leftSuccessor.getKey()));//delete the successor node from the tree
				//retain the target node's children information
				leftSuccessor.setLeft(current.getLeft());
				leftSuccessor.setRight(current.getRight());
				//to return the leftSuccessor node to be attached to the tree so that the current node will be dropped from the tree
				return leftSuccessor;
		}

	 if(current.hasSmaller(key)){	// larger than current node so delete from the right
		current.setRight(deleteRecursive(current.getRight(),key));
	}else{	// smaller than current node so delete from the left
		current.setLeft(deleteRecursive(current.getLeft(),key));
	}
	noOfNodes--;
	return current;
}

public BinaryNode getSuccessor(BinaryNode node){

	if(!node.hasRightChild())
		return node;
	return getSuccessor(node.getRight());
}

@Override
public String toString() {
	return "BinarySearchTree [root=" + root + ", noOfNodes=" + noOfNodes + "]";
}
}
