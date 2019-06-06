package com.bizleap.internship.assignments.common.collections.impl;

import java.util.Arrays;
import java.util.List;

import com.bizleap.internship.assignments.common.collection.Collection;
import com.bizleap.internship.assignments.common.collection.Stack;

public class StackImpl implements Stack{
	private int current;
	private int size=20;
	private String items[];
	
	public StackImpl(){
		items=new String[20];
		current=-1;
	}
	
	public void push(String data){
		if(current==size){
			System.out.println("Stack overflow");
			resize();
		}
		else{
			current++;
			items[current]=data;
		}
	}
	
	public String pop(){
		if(current<-1)
			return null;
		String top=items[current];
		 items[current--]=null;//No more reference to the object to allow garbage collection
		 return top;
	}

	public int size(){
		if(current < 0){
			size = current + 1;
			return size;
		}
		size = current+1;
		return size; 
	}

	public void resize(){
		size*=2;
		String[] newStack=new String[size];
		for(int i=0;i<items.length;i++){
			newStack[i]=items[i];
		}
		items=newStack;
	}
	public boolean contains(String input){
		for(int i=0;i<=current;i++)
			if(items[i].equals(input))
				return true;
			return false;
	}
	public void clear(){
		for(int i=0;i<=current;i++){
			items[i]=null;
		}
		current=-1;
	}
	public String toString(){
		String result = "[";
		for(int i = 0; i< size(); i++){
				result = result + items[i] +",";
		}	
		return result.substring(0,result.lastIndexOf(",")) +"]";
	}
}
	

