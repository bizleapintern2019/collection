package com.bizleap.intenship.common.collection.impl;

import java.util.ArrayList;
import java.util.List;

import com.bizleap.intenship.common.collection.Map;

public class HashMap implements Map {
	
	private Bucket[] buckets;   //Array of MyLinkedList.
    private int capacity=256;
    private int rehashLinkedListThreshold=50;
    private int rehashDurationThreshold=5;
     
    public HashMap() {
       buckets = new Bucket[capacity];
    }
    
    private boolean detectRehashRequired() {
    	for(Bucket bucket:buckets) {
    		if(!(bucket==null)) {
    			System.out.println("The linkedlist size in bucket is "+bucket.getSize()+".");
    			if(bucket.getSize() >= rehashLinkedListThreshold)
    				return true;
    		}
    	}
    	return false;
    }
    
    public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	private void rehash() {
    	Bucket[] previousBuckets=buckets;
    	capacity*=2;
		buckets = new Bucket[capacity];
		System.out.println("The bucket capacity is changed into "+buckets.length+".");

		for(int i=0; i< previousBuckets.length; i++){
			buckets[i] = previousBuckets[i];
		}
    }
    
    private int getHash(String key) {
    	char[] charArray = key.toCharArray();
		int charSum=0;
		for(char singelChar:charArray)
			charSum +=(int)singelChar;
		
		return ((charSum*2-50)%capacity);
	}

    public void put(String key,String value) {
 	   if(key==null)
 	        return; 
 	   
 	   long start=System.currentTimeMillis();
        int hash=getHash(key);
        Bucket bucket = buckets[hash];
        if(buckets[hash] == null){
         	bucket = new Bucket();
         	buckets[hash] = bucket;
        }
         	bucket.add(key, value);
        long duration =System.currentTimeMillis()-start;
        if(duration > rehashDurationThreshold && detectRehashRequired()){
     	   rehash();
        }
 	}
	
    public String get(String key) {
		Bucket bucket = buckets[getHash(key)];
		if(bucket == null || bucket.get(key)==null)
			return null;
		return bucket.get(key);
	}
	
	public List<EntryImpl> getAll() {
		if(buckets == null)
			return null;
		
		List<EntryImpl> entryList= new ArrayList<>();
		for(Bucket bucket:buckets){
			if(!(bucket == null)){
				entryList.addAll(bucket.getEntryList());
//				for(EntryImpl a:bucket.getEntryList()){
//					entryList.add(a);
//				}
			}
		}
    	return entryList;
	}

//	
//	public boolean contains(String key) {
//	        int hash = getHash(key);
//	        if(buckets[hash] == null)
//	        	return false;
//	        else {
//	        	for(Bucket temp : buckets) {
//	        		if(!(temp==null))
//	        			if(temp.head.getKey().equals(key))
//	        				return false;
//	        	}         
//	        return true;
//	        }
//	}
	public boolean contains(String key) {
		return get(key) != null;
	}
	
	public boolean remove(String key) {
		return buckets[getHash(key)].remove(key);
	}

	@Override
	public String toString() {
		StringBuilder string=new StringBuilder();
		for(int i=0;i<buckets.length;i++) {
			if(buckets[i]!=null) 
				string.append(buckets[i]);
		}
		return "HashMap [buckets=" + string + ", capacity=" + capacity + "]";
	}
}