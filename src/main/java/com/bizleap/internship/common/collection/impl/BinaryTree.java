package com.bizleap.internship.common.collection.impl;

import com.bizleap.internship.common.collection.Binary;

public class BinaryTree implements Binary {

	private TreeNode root;

	public TreeNode getRoot() {
		return root;
	}

	public void setRoot(TreeNode root) {
		this.root = root;
	}

	public BinaryTree() {
		root = null;
	}

	public boolean isEmpty() {
		if (root == null)
			return true;
		return false;
	}

	public void insert(int data) {
		System.out.println("Inserting" + data);

		if (root == null) {
			root = new TreeNode(data);
		} else
			insertRecursive(root, data);
		System.out.println("------------------------------------------------------");
	}

	private void insertRecursive(TreeNode current, int data) {

		if (data < current.getData()) {
			if (current.getLeft() == null) {
				current.setLeft(new TreeNode(data));
			} else
				insertRecursive(current.getLeft(), data);
		}
		if (data > current.getData()) {
			if (current.getRight() == null) {
				current.setRight(new TreeNode(data));
			} else
				insertRecursive(current.getRight(), data);
		}
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
		root=deleteNode(root, key);
	}

	public TreeNode deleteNode(TreeNode parent, int value) {
		if (parent == null)
			return parent;

		if (value < parent.getData()) {
			parent.setLeft(deleteNode(parent.getLeft(), value));
		} else if (value > parent.getData()) {
			parent.setRight(deleteNode(parent.getRight(), value));
		} else { // found the key
			if (parent.getLeft() == null)
				return parent.getRight();
			else if (parent.getRight() == null)
				return parent.getLeft(); // node with 1 child or no child
			// find min node and replace it on delete node
			TreeNode replacement = getMinimumValueNode(parent.getRight());
			System.out.println("MinimumNode is"+replacement.getData());
			parent.setLeft(deleteNode(parent.getRight(), replacement.getData()));
			replacement.setLeft(parent.getLeft());
			replacement.setRight(parent.getRight());
			return replacement;
		}
		return parent;
	}

	private TreeNode getMinimumValueNode(TreeNode parent) {
		if (parent.getLeft() == null)
			return parent;
		return getMinimumValueNode(parent.getLeft());
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