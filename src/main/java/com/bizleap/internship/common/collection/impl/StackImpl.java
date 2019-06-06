package com.bizleap.internship.common.collection.impl;

import java.util.Arrays;

import com.bizleap.internship.common.collections.Stack;

public class StackImpl implements Stack{

	private int current;
	private int size;

	private String[] items;
	
	public StackImpl(){
		current =-1;
		size= 5;
		items = new String[size];
	}

	public int getCurrent(){
		return current;
	}

	public void setCurrent(int current){
		this.current = current;
	}

	public int getSize(){
		return size;
	}

	public void setSize(int size){
		this.size = size;
	}
	
	public String[] getItems(){
		return items;
	}
	
	public void setItems(String[] items){
		this.items = items;
	}

	public boolean isOverflow(){
		return current >=items.length-1;
	}

	public boolean isUnderflow(){
		return current <=-1;
	}

	public void resize(){

		items = Arrays.copyOf(items, items.length * 2);
		System.out.println("Resized stack length: "+ items.length);

	}

	public void add(String value){

		if(isOverflow()){
			resize();
		}
		items[++current]=value;
	}

	public String poll(){

		if(isUnderflow()){
			return null;
		}
		String item = items[current];
		items[current--]=null;//No more reference to the object to allow garbage collection
		return item;
	}

	public int size(){
		return current;
	}

	public void clear(){
		for(int i=0;i<=current;i++){//No need to clear unfilled items
			items[i]=null;
		}
		current = -1;
	}

	public boolean remove(String value) {
		for(int i=0;i<size;i++){
			if(items[i].equals(value)){
				items[i]=null;
				return true;
			}
		}
		return false;
	}
	
	
	public boolean contains(String value) {
		for(int i=0;i<size;i++){
			if(items[i].equals(value)){
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "StackImpl [current=" + current + ", size=" + size + ", items=" + Arrays.toString(items) + "]";
	}



}
