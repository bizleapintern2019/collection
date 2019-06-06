package com.bizleap.intern.assignment.collections.impl;

import com.bizleap.internship.assignments.common.collection.BinaryTreeInterface;

public class BinarySearchTree implements BinaryTreeInterface{
	private   BinaryNode root;

	public BinarySearchTree(){
		this.root = null;
	}
	public boolean contains(int data){
		return containsRecursive(root,data);
	}
	private boolean containsRecursive(BinaryNode root,int data){
		if(root==null){
			return false;
		}
		if(root.getData()==data){
			return true;
		}
		return data<root.getData()?containsRecursive(root.getLeft(),data):containsRecursive(root.getRight(),data);
	}

	public void insert(int data) {
		System.out.println("Inserting" + data);

		if(root == null) {
			root = new BinaryNode(data);
		} else insertRecursive(root, data);
		System.out.println("------------------------------------------------------");
	}

	private void insertRecursive(BinaryNode current, int data) {
		if (data < current.getData()) {
			if(current.getLeft()==null){ 
				current.setLeft(new BinaryNode(data));
			}else insertRecursive(current.getLeft(),data);
		} 

		if (data > current.getData()) {
			if(current.getRight()==null) {
				current.setRight(new BinaryNode(data));
			} else insertRecursive(current.getRight(), data);
		} 
	}

	public void delete(int value) {
		root = deleteRecursive(root, value);
	}
	private BinaryNode deleteRecursive(BinaryNode current, int value) {
		if (current == null) 
			return null;

		if (value < current.getData()) //input node  is in left side
			//set the left side of this node with revised tree resulting from deletion in the recursive call
			current.setLeft(deleteRecursive(current.getLeft(), value));
		else if (value > current.getData())  //input is in right side
			//set the right side of this node with revised tree resulting from deletion in the recursive call
			current.setRight(deleteRecursive(current.getRight(), value));

		else {     // delete node is found
			if (current.getLeft() == null)
				//return the right side of this node to attach back to the tree as the current node is going to be deleted
				return current.getRight();

			else if (current.getRight() == null) 
				//return the left side of this node to attach back to the tree as the current node is going to be deleted
				return current.getLeft();

			else{// nodes with both left and right child
				//find the replacement minimum node
				BinaryNode replacementNode=getminimumValueNode(current.getRight());
				//remove the replacement node from the tree
				current.setRight(deleteRecursive(current.getRight(),replacementNode.getData()));
				//update the replacement node with the target node information
				replacementNode.setLeft(current.getLeft());
				replacementNode.setRight(current.getRight());
				//return the replacement node to be attached to the tree so that the current node will be dropped from the tree
				return replacementNode;
			}
		}
		//current is not the one to be deleted so return it back to the tree
		return current;
	}

	private BinaryNode getminimumValueNode(BinaryNode node) {
		if(node.getLeft()==null){
			return node;
		}else{
			BinaryNode smallNode = getminimumValueNode(node.getLeft());
			return smallNode;
		}
	}

	public String inorder() {
		StringBuilder stringBuilder = new StringBuilder();
		return inorder(root, stringBuilder);
	}

	private String inorder(BinaryNode root, StringBuilder stringBuilder) {
		if (root != null) {
			inorder(root.getLeft(), stringBuilder);
			stringBuilder.append(root.getData() + " ");
			inorder(root.getRight(), stringBuilder);
		}
		return stringBuilder.toString();
	}

	public String preorder() {
		StringBuilder sb = new StringBuilder();
		return preorder(root, sb);
	}

	private String preorder(BinaryNode root, StringBuilder sb) {
		if (root != null) {
			sb.append(root.getData() + " ");
			preorder(root.getLeft(), sb);
			preorder(root.getRight(), sb);
		}
		return sb.toString();
	}

	public String postorder() {
		StringBuilder sb = new StringBuilder();
		return postorder(root, sb);
	}

	private String postorder(BinaryNode root, StringBuilder sb) {
		if (root != null) {
			postorder(root.getLeft(), sb);
			postorder(root.getRight(), sb);
			sb.append(root.getData() + " ");
		}
		return sb.toString();
	}
	@Override
	public String toString() {
		return "BinarySearchTree [root=" + root + "]";
	}
	/*public boolean delete(int key){
	BinaryNode parent = root;
	BinaryNode current = root;
	boolean isLeftChild = false;
	while(current.getData()!=key){
		parent = current;
		if(current.getData()>key){
			isLeftChild = true;
			current = current.left;
		}else{
			isLeftChild = false;
			current = current.right;
		}
		if(current ==null){
			return false;
		}
	}

	if(current.left==null && current.right==null){
		if(current==root){
			root = null;
		}
		if(isLeftChild ==true){
			parent.left = null;
		}else{
			parent.right = null;
		}
	}

	else if(current.getRight()==null){
		if(current==root){
			root = current.getLeft();
		}else if(isLeftChild){
			parent.left = current.left;
		}else{
			parent.right = current.left;
		}
	}
	else if(current.getLeft()==null){
		if(current==root){
			root = current.getRight();
		}else if(isLeftChild){
			parent.left = current.right;
		}else{
			parent.right = current.right;
		}
	}else if(current.getLeft()!=null && current.getRight()!=null){

		BinaryNode successor= getSuccessor(current);
		if(current==root){
			root = successor;
		}else if(isLeftChild){
			parent.left = successor;
		}else{
			parent.right = successor;
		}			
		successor.left = current.left;
	}		
	return true;		
}*/
	/*public BinaryNode getSuccessor(BinaryNode deleteNode){
	BinaryNode successsor =null;
	BinaryNode successsorParent =null;
	BinaryNode current = deleteNode.right;
	while(current!=null){
		successsorParent = successsor;
		successsor = current;
		current = current.left;
	}

	if(successsor!=deleteNode.getRight()){
		successsorParent.left = successsor.getRight();
		successsor.right= deleteNode.getRight();
	}
	return successsor;
}*/

	/*public void inorderRecursive(BinaryNode root) {
	if (root != null) {
		inorderRecursive(root.getLeft());
		System.out.print(root.getData() + " ");
		inorderRecursive(root.getRight());
	}
}*/
	/*public void insert(int key){
	BinaryNode newNode = new BinaryNode(key);
	if(root==null){
		root = newNode;
		//return;
	}
	BinaryNode current = root;
	BinaryNode parent = null;
	while(true){
		parent = current;
		if(key<current.getData()){				
			current = current.getLeft();
			if(current==null){
				parent.left= newNode;
				return;
			}
		}else{
			current = current.right;
			if(current==null){
				parent.right = newNode;
				return;
			}
		}
	}
}*/
	/*public boolean contains(int key){
		BinaryNode current = root;
		while(current!=null){
			if(current.getData()==key){
				return true;
			}else if(current.getData()>key){
				current = current.left;
			}else{
				current = current.right;
			}
		}
		return false;
	}*/

}



