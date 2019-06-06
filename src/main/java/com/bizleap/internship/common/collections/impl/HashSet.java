package com.bizleap.internship.common.collections.impl;

import java.util.ArrayList;
import java.util.List;

import com.bizleap.internship.common.collections.Entry;
import com.bizleap.internship.common.collections.Map;
import com.bizleap.internship.common.collections.Set;

public class HashSet implements Set {
	private Map map;

	public HashSet() {
		// TODO Auto-generated constructor stub
		map=new HashMap();
	}

	public boolean add(String key) {
		if(!(contains(key))) {
			map.put(key, key);
			return true;
		}
		return false; 
	}

	public List<String> getAll(){
		List<String> keyList= new ArrayList<String>();
		List<Entry> entryList=map.getAll();
		for(Entry entry:entryList) {
			if(!(entry==null)) {
				keyList.add(entry.getKey());
			}
		}
		return keyList;
	}
	
	public String get(String key) {
		if(!(map.get(key)==null)) {
			return map.get(key);
		}
		return null;
	}

	@Override
	public String toString() {
		return  map.toString() ;
	}

	public boolean contains(String key) {
		return !(get(key)==null);
	}
	public boolean remove(String key) {
		return map.remove(key);
	} 

}
