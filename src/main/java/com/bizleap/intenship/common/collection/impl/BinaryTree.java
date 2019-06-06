package com.bizleap.intenship.common.collection.impl;

import com.bizleap.intenship.common.collection.Binary;

public class BinaryTree implements Binary {
	private BinaryNode root;

	public BinaryTree() {
		root = null;
	}
	
	public void insert(int key) { 
	       root = insertRecursive(root, key); 
	    } 
	      

	public BinaryNode  insertRecursive(BinaryNode current, int data) { 
		if(current==null)												//root is empty so set current node to root
			return new BinaryNode(data);
	    if (data < current.getData()) 									//set leftChild of current node 
	    	current.setLeft( insertRecursive(current.getLeft(), data)); 
	    else if (data > current.getData()) 								//set RightChild of current node
	    	current.setRight(insertRecursive(current.getRight(), data)); 
	    return current; 
	} 

//	public void insert(int value) {
//		System.out.println("Inserting" + value);
//		
//		if(root == null) {
//			root = new BinaryNode(value);									//set the root to new node
//		} else insertRecursive(root, value);								//call recursive
//		System.out.println("------------------------------------------------------");
//	}
//
//	private void insertRecursive(BinaryNode current, int data) {
//		
//		if (data < current.getData()) {
//			if(current.getLeft()==null) 		
//				current.setLeft(new BinaryNode(data));						//leftSide is null so set the new node to left
//			else insertRecursive(current.getLeft(), data);					//call the insertRecursive left again 
//		} 
//		if (data > current.getData()) {
//			if(current.getRight()==null) 
//				current.setRight(new BinaryNode(data));						//rightSide is null so set the new node to right
//			else insertRecursive(current.getRight(), data);					//call the insertRecursive right again 
//		} 
//	}

	public boolean contain(int key) {										//search is contain or not
		return contain(root, key);
	}

	private boolean contain(BinaryNode node, int key) {
		if (node.getData() == key)
			return true;
		if (node.getLeft() != null)
			if (contain(node.getLeft(), key))
				return true;
		if (node.getRight() != null)
			if (contain(node.getRight(), key))
				return true;
		return false;
	}
	
	public int search(int key) {
		if(contain(root,key))
			return key;
		return 0;
	}
    
    public void delete(int key) { 												//delete for giving node
        root=deleteMinNode(root, key); 
    } 
    /*
     * @param current is root of the current tree
     * @param value is the value of the target node to be deleted
     */
    public BinaryNode deleteMinNode(BinaryNode current, int value) { 
        if (current == null) 													//delete node not found 
        	return null; 
        
        if (value < current.getData()) 											//input node is in the left side
        	//Set the left side of this node with the revised tree resulting from deletion in the recursive call
            current.setLeft(deleteMinNode(current.getLeft(), value)); 
        
        else if (value > current.getData()) 									//input node is in the right side
        	//Set the right side of this node with the revised tree resulting from deletion in the recursive call
            current.setRight(deleteMinNode(current.getRight(), value)); 
        else {		//delete node is found
        	
            if (current.getLeft() == null) 
            	//return the right side of this node to attach back to the current node is to be deleted
                return current.getRight(); 
            else if (current.getRight() == null)
            	//return the left side of this node to attach back to the current node is going to be deleted
                return current.getLeft();
            //find the replacement maximum node
            BinaryNode replacementMinNode=getMinmumValueNode(current.getRight());																				//Origin
            current.setRight(deleteMinNode(current.getRight(), replacementMinNode.getData()));	//remove the replacement node from the tree																//current.setData(getMinmumValueNode(current.getRight()).getData()); 		//found minNode and set it on delete node
            
            //update the replacement node with the target node information
            replacementMinNode.setLeft(current.getLeft());																											//current.setRight(deleteMinNode(current.getRight(), current.getData()));	//remove the replacement node from the tree
            replacementMinNode.setRight(current.getRight());
            
            //return the replacement node to be attached to the tree so that the current node will be dropped from the tree.
            return replacementMinNode;
        }
        //current is not the one to be deleted so that it will go back to the tree
        //@see it 67 & 71
        return current; 
    } 
    private BinaryNode getMinmumValueNode(BinaryNode node) {							//searching the minimum node 
		return node.getLeft()==null ? node : getMinmumValueNode(node.getLeft());
	}

	public String inorder() {													//arrange node to inorder form
		StringBuilder sb=new StringBuilder();
		return inorder(root,sb);
	}

	private String inorder(BinaryNode node,StringBuilder sb) {
		if (node != null) {
			inorder(node.getLeft(),sb);
			sb.append(node.getData() + " ");
			inorder(node.getRight(),sb);
		}
		return sb.toString();
	}

	public String preorder() {													//arrange node to preorder form
		StringBuilder sb=new StringBuilder();
		return preorder(root,sb);
	}

	private String preorder(BinaryNode node,StringBuilder sb) {
		if (node != null) {
			sb.append(node.getData() + " ");
			preorder(node.getLeft(),sb);
			preorder(node.getRight(),sb);
		}
		return sb.toString();
	}

	public String postorder() {													//arrange node to postorder form
		StringBuilder sb=new StringBuilder();
		return postorder(root,sb);
	}

	private String postorder(BinaryNode node,StringBuilder sb) {
		if (node != null) {
			postorder(node.getLeft(),sb);
			postorder(node.getRight(),sb);
			sb.append(node.getData() + " ");
		}
		return sb.toString();
	}
}