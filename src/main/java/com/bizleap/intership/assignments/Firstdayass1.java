package com.bizleap.intership.assignments;

public class Firstdayass1 {
	public static void main(String args[]) {
		int n=5;
		int factorial=1;
		System.out.println("Final procedure number is "+factorialProcedure(n));
		factorial=factorialR(n);
		System.out.println("Factorial of "+n+" is "+factorial);
		
		
	}
	public static int factorialProcedure(int a) {
		int j=1;
		for(int i=1;i<a+1;i++)
		{
			j=i*j;
			System.out.println(i+"!="+j);
		}
		return j;
	}
	public static int factorialR(int n) {
		if(n==0)
			return 1;
		else
			return(n*factorialR(n-1));
	}

}
