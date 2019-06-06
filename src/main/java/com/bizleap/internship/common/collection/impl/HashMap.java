/*Implement a hashing utility class, MyHashMap utilizing the hashing method implemented in assignment 8.
The class should have these methods:
1) put ( key, value) --- store the value in the bucket
2) get ( key ) - retrieve the value from the bucket and returns it
3) remove (key) - remove the value form the bucket return true if it is successful
 */
package com.bizleap.internship.common.collection.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.bizleap.internship.common.collections.Map;

public class HashMap implements Map{

	private Buckets[] buckets;
	private int capacity= 256;
	private int rehashLinkedlistSizeThreshold =50;
	private  int rehashDurationThreshold=10;

	public int getRehashDurationThreshold(){
		return rehashDurationThreshold;
	}

	public void setRehashDurationThreshold(int rehashDurationThreshold){
		this.rehashDurationThreshold = rehashDurationThreshold;
	}

	public int getCapacity(){
		return capacity;
	}

	public void setCapacity(int capacity){
		this.capacity = capacity;
	}

	public HashMap(){
		buckets = new Buckets[getCapacity()];
	}
	public HashMap(int capacity){
		buckets = new Buckets[getCapacity()];
	}
	public boolean detectReHashRequierd(){

		for(Buckets bucket:buckets){
			if(!(bucket==null)){
				//System.out.println("The size of buckets is"+bucket.size+"");
				if(bucket.getSize() >= rehashLinkedlistSizeThreshold)
					return true;
			}
		}
		return false;
	}

	public void rehash(){

		Buckets[] previousBuckets = buckets;
		setCapacity(getCapacity() * 2);
		buckets = new Buckets[getCapacity()];
		System.out.println("The bucket capacity is changed into "+buckets.length);

		for(int i=0;i<previousBuckets.length;i++){
			buckets[i] = previousBuckets[i];
		}
	}

	private int getHash(String key){

		char[] keyArray=key.toCharArray();
		int charSum = 0;
		for(char singleChar : keyArray){
			charSum += (int)singleChar;
		}
		return (((charSum*4)-2)%255);	
	}

	public void put(String key,String value){

		if(key==null)
			return;    
		long start =System.currentTimeMillis();
		int hash=getHash(key);
		Buckets bucket= buckets[hash];
		if(bucket== null){
			bucket = new Buckets();
			bucket.add(key, value);
			buckets[hash]=bucket;
		}else{      
			bucket.add(key, value);
		}

		long duration  = System.currentTimeMillis()-start;

		if(duration > rehashDurationThreshold && detectReHashRequierd()){
			rehash();
		}
	}

	public String get(String key){
		Buckets bucket = buckets[getHash(key)];
		if(bucket==null){
			return null;
		}
		return bucket.get(key);	
	}

	public List<EntryImpl> getAll(){
		if(buckets == null)
			return null;

		List<EntryImpl> entryList = new ArrayList<EntryImpl>();
		for(Buckets bucket: buckets){
			if(!(bucket==null)){
				entryList.addAll(bucket.getEntryList());
			}
		}
		return entryList;
	}


	public boolean contains(String key){

		return get(key) != null;
	}

	public boolean remove(String key){
		return buckets[getHash(key)].remove(key);
	}

	
	public Map populateMap(int i){
		return null;
	}

	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		for(int i =0;i<buckets.length;i++){
			if(buckets[i]!=null){
				sb.append(buckets[i]);
			}
		}

		return "MyHashMap [buckets=" + sb + ",\n capacity=" + capacity
				+ ",\n rehashLinkedlistSizeThreshold=" + rehashLinkedlistSizeThreshold + ",\n rehashDurationThreshold="
				+ rehashDurationThreshold + "]";
	}

}


