package com.bizleap.internship.common.collections.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.bizleap.internship.common.collection.Set;

public class HashSet implements Set{
	private int capacity=256;
	private Bucket[] buckets;
	private int rehashLinkedListThreshold=50;
	private int rehashDurationThreshold=5;

	public HashSet() {
		buckets = new Bucket[capacity];
	}

	private boolean detectRehashRequired(){
		for(Bucket bucket:buckets) {
			if(!(bucket==null)) {
				System.out.println("The linkedlist size in bucket is "+bucket.size+".");
				if(bucket.size >= rehashLinkedListThreshold)
					return true;
			}
		}
		return false;
	}

	private void rehash(){
		Bucket[] previousBuckets=buckets;
		capacity*=2;
		buckets = new Bucket[capacity];
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
		Bucket bucket = buckets[hash];
		if(buckets[hash] == null){
			bucket = new Bucket();
			buckets[hash] = bucket;
		}
		bucket.add(key, key);
		long duration =System.currentTimeMillis()-start;
		if(duration > rehashDurationThreshold && detectRehashRequired())
			rehash();
		return true;
	}

	public String get(String key) {
		Bucket bucket = buckets[getHash(key)];
		if(bucket == null)
			return null;
		return bucket.get(key);
	}

	public List<EntryImpl> getAll() {
		if(buckets == null)
			return null;

		List<EntryImpl> entryList= new ArrayList<EntryImpl>();
		for(Bucket bucket:buckets){
			if(!(bucket == null)){
				for(EntryImpl a:bucket.getEntryList()){
					entryList.add(a);
				}
			}
		}
		return entryList;
	}

	public boolean contains(String key){
		return get(key)!= null;	
	}

	public boolean remove(String key){
		return buckets[getHash(key)].remove(key);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<buckets.length;i++){
			if(buckets[i]!=null){
				sb.append(buckets[i]);
			}
		}
		return "HashSet [capacity=" + capacity + ", buckets=" + Arrays.toString(buckets) + "]";
	}
}
