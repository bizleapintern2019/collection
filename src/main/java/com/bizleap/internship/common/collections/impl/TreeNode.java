package com.bizleap.internship.common.collections.impl;

public class TreeNode {
	private int value;
	private TreeNode left;
	private TreeNode right;
	TreeNode(int value) {
		this.value=value;
		left=null;
		right=null;
	}
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public TreeNode getLeft() {
		return left;
	}
	public void setLeft(TreeNode left) {
		this.left = left;
	}
	public TreeNode getRight() {
		return right;
	}
	public void setRight(TreeNode right) {
		this.right = right;
	}
	
	public int min() {
        if (left == null) {
            return value;
        } else {
            return left.min();
        }
    }

    public int max() {
        if (right == null) {
            return value;
        } else {
            return right.max();
        }
    }
    
    public void insert(int value) {
        if (value == this.value) 
        	{ return; } //if value is already exist don't add

        if (value < this.value) { //if value is less than root, go left
            if (left == null) {
                left = new TreeNode(value); //left is new, then add the value to it
            } else {
                left.insert(value);//if left already has value, find the new node
            }
        } else {//else go right
            if (right == null) {//right is new, then add value to it  
                right = new TreeNode(value);
            } else {
                right.insert(value);//right already has value, find the new node
            }
        }
    }
}
