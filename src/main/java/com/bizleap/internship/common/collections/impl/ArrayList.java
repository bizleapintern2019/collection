package com.bizleap.internship.common.collections.impl;

import java.util.Arrays;

public class ArrayList {
	private String[] list;
	private int size = 0;

	public ArrayList(){
		list = new String[10];
	}

	public String get(int index){
		if(index < size)
			return list[index];
		return null;
	}

	public void add(String obj){
		if(list.length-size <= 5){
			increaseListSize();
		}
		list[size++] = obj;
	}

	public String remove(int index){
		if(index < size){
			String obj = list[index];
			list[index] = null;
			int tmp = index;
			while(tmp < size){
				list[tmp] = list[tmp+1];
				list[tmp+1] = null;
				tmp++;
			}
			size--;
			return obj;
		}
		return null; 
	}

	public int size(){
		return size;
	}

	private void increaseListSize(){
		list = Arrays.copyOf(list, list.length*2);
		System.out.println("\nNew length: "+list.length);
	}

	public static void main(String[] args){
		ArrayList al = new ArrayList();
		al.add("2");
		al.add("5");
		al.add("1");
		al.add("23");
		al.add("14");
		for(int i=0;i<al.size();i++){
			System.out.print(al.get(i)+" ");
		}
		al.add("29");
		System.out.println("Element at Index 5:"+al.get(5));
		System.out.println("List size: "+al.size());
		System.out.println("Removing element at index 2: "+al.remove(2));
		for(int i=0;i<al.size();i++){
			System.out.print(al.get(i)+" ");
		}
	}
}
