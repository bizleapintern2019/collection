/*
Hashing algorithms are widely in the implementation of various data structures such as Java HashTable or HashMap as well as
in the implementations of many NoSQL big data databases based on Google BigTable such as Cassandra; or in memory grid (or cache) such as Oracle Coherence.
They all are in fact key-value stores in which the key is mapped by a hash function to integer value as an index in the list of bucks
where the value should be stored or a point in the ring in case of consistent hashing.
In this exercise we want to implement a liner hashing algorithm method and an utility class that uses it to implement a HashTable.

Write a Java method that would take an input string key and return the index value from 0 to 255.
*/

package com.bizleap.internship.assignments.common.collections.impl.test;
import org.junit.Test;

//import java.util.Hashtable;

public class Hashing {

	public int getHash(String key) {
		int sum = 0;
		
		for(char singleCharacter : key.toCharArray()) {
			sum += (int) singleCharacter;
		}	
		return ((sum*2-50)%255);
		
		//Hashtable<String, Integer> datas = new Hashtable<>();
		//datas.put(input, (sum*5)/255);
		//System.out.println("The index value of " + "'" + input + "': " + datas.get(input));
	}
	
	@Test
	public void hashing() {
		Hashing hashing = new Hashing();
		System.out.println("San Thinzar Linn is: " + hashing.getHash("San Thinzar Linn"));
		System.out.println("Yangon is: " + hashing.getHash("Yangon"));
		System.out.println("University of Computer Studies,Yangon is: " + hashing.getHash("University of Computer Studies,Yangon"));
		System.out.println("data structures is: " + hashing.getHash("data structures"));
		System.out.println("Hashing functions is: " + hashing.getHash("Hashing functions"));
		System.out.println("UCSM is: " + hashing.getHash("UCSM"));
		System.out.println("Primitive data types is: " + hashing.getHash("Primitive data types"));
		System.out.println("apple is: " + hashing.getHash("apple"));
		System.out.println("Write a Java method that would take an input string key and return the index value from 0 to 255 is: " + hashing.getHash("Write a Java method that would take an input string key and return the index value from 0 to 255"));
	}
}