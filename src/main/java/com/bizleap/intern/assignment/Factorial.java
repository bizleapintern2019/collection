package com.bizleap.intern.assignment;

public class Factorial {
	public int procedure(int n){
		int factorial=1;
		for(int i=1;i<=n;i++){
			factorial=factorial*i;
		}
		return factorial;
	}
	
	public  int recursive(int n){
		if(n<=0)
			return 1;
		return(n*recursive(n-1));
	}
	
	public static void main(String[] args) {
	     int number=5;
	     Factorial factorial=new Factorial();
	     System.out.println("Factorial of 5 by procedure is: "+factorial.procedure(number));
	     System.out.println("Factorial of 5 by recursive is: "+factorial.recursive(number));
	}
}
