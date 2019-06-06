/*Write a program that would return a HashMap for the months in a year in which key being the number of days in the month 
 * while value begin the list of month that has the same number of days.*/

package com.bizleap.intership.assignments;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MonthList {
	
    public enum Month {
		Junary(31),
		February(28),
		March(31),
		Aprial(30),
		May(31),June(30),
		July(31),
		August(31),
		September(30),
		October(31),
		November(30),
		December(31);
    	
    	private int dayCount;
    	
    	private Month(int day) {
    		this.dayCount=day;
    	}
    	public int getDayCount() {
    		return dayCount;
    	}
    }
    
    public void getMonthMap() {
    	Map<Integer,List<String>> monthMap=new HashMap<>();
    	for(int i: getDayList()) {
    		List<String> list=new ArrayList<>();
    		for(Month month : Month.values()) {
    			if(month.getDayCount() == i) {    					
    				list.add(month.name());
    			}			
    		}
    		monthMap.put(i, list);
    	}
    	System.out.println(monthMap);
    }
    
    public List<Integer> getDayList() {
    	
    	List<Integer> days=new ArrayList<Integer>();
    	
    	for(Month monthNo : Month.values()) {
    		if(!days.contains(monthNo.getDayCount()))
    			days.add(monthNo.getDayCount());
    	}
    	return days;
    }
    
	public static void main(String args[]) {
		new MonthList().getMonthMap();		
	}
}