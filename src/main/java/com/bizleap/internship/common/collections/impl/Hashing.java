/*
 * Hashing algorithms are widely in the implementation of various data structures such as Java HashTable or HashMap as well as in the 
 * implementations of many NoSQL big data databases based on Google BigTable such as Cassandra; or in memory grid (or cache)such as 
 * Oracle Coherence.They all are in fact key-value stores in which the key is mapped by a hash function to integer value as an index
 *  in the list of bucks where the value should be stored or a point in the ring in case of consistent hashing.
 *  In this exercise we want to implement a liner hashing algorithm method and an utility class that uses it to implement a HashTable.
 * 
 *  Write a Java method that would take an input string key and return the index value from 0 to 255.
*/

package com.bizleap.internship.common.collections.impl;


public class Hashing {
	
	public int getHash(String key) {
		int charSum = 0;
		for(char singelChar:key.toCharArray())
			charSum += (int)singelChar;
		
		return ((charSum*2-50)%255);
	}
	
	public static void main(String[] args) {
		
		Hashing hashing = new Hashing();
		
		System.out.println("Hashing algorithms are widely in the implementation of various data structures : "+hashing.getHash("Hashing algorithms are widely in the implementation of various data structures."));
		System.out.println("Taungyi : "+hashing.getHash("Taungyi"));
		System.out.println("zoo : "+hashing.getHash("zoo"));
		System.out.println("SONY : "+hashing.getHash("SONY"));
		System.out.println("Write a Java method that would take an input string key and return the index value : "+hashing.getHash(" Write a Java method that would take an input string key and return the index value"));
		System.out.println("databases :"+hashing.getHash("databases"));
		System.out.println("various data structures : "+hashing.getHash("various data structures"));
		System.out.println("algorithms : "+hashing.getHash("algorithms"));
		System.out.println("apple : "+hashing.getHash("apple"));
	}

}
