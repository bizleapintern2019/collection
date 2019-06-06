package com.bizleap.internship.common.collection.impl;

import com.bizleap.internship.common.collections.BTree;

public class BinaryTree implements BTree{
	private BinaryNode root;
	private int noOfNodes;

	public BinaryTree(){                                     
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
		if(root==null){
			root=new BinaryNode(id,value);
			noOfNodes++;
		}else insertRecursive(getRoot(), id,value);
	}

	public void insertRecursive(BinaryNode current, int key, Object value){
		if(current.getKey()>key){
			if(current.getLeft()==null){
				current.setLeft(new BinaryNode(key,value));
			}else{
				insertRecursive(current.getLeft(),key,value);
			}
		}
		if(current.getKey()<key){
			if(current.getRight()==null){
				current.setRight(new BinaryNode(key,value));
			}else{
				insertRecursive(current.getRight(),key,value);
			}

		}
		noOfNodes++;
	}

	public Object search(int key){
		return searchRecursive(root,key);
	}

	private Object searchRecursive(BinaryNode current, int key){

		if (current == null){
			return 0;
		} 
		if (current.getKey() == key){
			return current.getData();
		} 
		return key < current.getKey() ? searchRecursive(current.getLeft(), key) : searchRecursive(current.getRight(), key);
	}

	public void delete(int key){
		root=deleteRecursive(getRoot(),key);
	}
	/* @param current   root of the current tree.
	 * @param key       the key of target node to be deleted.
	 */
	public BinaryNode deleteRecursive(BinaryNode current,int key){
		//		System.out.println("Current:"+current+" "+"Key:"+key);

		if(current==null){
			return null;
		}
		if(current.getKey()==key){
			
			if(current.getLeft()==null && current.getRight() ==null){
				// if no children delete the node
				current = null;
			}else{
				if(current.getLeft()==null){
					// if no left child replace with right subtree
					current=current.getRight();
				}else if(current.getRight()==null){
					// if no right child replace with left subtree
					current=current.getLeft();
				}else{
					// two children so replace in order of successor
					BinaryNode rightSuccessor= getSuccessor(current.getRight());
					current.setRight(deleteRecursive(current.getRight(),rightSuccessor.getKey()));
					rightSuccessor.setLeft(current.getLeft());
					rightSuccessor.setRight(current.getRight());
					current = rightSuccessor;
				}
			}

		}else if(current.getKey()<key){
			current.setRight(deleteRecursive(current.getRight(),key));
		}else{
			current.setLeft(deleteRecursive(current.getLeft(),key));
		}
		noOfNodes--;
		return current;
	}

	public BinaryNode getSuccessor(BinaryNode node){
		BinaryNode successor;
		if(node.getLeft()==null){
			successor= node;
		}else{
			successor = getSuccessor(node.getLeft());
		}
		return successor;
	}

	@Override
	public String toString(){
		return "BinaryTree [root=" + root + ", noOfNodes=" + noOfNodes + "]";
	}

}


