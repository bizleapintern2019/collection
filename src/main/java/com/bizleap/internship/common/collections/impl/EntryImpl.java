package com.bizleap.internship.common.collections.impl;
import com.bizleap.internship.common.collecitons.Entry;

public class EntryImpl implements Entry {
	private String key;
	private String value;

	public EntryImpl(String key, String value) {
		this.key = key;
		this.value = value;
	}

	public EntryImpl() {

	}

	public void setKey(String key) {
		this.key = key;
	}

	public void setValue(String value) {
		this.value = value;
	}

	

	@Override
	public String toString() {
		return "EntryImpl [key=" + key + ", value=" + value + "]";
	}

	public String getKey() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getValue() {
		// TODO Auto-generated method stub
		return null;
	}

}
