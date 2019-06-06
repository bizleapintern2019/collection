package com.bizleap.internship.common.collections.impl;

import com.bizleap.internship.common.collections.Tree;

public  class BinaryTree implements Tree {
	public TreeNode root;
	public TreeNode getRoot() {
		return root;
	}

	public void setRoot(TreeNode root) {
		this.root = root;
	}
	
	public BinaryTree() {
		root=null;
	}
	
	public void add(int value) {
		root = insertRecursive(root, value);			//returned tree is inserted to the root
	}

	private TreeNode insertRecursive(TreeNode current, int value) {
	    //if the current node is null, insert at this node
		if (current == null) {									
			return current = new TreeNode(value);
		}
		//value is less than the value of the current node, call insertRecursive on the node's left child
		if(value < current.getValue()) {
			current.setLeft(insertRecursive(current.getLeft(), value));
		}
		//value is greater than value of current node, call insertRecursive on the node's right child
		else if(value > current.getValue()) {
			current.setRight(insertRecursive(current.getRight(), value));
		}
		//return inserted tree
		return current;
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
        root = deleteRecursion(root, value);//recursion delete function using node
    }

    private TreeNode deleteRecursion(TreeNode subtreeRoot, int value) {
        if (subtreeRoot == null) {
            return subtreeRoot;
        }
        // finding the delete node value is less than current go left else go right
        if (value < subtreeRoot.getValue()) {
            subtreeRoot.setLeft(deleteRecursion(subtreeRoot.getLeft(), value)); //replace the revised tree at left side of the root
        } else if (value > subtreeRoot.getValue()) {
            subtreeRoot.setRight(deleteRecursion(subtreeRoot.getRight(), value));//replace the revised tree at right side of the root
        } else { //found the delete node and check there is child 0 or 1 node and delete the node 
            if (subtreeRoot.getLeft() == null) {
                return subtreeRoot.getRight(); //assume that it has only right child and return right child
            } else if (subtreeRoot.getRight() == null) {
                return subtreeRoot.getLeft(); //assume that it has only left child and return left child
            }
            TreeNode maximumNode = getLargestNodeFromLeft(subtreeRoot.getLeft());			//get smallest node from left
			subtreeRoot.setLeft(deleteRecursion(subtreeRoot.getLeft(), maximumNode.getValue()));			//delete the largest node
			maximumNode.setLeft(subtreeRoot.getLeft());				//replace node's value with the largest node's value
			maximumNode.setRight(subtreeRoot.getRight());
			return maximumNode;
        }
        return subtreeRoot;
    }
    
    private TreeNode getLargestNodeFromLeft(TreeNode node) {				//search and return node that is the smallest at the right side in the deleted tree 
		if(node.getRight() == null){
			return node;
		}
		else {
			TreeNode largestNode = getLargestNodeFromLeft(node.getRight());
			return largestNode;
		}
	}
    
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
