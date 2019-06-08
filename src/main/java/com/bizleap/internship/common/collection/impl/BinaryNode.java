package com.bizleap.internship.common.collection.impl;

public class BinaryNode {
	private int key;
	private Object data;
	private BinaryNode left;
	private BinaryNode right;

	public BinaryNode(int id, Object value)
	{ 
		key = id;
		data = value;
		left = null;
		right = null;
	}
	
	public boolean hasKey(int key) { 
		return this.key == key;
	}
	
	public boolean hasSmaller(int key) {
		return this.key < key;
	}
	
	public boolean hasGreater(int key){
		return this.key > key;
	}
	
	public boolean hasLeftChild(){
		return getLeft() != null;
	}
	
	public boolean hasRightChild(){
		return getRight() != null;
	}
	
	public boolean hasNoChild(){
	 return	!(hasLeftChild() && hasRightChild());
	}
	public int getKey()
	{
		return key;
	}

	public Object getData()
	{
		return data;
	}

	public BinaryNode getLeft()
	{
		return left;
	}
	public BinaryNode getRight()
	{
		return right;
	}
	public void setKey(int id)
	{
		key = id;
	}

	public void setData(Object value)
	{
		data = value;
	}

	public void setLeft( BinaryNode left)
	{
		this.left = left;
	}

	public void setRight( BinaryNode right)
	{
		this.right = right;
	}
	@Override
	public String toString() {
		return "BinaryNode [key=" + key + ", data=" + data + ", left=" + left + ", right=" + right + "]";
	}
	
} 

