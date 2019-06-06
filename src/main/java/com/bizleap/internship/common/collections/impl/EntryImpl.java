package com.bizleap.internship.common.collections.impl;

import com.bizleap.internship.common.collections.Entry;

public class EntryImpl implements Entry {
	private String key;
	private String  value;
	@Override
	public String toString() {
		return " [key=" + key + ", value=" + value + "]";
	}
	public String getKey() {
		return key;
	}
	public EntryImpl(String key, String value) {
		this.key = key;
		this.value = value;
	}
	public EntryImpl() {}
	public void setKey(String key) {
		this.key = key;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}


}
