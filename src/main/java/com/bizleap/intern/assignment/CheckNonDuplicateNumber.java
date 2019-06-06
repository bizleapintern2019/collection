	/*
Implement a method that takes an array of ints as input and returns the number that is not in the list twice.

Assume that the array contains only positive ints and that only one number will not have a matching pair.

Return the one number which doesn’t have a match. If it fails to find a single number, then Or if it find more than one non duplicate integer and returned -1 as well..

Write a method to run some simple test cases on the method to ensure it works properly.
*/
package com.bizleap.intern.assignment;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CheckNonDuplicateNumber {
	
	public int getNonDuplicateInt(int[] list){
		
		long startTime=System.currentTimeMillis();

		int result=0;
		int count;
		List<Integer> nonDuplicateNumber=new ArrayList<Integer>();
		for(int i=0;i<list.length;i++){
			count=0;
			for(int j=0;j<list.length;j++){
				if(list[j]==list[i])
					count++;
			}
			if (count>1)
				result=-1;
			else
				nonDuplicateNumber.add(list[i]);
		}
		if(nonDuplicateNumber.size()==1)
			result=nonDuplicateNumber.get(0);
		System.out.println(System.currentTimeMillis()-startTime);
		return result;
		
		
	}
	
	public void testGetNonDuplicateInt(){
		int list[]={2,2,1,3,3,1,4,5,6};
		System.out.println("The non duplicate number is "+new CheckNonDuplicateNumber().getNonDuplicateInt(list));
		
	}
		
	public static void main(String[] args) {
		new CheckNonDuplicateNumber().testGetNonDuplicateInt();
	}
}
