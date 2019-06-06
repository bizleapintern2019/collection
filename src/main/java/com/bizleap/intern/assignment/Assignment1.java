package com.bizleap.intern.assignment;
import java.util.Map;
import java.util.*;

public class Assignment1 {
	
	Map<Integer,Integer> hashmap=new LinkedHashMap<Integer,Integer>();
	public int recursionMap(int n){
	int output =1;
		if(n>1){
		output=n+recursionMap(n-1);
	 } 
	hashmap.put(n,output);
	return output;
}
	public int loopMap(int n){
		int result=0;
		for(int i=1;i<=n;i++){
			result+=i;
			hashmap.put(i, result);
		}
		return n;
	}
	public static void main(String[] args) {
		int n=20;
		Assignment1 assignment=new Assignment1();
		System.out.println("Summation map recursion using hashmap is: "+assignment.recursionMap(n));
		System.out.println(assignment.hashmap);
		assignment.hashmap.clear();
		System.out.println("Summation map using loop map is :"+assignment.loopMap(n));
		System.out.println(assignment.hashmap);
	}

}
