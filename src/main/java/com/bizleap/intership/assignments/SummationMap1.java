package com.bizleap.intership.assignments;

import java.util.HashMap;
import java.util.Map;

public class SummationMap1 {
	    Map<Integer, Integer> resultMap=new HashMap<Integer, Integer>();
	    
		public int recursiveMap(int number) {
			if(number>=1) {
				int value=number+recursiveMap(number-1);
				resultMap.put(number,value);
				return value;
			}
			return 0;
		}

		public int withLoop(int number) {
			resultMap.clear();
			int result=1;
			for(int i=1;i<=number;i++) {
	    		if(i==1)
	    			resultMap.put(i, 1);
	    		else {
	    			result=i+result;
	    			resultMap.put(i,result);
	    		}
			}
			return result;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SummationMap1 summatonMap=new SummationMap1();
	    int number=20;
	    summatonMap.recursiveMap(number);
	    System.out.println("With no lopp sequence 	 is: "+summatonMap.resultMap);
	    summatonMap.withLoop(number);
	    System.out.println("With loop sequence 	 is: "+summatonMap.resultMap);
	}
	
}