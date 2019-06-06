package com.bizleap.internship.common;

public enum MonthsData {
	January(31), February(28), March(31), April(30), May(31),June(30),
	July(31), August(31), September(30), October(31), November(30), December(31),Newone(1);

	private int dayCount;	
	private MonthsData(int dayCount){
		this.dayCount=dayCount;
	}
	
	public int getDayCount(){
		return dayCount;
	}
}
