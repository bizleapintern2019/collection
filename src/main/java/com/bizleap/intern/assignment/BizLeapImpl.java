/*
Implement a Java method that would take an integer n and return a list with n number of strings.

You must create the list by adding a string for every number from 1 to n as follows:

    add 'Biz' if the number is divisible by 3
    add 'Leap' if the number is divisible by 5
    add 'BizLeap' if the number divisible by both 3 and 5

Below is the interface of the Java class. You must implement a Java class that conforms to this interface.
Use the naming convention in which a class name is formed by simply adding the 'Impl' to the interface name that it implements.

*/
package com.bizleap.intern.assignment;


import java.util.ArrayList;
import java.util.List;

public class BizLeapImpl implements  BizLeap {
	
	public List<String> generateList(int number){
		List<String> stringList=new ArrayList<String>();
		for(int i=1;i<=number;i++){
			if(i % 3 ==0 && i % 5==0){
				stringList.add("bizleap for number "+i);
			}
			
			else  if(i % 3==0){
				  stringList.add("biz for number"+i);
			  }
			
			else  if(i %5==0){
				  stringList.add("leap for number "+i);
			  }
		  }
		
		 return stringList;
	}
	
	public void testGenerateList(){
		System.out.println(generateList(30));
	}
	
	public static void main(String[] args) {
			BizLeapImpl bizleapImpl=new BizLeapImpl();
			bizleapImpl.testGenerateList();
	}			

}





	


		

