package com.bizleap.intern.assignment;

import java.sql.Array;

//import com.bizleap.intern.assignment.MyHashMap.Node;

public class MyHashMap2 {
	private Array[] bucket;
	private int capacity=256;
	MyLinkedList newLinkedList;
	public MyHashMap2(){
		bucket=new Array[capacity];
	}
	public int getHash(String key){
		char[] charArray=key.toCharArray();
		int charsum=0;
		for(char singlechar:charArray)
			charsum+=(int)singlechar;
		return (charsum*20)%255;
	}
	public void put(String key,String value){
		if(key==null)
			return;
		int hash=getHash(key);
		if(bucket[hash]==null){
			newLinkedList=new MyLinkedList();
			newLinkedList.add(key,value);
			bucket[hash]=(Array)newLinkedList;
		}
		else{
			newLinkedList.add(key, value);
		}
		
	}
	/*public boolean remove(int deleteKey,String value){

		if(bucket[deleteKey] == null)
			return false;

		Node previous = null;
		Node current = (Node) bucket[deleteKey];
		while(current != null){ 
			if(current.key==deleteKey){               
				if(previous==null){  
					bucket[deleteKey]=bucket[deleteKey].next;//overwrite like shift
					//newLinkedList.add(deleteKey;
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
*/	public void display(){

		for(int i=0;i<capacity;i++){
			if(bucket[i]!=null){
				Node entry=(Node) bucket[i];
				while(entry!=null){
					System.out.print("{"+entry.key+"="+entry.value+"} ");
					entry=entry.next;
				}
			}
		}
	}
public void testGeneratedValue() {
	MyHashMap2 hashMapCustom=new MyHashMap2();
	hashMapCustom.put("Hsu","Saw");
	hashMapCustom.put("kayzin","Khin");
	hashMapCustom.put("Htet", "khin");
	hashMapCustom.put("San", "Shine");
	hashMapCustom.put("MgMg", "AungAung");

	//System.out.println("key 'Htet' Value: "+ hashMapCustom.get(getHash("Htet")));
	System.out.print("All Data : ");
	hashMapCustom.display();
//	System.out.println("\nvalue corresponding to key 'Htet' removed: "+ hashMapCustom.remove(getHash("Htet")));
//.out.print("After Removing : ");
	//hashMapCustom.display();
}
	public static void main(String[] args) {
		new MyHashMap2().testGeneratedValue();

	}

}
