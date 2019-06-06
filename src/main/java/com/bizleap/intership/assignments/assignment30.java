package com.bizleap.intership.assignments;
import java.util.Scanner;

public class assignment30 {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		System.out.println("Please enter Strings.");
		
		String s=in.nextLine();
		StringBuffer a=new StringBuffer(s);
		String [] ary=a.toString().split(" " );
		char temp;
		for(int i=0;i<ary.length;i++)
		{
			StringBuffer sd=new StringBuffer(ary[i]);
			sd=sd.reverse();
			ary[i]=sd.toString();
			char c[]=ary[i].toCharArray();
			System.out.print(c);
			System.out.print(" ");
		}
		System.out.println(toReverse("leap start you"));
		
	}
	public static String toReverse(String s) {
		StringBuffer sf=new StringBuffer(s);
		sf.reverse();
		
		return sf.toString();
		
	}

}
