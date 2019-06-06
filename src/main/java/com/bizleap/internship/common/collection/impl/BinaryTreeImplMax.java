package com.bizleap.internship.common.collection.impl;

import com.bizleap.internship.common.collection.Binary;

public class BinaryTreeImplMax implements Binary {
	private TreeNode root;

	public TreeNode getRoot() {
		return root;
	}

	public void setRoot(TreeNode root) {
		this.root = root;
	}

	public BinaryTreeImplMax() {
		root = null;
	}

	public boolean isEmpty() {
		if (root == null)
			return true;
		return false;
	}

	public void insert(int data) {
		System.out.println("Inserting" + data);
		root = insertRecursive(root, data);
		System.out.println("------------------------------------------------------");
	}

	public TreeNode insertRecursive(TreeNode root, int key) {

		/* If the tree is empty, return a new node */
		if (root == null) 
			return new TreeNode(key);
			
		/* Otherwise, recur down the tree */
		if (key < root.getData()) {
			root.setLeft(insertRecursive(root.getLeft(), key));
		} else if (key > root.getData())
			root.setRight(insertRecursive(root.getRight(), key));
		return root;
	}

	public int countNodes() {
		return countNodes(root);
	}

	private int countNodes(TreeNode node) {
		if (node == null)
			return 0;
		return 1 + countNodes(node.getLeft()) + countNodes(node.getRight());
	}

	public int search(int val) {
		if (contains(root, val))
			return val;
		return 0;
	}

	private boolean contains(TreeNode node, int value) {
		if (node.getData() == value)
			return true;
		if (node.getLeft() != null)
			if (contains(node.getLeft(), value))
				return true;
		if (node.getRight() != null)
			if (contains(node.getRight(), value))
				return true;
		return false;
	}

	public void delete(int key) {
		root = deleteNode(root, key);
	}

	/*
	 * @param node root of the target tree
	 * 
	 * @param value the value of the target node to be deleted
	 * 
	 */
	public TreeNode deleteNode(TreeNode parent, int value) {//10/12
		if (parent == null)
			return parent;

		if (value < parent.getData()) {
			parent.setLeft(deleteNode(parent.getLeft(), value));
		} else if (value > parent.getData()) {
			parent.setRight(deleteNode(parent.getRight(), value));
		} else {
 
			if (parent.getLeft() == null)
				// return the right side of this node to attach back
				// be deleted to the tree as the current node is going to
				return parent.getRight();
			else if (parent.getRight() == null)
				return parent.getLeft();
			// find the replacement maximum node
			TreeNode replacement = getMaximumValueNode(parent.getLeft());//12
			
			//System.out.println("MaximumNode is" + replacement.getData());
			// remove the replacement node from the tree
			parent.setLeft(deleteNode(parent.getLeft(), replacement.getData()));
			
			// update the replacement node with the target node information
			replacement.setLeft(parent.getLeft());//10
			replacement.setRight(parent.getRight());//22
			// return the replacement node to be attached to the tree so that
			// the current node will be dropped from the tree
			return replacement;
		}
		// current node is not the one to be deleted so return it back to the tree
		return parent;
	}

	private TreeNode getMaximumValueNode(TreeNode parent) {
		if (parent.getRight() == null)
			return parent;
		return getMaximumValueNode(parent.getRight());
	}

	public String inorder() {
		StringBuilder stringBuilder = new StringBuilder();
		return inorder(root, stringBuilder);
	}

	private String inorder(TreeNode root, StringBuilder stringBuilder) {
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

	private String preorder(TreeNode root, StringBuilder sb) {
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

	private String postorder(TreeNode root, StringBuilder sb) {
		if (root != null) {
			postorder(root.getLeft(), sb);
			postorder(root.getRight(), sb);
			sb.append(root.getData() + " ");
		}
		return sb.toString();
	}
}
