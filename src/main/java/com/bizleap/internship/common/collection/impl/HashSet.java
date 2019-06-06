package com.bizleap.internship.common.collection.impl;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;

import com.bizleap.internship.common.collections.Set;

public class HashSet implements Set{
	private int capacity=256;
	private Buckets[] buckets;
	private int rehashLinkedListThreshold=50;
	private int rehashDurationThreshold=5;
	 
    public HashSet() {
    	buckets = new Buckets[capacity];
    }
    
    private boolean detectRehashRequired(){
    	for(Buckets bucket:buckets) {
    		if(!(bucket==null)) {
    			System.out.println("The linkedlist size in bucket is "+bucket.getSize()+".");
	    		if(bucket.getSize() >= rehashLinkedListThreshold)
	    			return true;
    		}
    	}
    	return false;
    }
    private void rehash(){
    	Buckets[] previousBuckets=buckets;
    	capacity*=2;
		buckets = new Buckets[capacity];
		System.out.println("The bucket capacity is changed into "+buckets.length+".");

		for(int i=0; i< previousBuckets.length; i++){
			buckets[i] = previousBuckets[i];
		}
    }
    
    public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
    
    private int getHash(String key) {
    	char[] charArray = key.toCharArray();
		int charSum=0;
		for(char singelChar:charArray)
			charSum +=(int)singelChar;
		
		return ((charSum*2-50)%capacity);
	}
    
    public boolean add(String key){
    	if(key==null || contains(key))
 	        return false; 
    	
    	long start=System.currentTimeMillis();
        int hash=getHash(key);
        //New Bucket Created
        Buckets bucket = buckets[hash];
        if(buckets[hash] == null){
         	bucket = new Buckets();
         	buckets[hash] = bucket;
         }
        //Add Item To Buckets
         bucket.add(key, key);
         System.out.println(bucket.toString());
         long duration =System.currentTimeMillis()-start;
         if(duration > rehashDurationThreshold && detectRehashRequired())
         rehash();
     
    	return true;
    }
    
    public List<EntryImpl> getAll() {
		if(buckets == null)
			return null;
		
		List<EntryImpl> entryList= new ArrayList<EntryImpl>();
		for(Buckets bucket:buckets){
			if(!(bucket == null)){
				for(EntryImpl a:bucket.getEntryList()){
					entryList.add(a);
				}
			}
		}
    	return entryList;
	}
    
    public String get(String key) {
		Buckets bucket = buckets[getHash(key)];
		if(bucket == null)
			return null;
		return bucket.get(key);
	}
    
	public boolean contains(String key){
		return get(key)!= null;	
    }
    
    public boolean remove(String key){
       return buckets[getHash(key)].remove(key);
    }

	@Override
	public String toString() {
		return "HashSet [capacity=" + capacity + ", buckets=" + Arrays.toString(buckets)
				+ ", rehashLinkedListThreshold=" + rehashLinkedListThreshold + ", rehashDurationThreshold="
				+ rehashDurationThreshold + "]";
	}
}
