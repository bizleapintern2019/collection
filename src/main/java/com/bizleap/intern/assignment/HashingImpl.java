package com.bizleap.intern.assignment;

import java.nio.charset.Charset;

import java.util.Random;

public class HashingImpl {
	
	public MyHashMap populateMap(int size){
		MyHashMap myHashMap= new MyHashMap();
		for(int i=0; i<size; i++){
			myHashMap.put(makeString(i+1), ""+i);
		}
		return myHashMap;
	}
	
	public String makeString(int length){
		String alaphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int size=alaphabet.length();
		Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            stringBuilder.append(alaphabet.charAt(random.nextInt(size)));
        }
        System.out.println(stringBuilder);
        return stringBuilder.toString();
	}
	
	public static void main(String[] args) {
		HashingImpl hashingImpl= new HashingImpl();
		MyHashMap myHashMap= hashingImpl.populateMap(400);
		myHashMap.getAll();
		myHashMap.rehash();
	}
}