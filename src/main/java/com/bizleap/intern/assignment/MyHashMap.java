package com.bizleap.intern.assignment;

public class MyHashMap {
	private MyLinkedList[] bucket;   
    MyLinkedList newLinkedList; 
    private int capacity=256;
    private int rehashLinkedListthreshold=20;
    public MyHashMap(){
       bucket = new MyLinkedList[capacity];
    }
    
    public void rehash(){
    	MyLinkedList[] backup=bucket;
    	for(MyLinkedList buckets:bucket){
    		if(!(buckets==null)){
    			System.out.println("The linked list size in bucket is "+buckets.size+",");
    			if(buckets.size>=rehashLinkedListthreshold){
    				capacity*=2;
    				bucket=new MyLinkedList[capacity];
    				System.out.println("The bucket capacity is changed into "+bucket.length);
    				return;
    			}
       		}
    	}
    	bucket=backup;
    }
    public void getAll(){
    	for(MyLinkedList buckets:bucket){
    		if(!(buckets==null)){
    			System.out.println("{"+getHash(buckets.head.getKey())+","+buckets.head.getValue()+"}");
    		}
    		else
    			System.out.print(" ");
    	}
    	System.out.println("");
    }

    public int getHash(String key) {
    	int result = 0;
    	for(char ch:key.toCharArray()){
    			result+=ch;
    	}
    	return (result*20)%255;	
    }
	  
    public void put(String key,String value){
		if(key==null)
	        return; 
		 int hash=getHash(key);
		 if(bucket[hash] == null){
        	newLinkedList = new MyLinkedList();
            newLinkedList.add(key, value);
            bucket[hash] = newLinkedList;
		 }else{
        	newLinkedList.add(key, value);
        	bucket[hash] = newLinkedList;
        }

	}
	public int size() {
		System.out.println(newLinkedList.size);
		return newLinkedList.size;
	}
	
	public String get(String key) {
		return bucket[getHash(key)].get(key);
	}
	
	public boolean remove(String key){
		return bucket[getHash(key)].remove(key);
	}
	
}

