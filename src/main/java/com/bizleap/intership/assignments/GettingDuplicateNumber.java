/*1) Write a java method that would take an array of integers and return an array with the numbers who occurrence
in the input array is even number.

For example,
[1, 2, 3] shall return []
[1, 2, 3, 2] shall return [2]
[9, 1, 1, 5, 3, 1, 5, 1] shall return [1, 5]

2) Write the same method above but without using any array or array list.*/

package com.bizleap.intership.assignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class GettingDuplicateNumber {
	
	//using arraylist to calculate duplicateNumber
	public List<Integer> getDuplicateNumber(int[] numberArray) {
		List<Integer> resultList=new ArrayList<>();
		int count=0;
		
		for(int j=0;j<numberArray.length;j++) {
			for(int i=0;i<numberArray.length;i++) {
				if(numberArray[j]==numberArray[i]) 
					count++;
			}
			if(count%2==0) {
				if(!resultList.contains(numberArray[j]))
					resultList.add(numberArray[j]);
			}
			count=0;
		}
		return resultList;
	}
	
	//without using array, using vector and set.
	public Set<Integer> getWithoutArray(Vector<Integer> vectorNumber) {
		Set<Integer> numberStore = new HashSet<Integer>();
		
		for(int j=0;j<vectorNumber.size();j++) {
			int count=0;
			for(int i=0;i<vectorNumber.size();i++) {
				if(vectorNumber.get(i)==vectorNumber.get(j)) 
					count++;
			}
			if(count%2==0) {
				if (!numberStore.add(vectorNumber.get(j))) {
					if(numberStore.contains(vectorNumber.get(j)))
						numberStore.add(vectorNumber.get(j));
				}       		
			} 
	    }
		return numberStore;
	}
	
	public void testGetDuplicateNumber() {
		
		int [] numberArray1= {1,2,3};
		int [] numberArray2= {1,2,3,2};
		int [] numberArray3= {9,1,1,5,3,1,5,1};
		System.out.println(getDuplicateNumber(numberArray1 ));
		System.out.println(getDuplicateNumber(numberArray2));
		System.out.println(getDuplicateNumber(numberArray3));
		Vector<Integer> number=new Vector<>();
		number.add(1);
		number.add(5);
		number.add(1);
		number.add(2);
		System.out.println("Without using any array: "+getWithoutArray(number));
	}
	
	public static void main(String []args) {
		new GettingDuplicateNumber().testGetDuplicateNumber();	
	}
}