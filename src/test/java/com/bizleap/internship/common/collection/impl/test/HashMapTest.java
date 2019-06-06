package com.bizleap.internship.common.collection.impl.test;

import java.util.List;

import org.junit.Test;

import com.bizleap.internship.common.collection.impl.EntryImpl;
import com.bizleap.internship.common.collection.impl.HashMap;

public class HashMapTest {

	public HashMap populateMap(int size) {

		HashMap myHashMap = new HashMap();
		myHashMap.put("UCSY", "University Of Computer Studied");
		myHashMap.put("YCSU", "Hello");
		myHashMap.put("CCPD", "Central City Police");
		myHashMap.remove("UCSY");
		 
		return myHashMap;
		// for(int i=0; i<size; i++){
		// myHashMap.put(buildString(i+1), buildString(i));
		// }
		// return myHashMap;
	}

	// public String buildString(int length){
	// String text = "This is a String Test to implement the LinkedHashMap
	// Program.";
	// Random random = new Random();
	// StringBuilder stringBuilder = new StringBuilder();
	// for (int i = 0; i < length; i++) {
	// stringBuilder.append(text.charAt(random.nextInt(text.length())));
	// }
	// System.out.println(stringBuilder);
	// return stringBuilder.toString();
	// }
	@Test
	public  void  HashMapTesting()  {
		HashMapTest hashingImpl = new HashMapTest();
		HashMap myHashMap = hashingImpl.populateMap(100);
		List<EntryImpl> list = myHashMap.getAll();

		for (EntryImpl entry : list) {
			if (!(entry == null)) {
				System.out.print("{" + entry.getKey() + "," + entry.getValue() + "}");
			} else
				System.out.print("");
		}
		// System.out.println("\nCapacity: "+myHashMap.getCapacity());
	}
}
