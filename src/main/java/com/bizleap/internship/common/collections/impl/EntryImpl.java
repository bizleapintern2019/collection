package com.bizleap.internship.common.collections.impl;

import com.bizleap.internship.common.collection.Entry;

public class EntryImpl implements Entry {
     
	String key;
	String value;

	public EntryImpl(String key, String value){
		this.key = key;
		this.value = value;
	}
	
	public void setKey(String key) {
		this.key = key;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getKey() {
		return null;
	}

	
	public String getValue() {
		return null;
	}

	@Override
	public String toString() {
		return "EntryImpl [key=" + key + ", value=" + value + "]";
	}
}
