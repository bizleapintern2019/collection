package com.bizleap.internship.common.collections.impl;

import com.bizleap.internship.common.collections.Tree;

public class BinaryTreeMax implements Tree{
	public TreeNode root;
	public TreeNode getRoot() {
		return root;
	}

	public void setRoot(TreeNode root) {
		this.root = root;
	}
	
	public BinaryTreeMax() {
		root=null;
	}
	
	public void add(int value) {
		if (root == null) { // if current node is new then add the value to it
            root = new TreeNode(value);
        } else {
            root.insert(value);//if current node is not new then find the empty node with recurrsion
        }
	}
	
	public int search(int val) {
        if(contain(root, val)) {
        	return val;
        }
        return 0;
    }
	
    /* Function to search for an element recursively */
    private boolean contain(TreeNode current, int val) {
        if (current.getValue() == val)
            return true;	//found value at node		
        if (current.getLeft() != null)	//first find the node at left side
            if (contain(current.getLeft(), val))
                return true;
        if (current.getRight() != null) //find the node at right side
            if (contain(current.getRight(), val))
                return true;
        return false;         
    }
	//to delete the node
    public void delete(int value) {
        root = delete(root, value);//recursion delete function using node
    }

    private TreeNode delete(TreeNode subtreeRoot, int value) {
        if (subtreeRoot == null) {
            return subtreeRoot;
        }
// finding the delete node value is less than current go left else go right
        if (value < subtreeRoot.getValue()) {
            subtreeRoot.setLeft(delete(subtreeRoot.getLeft(), value)); //replace the revised tree at left side of the root
        } else if (value > subtreeRoot.getValue()) {
            subtreeRoot.setRight(delete(subtreeRoot.getRight(), value));//replace the revised tree at right side of the root
        } else { //found the delete node and check there is child 0 or 1 node and delete the node 
            if (subtreeRoot.getLeft() == null) {
                return subtreeRoot.getRight(); //assume that it has only right child and return right child
            } else if (subtreeRoot.getRight() == null) {
                return subtreeRoot.getLeft(); //assume that it has only left child and return left child
            }
            //delete node there is two children : find the largest left number and replace it to the deleted node
            subtreeRoot.setValue(subtreeRoot.getLeft().max());
            //delete the largest right node
            subtreeRoot.setLeft(delete(subtreeRoot.getLeft(), subtreeRoot.getValue()));
        }
        return subtreeRoot;
    }
////to find the smallest number on right side
//    public int getminNode() {
//        if (root == null) {
//            return Integer.MIN_VALUE;
//        } else {
//            return root.min();
//        }
//    }
//// to find the largest number on left side
//    public int getmaxNode() {
//        if (root == null) {
//            return Integer.MAX_VALUE;
//        } else {
//            return root.max();
//        }
//    }
   //to print out inorder traverse 
	public void traverseInOrder(TreeNode node) {
	    if (node != null) {
	        traverseInOrder(node.getLeft());
	        System.out.print(" " + node.getValue());
	        traverseInOrder(node.getRight());
	    }
	}
	//to print out preorder traverse
	public void traversePreOrder(TreeNode node) {
	    if (node != null) {
	        System.out.print(" " + node.getValue());
	        traversePreOrder(node.getLeft());
	        traversePreOrder(node.getRight());
	    }
	}
	//to print out postorder traverse
	public void traversePostOrder(TreeNode node) {
	    if (node != null) {
	        traversePostOrder(node.getLeft());
	        traversePostOrder(node.getRight());
	        System.out.print(" " + node.getValue());
	    }
	}
}
