package com.bizleap.internship.assignments.common.collections.impl;

import com.bizleap.internship.assignments.common.collection.Entry;

public class EntryImpl implements Entry {
	private String key;
	private String value;
	
	public EntryImpl(String key, String value) {
		this.key = key;
		this.value = value;
	}

	@Override
	public String toString() {
		return "EntryImpl [key=" + key + ", value=" + value + "]";
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getKey() {
		return key;
	}
	
	public void setValue(String value) {
		this.value = value;
	}
	public String getValue() {
		return value;
	}
}
