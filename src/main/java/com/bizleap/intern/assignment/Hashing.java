
/*Hashing algorithms are widely in the implementation of various data structures such as Java HashTable or HashMap as well as in the implementations of many NoSQL big data databases based on Google BigTable such as Cassandra; or in memory grid (or cache)
such as Oracle Coherence.

They all are in fact key-value stores in which the key is mapped by a hash function to integer value as an index in the list of bucks where the value should be stored or a point in the ring in case of consistent hashing.

In this exercise we want to implement a liner hashing algorithm method and an utility class that uses it to implement a HashTable.

    Write a Java method that would take an input string key and return the index value from 0 to 255.
*/

package com.bizleap.intern.assignment;

import java.util.HashMap;
import java.util.Map;

public class Hashing {
	
	public int getHashValue(String key){
		int result=0;
		for(char ch:key.toCharArray()){
			result+=(int)ch;
		}
		return (result*20)/255;
	}
	public static void main(String[] args) {
		System.out.println("hello:"+" "+new Hashing().getHashValue("hello"));
		System.out.println("Hsu:"+" "+new Hashing().getHashValue("Hsu"));
		System.out.println("kayzin:"+" "+new Hashing().getHashValue("kayzin"));
		System.out.println("sawsandi:"+" "+new Hashing().getHashValue("sawsandi"));
		System.out.println("san:"+" "+new Hashing().getHashValue("san"));
		System.out.println("khin:"+" "+new Hashing().getHashValue("khin"));
		System.out.println("kaung:"+" "+new Hashing().getHashValue("kaung"));
		System.out.println("Hashing algorithms are widely in the implementation of various data structures:"+" "+new Hashing().getHashValue("Hashing algorithms are widely in the implementation of various data structures"));
		System.out.println("Java HashTable or HashMap as well as in the implementations of many NoSQL big data databases based on Google BigTable such as Cassandra:"+" "+
							new Hashing().getHashValue(""));
		System.out.println("Her private life:"+" "+new Hashing().getHashValue("Her private life"));
		System.out.println("Android developer:"+" "+new Hashing().getHashValue("Android developer"));
		System.out.println("Software engineer:"+" "+new Hashing().getHashValue("Software engineer"));
	}
}
