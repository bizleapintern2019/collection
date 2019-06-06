package com.bizleap.intern.assignment.collections.impl;

import com.bizleap.internship.assignments.common.collection.BinaryTreeInterface;

public class BinaryTree implements BinaryTreeInterface{
	private   BinaryNode root;

	public BinaryTree(){
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

	/*public void insert(int data) {
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
*/
	public void insert(int data){
		root=insertRecursive(root,data);
	}
	private BinaryNode insertRecursive(BinaryNode current,int data){
		if(current==null){
			current=new BinaryNode(data);
		}
		else{
			if(data<=current.getData()){
				current.setLeft(insertRecursive(current.getLeft(),data));
			}
			else{
				current.setRight(insertRecursive(current.getRight(),data));
			}
		}
		return current;
	}
	public void delete(int data) {
		root = deleteRecursive(root, data);
	}
	private BinaryNode deleteRecursive(BinaryNode current, int data) {
		if (current == null) 
			return null;

		if (data < current.getData()) //input node  is in left side
			//set the left side of this node with revised tree resulting from deletion in the recursive call
			current.setLeft(deleteRecursive(current.getLeft(), data));
		else if (data > current.getData())  //input is in right side
			//set the right side of this node with revised tree resulting from deletion in the recursive call
			current.setRight(deleteRecursive(current.getRight(), data));

		else {     // delete node is found
			if (current.getLeft() == null)
				//return the right side of this node to attach back to the tree as the current node is going to be deleted
				return current.getRight();

			else if (current.getRight() == null) 
				//return the left side of this node to attach back to the tree as the current node is going to be deleted
				return current.getLeft();

			else{// nodes with both left and right child
				//find the replacement maximum node

				BinaryNode replacementNode=getmaximumValueNode(current.getLeft());
				//remove the replacement node from the tree
				current.setLeft(deleteRecursive(current.getLeft(),replacementNode.getData()));

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

	private BinaryNode getmaximumValueNode(BinaryNode node) {
		if(node.getRight()==null){
			return node;
		}else{
			BinaryNode largestNode = getmaximumValueNode(node.getRight());
			return largestNode;
		}
	}

	public String inorder() {
		StringBuilder stringBuilder = new StringBuilder();
		return inorder(root,stringBuilder);
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
		StringBuilder stringBuilder = new StringBuilder();
		 return preorder(root,stringBuilder);
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
}
