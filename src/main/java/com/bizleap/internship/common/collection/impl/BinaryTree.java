package com.bizleap.internship.common.collection.impl;

import com.bizleap.internship.common.collection.BTree;

public class BinaryTree implements BTree {
	private BinaryTreeNode root;
	int count = 0;

	public BinaryTree() {
		root = null;
	}

	public void insert2(int value) {
		root = insert2(root, value);
	}

	private BinaryTreeNode insert2(BinaryTreeNode current, int value) {
		if (current == null) 
			return new BinaryTreeNode(value);
		
		if (value < current.getValue())
			current.setLeft(insert2(current.getLeft(), value));
		else if (value > current.getValue())
			current.setRight(insert2(current.getRight(), value));

		return current;
	}

	public void insert(int value) {
		if (root == null) {
			root = new BinaryTreeNode(value);
		} else
			insert(root, value);
	}

	private void insert(BinaryTreeNode current, int value) {

		if (value < current.getValue()) {
			if (current.getLeft() == null) {
				current.setLeft(new BinaryTreeNode(value));
			} else
				insert(current.getLeft(), value);
		}

		if (value > current.getValue()) {
			if (current.getRight() == null) {
				current.setRight(new BinaryTreeNode(value));
			} else
				insert(current.getRight(), value);
		}
	}

	public void delete(int value) {
		root = delete(root, value);
	}

	private BinaryTreeNode delete(BinaryTreeNode current, int value) {
		if (current == null)
			return null;

		if (value < current.getValue()) // input is in left side

			// set the left side of this node with the revised tree resulting
			// from deletion in the recursive call
			current.setLeft(delete(current.getLeft(), value));

		else if (value > current.getValue()) // input is in right side

			// set the right side of this node with the revised tree resulting
			// from deletion in the recursive call
			current.setRight(delete(current.getRight(), value));

		else { // delete not is found
			if (current.getLeft() == null)
				// return the right side of this node to attach back to the tree
				// as the current node
				// is going to be deleted
				return current.getRight();

			else if (current.getRight() == null) // node with one left child
				return current.getLeft();

			// nodes with both left and right child

			// find the replacement node from the tree
			// min ko phote lite p min yae right bat ka kg ko tin pay lite p
			BinaryTreeNode replacementNode = getMinimumValueNode(current.getRight());

			// 21 ko phote cha lite tl
			// remove the replacement node from the tree(ngar replace lote mae
			// kg ko tawe p min aee mar delete lite tot)
			current.setRight(delete(current.getRight(), replacementNode.getValue()));

			// left nae right ko pyan retain lote ya ml
			// update the replacement node with the target node information
			replacementNode.setLeft(current.getLeft());
			replacementNode.setRight(current.getRight());

			// return the replacement node to be attached to the tree so that
			// current node will be drop from the tree

			// 21 ka d ka pyan twr mhr p yin line no: 47,52,68 tawe mr win mr
			// 20 ka 21 htet ngal yin left ko twr gyi yin right ko twr
			return replacementNode;
		}
		// current node is not the out to be deleted so it will go back to the
		// tree
		// @see 47 & 42
		return current;
	}

	private BinaryTreeNode getMinimumValueNode(BinaryTreeNode node) {
		return node.getLeft() == null ? node : getMinimumValueNode(node.getLeft());
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
		if (contains(root, key))
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