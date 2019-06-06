package com.bizleap.internship.common.collections.impl;

import java.util.Arrays;

import com.bizleap.internship.common.collections.Queue;

public class QueueImpl implements Queue{
	
	private String[] items;
    private int size; 
    private int rear; 
    private int front;   
    private int number;  
 
    public QueueImpl() {
           size = 2;
           items = new String[size];         
           rear = 0;
           front = 0;
           number=0;
    }
    
    private boolean isEmpty() {
        return number == 0;
    }
 
    private void reSize() {
    	items = Arrays.copyOf(items, items.length*2);
    	front=0;
    	rear=number;
	}
 
    private boolean isFull() {
        return (number == items.length);
    }
 
    public void enqueue(String value){
           
    	if(isFull()){
           reSize();
     }          
     if ( rear <= front) 
            rear = 0;
     items[rear++] = value; 
     number++; 
    }
 
    public String dequeue(){
    	
    	if(isEmpty()){
           return null;
     }
     String deletedValue = items[front++]; 
     if ( rear <= front) 
            front = 0;
     number--; 
     return deletedValue;
    }
    
    public int size() {
    	return  number;
    }

    public boolean hasContain(String value) {
    	for(int i= front; i<rear;i++) {
    		if(items[i].equals(value)) {
    			return true;
    		}
    	}
    	return false;
    }
    
    public void remove (String value) {
    	for(int i=front;i<rear;i++) {
    		if(items[i].equals(value)) {
    			items[i]=null;
    			for(int j=i;i<=rear;j++) {
    				items[j]=items[i+j];
    			}
    			number--;
    		}
    	}
    }
    
    public void clear() {
    	for (int i= 0 ; i < number; i++) {
    		items[i] = null;
    	}
    	front = 0;
    	rear= 0;
    }
    
}

