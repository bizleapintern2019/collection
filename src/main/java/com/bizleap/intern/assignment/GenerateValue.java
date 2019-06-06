package com.bizleap.intern.assignment;

import java.util.HashMap;

import java.util.Map;



public class GenerateValue {
Map<String,String> valueMap=new HashMap<String,String>();
			public void put(){
			valueMap.put("Hsu", "Hsu Hsu");
		    valueMap.put("S", "Shan Noodle");
		    valueMap.put("D", "Drink");
		    valueMap.put("R", "Rice");
		 
		    String value=valueMap.get("S");
		     System.out.println("The Value mapped to Key 4 is:"+ value);
		 
		    
		     String val2=valueMap.get("D");
		     System.out.println("The Value mapped to Key 5 is:"+ val2);
		  }
		
	
	public static void main(String[] args) {
		GenerateValue values=new GenerateValue();
		values.put();
		
	}

}
