/*Write a java method that would take an array of integers and return an array with the numbers who occurrence
in the input array is even number.
For example,
[1, 2, 3] shall return []
[1, 2, 3, 2] shall return [2]
[9, 1, 1, 5, 3, 1, 5, 1] shall return [1, 5]

2) Write the same method above but without using any array or array list.*/

package com.bizleap.intern.assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class CheckDuplicateNumber {
	
	public List<Integer> getDuplicateInt(int[] list){
		List<Integer> duplicateNumber=new ArrayList<Integer>();
		int count=0;
		for(int i=0;i<list.length;i++){
			for(int j=0;j<list.length;j++){
				if(list[i]==list[j]){
					count++;
				}
			}
			if(count%2 ==0){
				if(!duplicateNumber.contains(list[i]))
					duplicateNumber.add(list[i]);
				
			}
			count=0;
		}
		return duplicateNumber;
	}
	
	public Vector<Integer> getDuplicateNumber(Vector numbers){
		int count=0;
		Vector<Integer> duplicateVector=new Vector<Integer>();
        for(int i=0;i<numbers.size();i++){
              for(int j=0;j<numbers.size();j++){
                   if(numbers.elementAt(i)==numbers.elementAt(j)){
                        count++;
                   }
              }
              if(count%2==0){
            	  if(!duplicateVector.contains(numbers.elementAt(i)))
            		  duplicateVector.add((Integer)numbers.elementAt(i));
              }
              count=0;
        }
         return duplicateVector;
	}
	
	public static void main(String[] args) {
		int[] list={2,4,4,5,6,6};
		Vector<Integer> numbers=new Vector<Integer>();
		numbers.add(2);
		numbers.add(4);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		numbers.add(6);
		CheckDuplicateNumber duplicateNumber=new CheckDuplicateNumber();
		System.out.println("The Duplicate Number using array is "+duplicateNumber.getDuplicateInt(list));
		System.out.println("The Duplicate Number using vector is "+duplicateNumber.getDuplicateNumber(numbers));
	}

}
