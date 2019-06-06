package com.bizleap.internship.common.collection.impl;

public class ArrayList {
	private int[] array;
	private int size;
	private int initialize=0;
	
	public ArrayList(){
		int size=10;
		this.array=new int[size];
	}
	
	public int add(int key){
		return array[initialize++]=key;
	}  
}
