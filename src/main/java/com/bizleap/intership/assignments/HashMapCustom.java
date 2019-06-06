/*
Implement a hashing utility class, MyHashMap utilizing the hashing method implemented in assignment 8.

The class should have these methods:
1) put ( key, value) --- store the value in the bucket
2) get ( key ) - retrieve the value from the bucket and returns it
3) remove (key) - remove the value form the bucket return true if it is successful

References:
    how is hashmap internally implemented in java using linkedlist or array
    Custom HashMap in Java
 */

package com.bizleap.intership.assignments;


class MyHashMap {

	private Node[] buckets;   //Array of Entry.
	private int capacity= 256;  //Initial capacity of HashMap

	static class Node {
		int key;
		String value;
		Node next;

		public Node(int key, String value, Node next){
			this.key = key;
			this.value = value;
			this.next = next;
		}
	}

	public MyHashMap(){
		buckets = new Node[capacity];
	}

	public void put(int key, String data){

		Node newEntry = new Node(key, data, null);

		//if table location does not contain any entry, store entry there.
		if(buckets[key] == null){
			buckets[key] = newEntry;
		}
		else{
			Node previous = null;
			Node current = buckets[key];

			while(current != null){ //we have reached last entry of bucket.
				if(current.key == key){//if put key is found overwrite to the entry.      
					if(previous == null){  //node has to be insert on first of bucket.
						newEntry.next=current.next;
						buckets[key]=newEntry;
						return;
					}
					else{
						newEntry.next = current.next;
						previous.next = newEntry;
						return;
					}
				}
				previous = current;
				current = current.next;
			}
			previous.next = newEntry;
		}
	}

	public String get(int key){
		if(buckets[key] == null)
			return null;
		
	    Node temp = buckets[key];
		while(temp!= null){
			if(temp.key==key) //return the value if input key is equal with Each Entry of key
				return temp.value;
			temp = temp.next; // inserting next entry.
	    }         
		return null; 
	}

	public boolean remove(int deleteKey){

		if(buckets[deleteKey] == null)//return false if not found
			return false;
			
		Node previous = null;
		Node current = buckets[deleteKey];

		while(current != null){ 
			if(current.key==deleteKey){               
				if(previous==null){  
					buckets[deleteKey]=buckets[deleteKey].next;//overwrite like shift
					return true;
				}
				else{
					previous.next=current.next;//overwrite like shift
					return true;
				}
			}
			previous=current;
			current = current.next;
		}
		return false;
	}

	public void display(){

		for(int i=0;i<capacity;i++){
			if(buckets[i]!=null){
				Node entry=buckets[i];
				while(entry!=null){
					System.out.print("{"+entry.key+"="+entry.value+"} ");
					entry=entry.next;
				}
			}
		}             
	}
}

public class HashMapCustom {

	public int getHash(String key) {
			
			int charSum = 0;
			for(char ch:key.toCharArray() ) {
				charSum += ch;
			}		
			return (charSum * 25)%255; 
		}
	
	public void testGeneratedValue() {
		MyHashMap hashMapCustom = new MyHashMap();
		hashMapCustom.put(getHash("Shine"), "Puck");
		hashMapCustom.put(getHash("Wanna"), "Phoenix");
		hashMapCustom.put(getHash("HuHu"), "Tusker");
		hashMapCustom.put(getHash("Mushi"), "Shaker");
		hashMapCustom.put(getHash("WaHaHa"), "Tiny");

		System.out.println("get 'Shine' Value: "
				+ hashMapCustom.get(getHash("Shine")));

		System.out.print("All Data : ");
		hashMapCustom.display();

		System.out.println("\nvalue corresponding to key 'Shine' removed: "
				+ hashMapCustom.remove(getHash("Shine")));

		System.out.print("After Removing : ");
		hashMapCustom.display();
	}

	public static void main(String[] args) {
		new HashMapCustom().testGeneratedValue();
	}
}