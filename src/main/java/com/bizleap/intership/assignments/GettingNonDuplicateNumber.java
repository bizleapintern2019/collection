/*Implement a method that takes an array of ints as input and returns the number that is not in the list twice.
Return the one number which doesn’t have a match. If it fails to find a single number, then -1 is returned.
Or if it finds more than one nonduplicate integer and return -1 as well.
Write a method to run some simple test cases on the method to ensure it works properly.
/**
*@param list The array of number pairs to check
*@return The one int that doesn't have a matching pair or -1
*/

//public int getNonDuplicateInt(int list){
// Implement code}
/**
*This method should be used to show how to call the getNonDuplicateInt method.
*It should also run some simple test cases on the method to ensure it works properly.
public void testGetNonDuplicateInt();*/

package com.bizleap.intership.assignments;

public class GettingNonDuplicateNumber {
	
	public int getNonDuplicateInt(int[] numbereArray) {
		int result=0,nonDuplicateCount=0;
		
		for(int j=0;j<numbereArray.length;j++) {
			int count = 0;
			for(int i=0;i<numbereArray.length;i++) {
				if(numbereArray[j]==numbereArray[i]) 
					count++;
			}
			if(count<=1) {
				result=numbereArray[j];
				nonDuplicateCount++;
			}	
		}
		if(nonDuplicateCount==1)
			return result;
		return -1;
	}
	
	public void testGetNonDuplicateInt() {
		int [] numberArray= {1,1,1,2,2,3,3,4,5};
		System.out.println("There is no -1 in the list,so the result is: " +getNonDuplicateInt(numberArray));
	}
	
	public static void main(String []args) {
		new GettingNonDuplicateNumber().testGetNonDuplicateInt();	
	}
}