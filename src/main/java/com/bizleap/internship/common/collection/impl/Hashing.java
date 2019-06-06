/*Hashing algorithms are widely in the implementation of various data structures such as Java HashTable or HashMap as well as in the implementations of many NoSQL big data databases based on Google BigTable such as Cassandra; or in memory grid (or cache)
such as Oracle Coherence.
They all are in fact key-value stores in which the key is mapped by a hash function to integer value as an index in the list of bucks where the value should be stored or a point in the ring in case of consistent hashing.
In this exercise(Assignment 8, 9,10) we want to implement a liner hashing algorithm method and an utility class that uses it to implement a HashTable.

-Write a Java method that would take an input string key and return the index value from 0 to 255.
*/
package com.bizleap.internship.common.collection.impl;

public class Hashing {
	
	public int getHash(String key){
	
		int charSum = 0;
		
		for(char singleChar : key.toCharArray()){
			charSum += (int)singleChar;
		}
		return (((charSum*4)-2)%255);	
	}
	
	public static void main(String args[]){
		System.out.println("Yamonezin is "+new Hashing().getHash("Yamonezin"));
		System.out.println("Internship is "+new Hashing().getHash("Internship"));
		System.out.println("Book is "+new Hashing().getHash("Book"));
		System.out.println("Iamastudent is "+new Hashing().getHash("Iamastudent"));
		System.out.println("University is "+new Hashing().getHash("University"));
		System.out.println("Computer is "+new Hashing().getHash("Computer"));
		System.out.println("Science is "+new Hashing().getHash("Science"));
		System.out.println("new HashingValue().indexValueGenerator is "+new Hashing().getHash("new HashingValue().indexValueGenerator"));
	}
}
