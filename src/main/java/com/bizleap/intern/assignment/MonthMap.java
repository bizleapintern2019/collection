 /*
Write a program that would return a HashMap for the months in a year in which key being

the number of days in the month while value begin the list of month that has them same number of days.
*/
package com.bizleap.intern.assignment;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MonthMap {
	enum Month{
		January(31),
		February(28),
		March(31),
		April(30),
		May(31),
		June(30),
		July(31),
		August(31),
		Septmber(30),
		October(31),
		November(30),
		December(31);
	private int day;
    Month (int day){
	this.day=day;
  }
    public int getMonth(){
	return day;
      }
 }
	
	public Map<Integer,List<Month>> getMonthMap(){
		List<Month> monthList=new ArrayList<Month>(EnumSet.allOf(Month.class));
		Map<Integer,List<Month>> resultmap=new HashMap<Integer,List<Month>>();
		for(Month month:monthList){
		List<Month> newlist=resultmap.get(month.day);
		 	if(newlist==null){
				 newlist=new ArrayList<Month>();
				 resultmap.put(month.day,newlist);
		 	}
		 	newlist.add(month);
	 }
	  return resultmap;
 }
	public static void main(String[] args) {
			MonthMap monthMap=new MonthMap();
			Map<Integer,List<Month>> resultMap=monthMap.getMonthMap();
			System.out.println(resultMap);
		}
}
