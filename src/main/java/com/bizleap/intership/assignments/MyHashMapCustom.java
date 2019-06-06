/*
Implement a hashing utility class, MyHashMap utilizing the hashing method implemented in assignment 8.

The class should have these methods:
1) put ( key, value) --- store the value in the bucket
2) get ( key ) - retrieve the value from the bucket and returns it
3) remove (key) - remove the value form the bucket return true if it is successful
 */

package com.bizleap.intership.assignments;

class MyHashMapEx {

	private Node[] buckets;   
	private int capacity= 256;  

	static class Node {
		int key;
		String value;
		Node next;

		public Node(int key, String value, Node next) {
			this.key = key;
			this.value = value;
			this.next = next;
		}
	}
	
	public MyHashMapEx() {
		buckets = new Node[capacity];
	}

	public void put(int key, String data) {
		Node newEntry = new Node(key, data, null);
		if(buckets[key] == null)
			buckets[key] = newEntry;
		else {
			Node previous = null;
			Node current = buckets[key];

			while(current != null) { 
				if(current.key==key) {
					if(previous==null) {  
						newEntry.next=current.next;
						buckets[key]=newEntry;
						return;
					}
					else {
						newEntry.next=current.next;
						previous.next=newEntry;
						return;
					}
				}
				previous=current;
				current = current.next;
			}
			previous.next = newEntry;
		}
	}

	public String get(int key) {
		if(buckets[key] == null)
			return null;
		
		Node temp = buckets[key];
		while(temp!= null) {
			if(temp.key==key) 
				return temp.value;
			temp = temp.next; 
		}         
		return null;
	}

	public boolean remove(int key) {
		if(buckets[key] == null)
			return false;
		
		Node previous = null;
		Node current = buckets[key];

		while(current != null) { 
			if(current.key==key) {               
				if(previous==null) {  
					buckets[key]=buckets[key].next;
					return true;
				}
				else {
					previous.next=current.next;
					return true;
				}
			}
			previous=current;
			current = current.next;
		}
		return false;
	}

	public void display() {
		for(int i=0;i<capacity;i++) {
			if(buckets[i]!=null) {
				Node entry=buckets[i];
				while(entry!=null) {
					System.out.print("{"+entry.key+"="+entry.value+"} ");
					entry=entry.next;
				}
			}
		}             
	}
}

public class MyHashMapCustom {

	public int getHash(String key) {
		int result = 0;
		for(char ch:key.toCharArray()) 
			result = (int) ch * 6;
		return (result*199)%255;	
	}
	
	public void testGeneratedValue() {
		MyHashMapEx hashMapCustom=new MyHashMapEx();
		hashMapCustom.put(getHash("Nyan Lin Htet"), "This is Nyan Lin Htet.");
		hashMapCustom.put(getHash("Shine Wanna"), "This is Shine Wanna.");
		hashMapCustom.put(getHash("Thuya Oo"), "This is Thuya Oo.");
		hashMapCustom.put(getHash("Soe Min Thein"), "This is Soe Min Thein.");
		hashMapCustom.put(getHash("Kaung Pyane Sone Tun"), "This is Kaung Pyane Sone Tun.");
		
		System.out.print("All Data : ");
		hashMapCustom.display();

		System.out.println("get 'Shine Wanna' Value: " + hashMapCustom.get(getHash("Shine Wanna")));

		System.out.println("\nvalue corresponding to key 'Shine Wanna' removed: "+ hashMapCustom.remove(getHash("Shine Wanna")));

		System.out.print("After Removing : ");
		hashMapCustom.display();
	}

	public static void main(String[] args) {
		new MyHashMapCustom().testGeneratedValue();
	}
}