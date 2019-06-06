/*Implement a hashing utility class, MyHashMap utilizing the hashing method implemented in assignment 8.

The class should have these methods:

1) put ( key, value) --- store the value in the bucket
2) get ( key ) - retrieve the value from the bucket and returns it
3) remove (key) - remove the value form the bucket return true if it is successful
Implement a hashing utility class, MyHashMap utilizing the hasing method implemented in assignment 8.*/

package com.bizleap.intership.assignments;

public class HashMapCustomApp<K, V> {
     
    private entry<K,V>[] table;   //Array of Entry.
    private int capacity= 256;  //Initial capacity of HashMap
     
    static class entry<K, V> {
         K key;
         V value;
         entry<K,V> next;
     
         public entry(K key, V value, entry<K,V> next) {
             this.key = key;
             this.value = value;
             this.next = next;
         }
    }
     
    @SuppressWarnings("unchecked")
    public HashMapCustomApp() {
       table = new entry[capacity];
    }
 
    public void put(K newKey, V data) {
       if(newKey==null)
           return;    //does not allow to store null.
      
       int hash=hash(newKey);
       entry<K,V> newEntry = new entry<K,V>(newKey, data, null);//create new entry.
      
       //if table location does not contain any entry, store entry there.
        if(table[hash] == null)
        	table[hash] = newEntry;
        else {
        	entry<K,V> previous = null;
        	entry<K,V> current = table[hash];
           
        	while(current != null) { //we have reached last entry of bucket.
        		if(current.key.equals(newKey)) {           
        			if(previous==null) {  //node has to be insert on first of bucket.
        				newEntry.next=current.next;
        				table[hash]=newEntry;
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
 
    public V get(K key) {
        int hash = hash(key);
        if(table[hash] == null) 
        	return null;
        else {
        	entry<K,V> temp = table[hash];
        	while(temp!= null) {
        		if(temp.key.equals(key))
        			return temp.value;
        		temp = temp.next; //return value corresponding to key.
        	}         
        	return null;   //returns null if key is not found.
        }
    }
 
    public boolean remove(K deleteKey) {
       
       int hash=hash(deleteKey);
              
      if(table[hash] == null) {
            return false;
      }else {
        entry<K,V> previous = null;
        entry<K,V> current = table[hash];
        
        while(current != null) { //we have reached last entry node of bucket.
           if(current.key.equals(deleteKey)) {               
               if(previous==null) {  //delete first entry node.
                     table[hash]=table[hash].next;
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
    
    }

    public void display() {
    	
       for(int i=0;i<capacity;i++) {
           if(table[i]!=null) {
                  entry<K, V> entry=table[i];
                  while(entry!=null) {
                        System.out.print("{"+entry.key+"="+entry.value+"}" +" ");
                        entry=entry.next;
                  }
           }
       }             
    }

    private int hash(K key) {
        return Math.abs(key.hashCode()) % capacity;
    }
    
    public int getHashValue(String inputString) {
    	int result=0;
		for(int i=0;i<inputString.length();i++)
			result+=(int)inputString.charAt(i);
	
		return (result*199)%255;
    }
    
    public static void main(String[] args) {
    	
           HashMapCustomApp<Integer, String> hashMapCustom = new HashMapCustomApp<>();
           hashMapCustom.put(hashMapCustom.getHashValue("NyanLinHtet"), "This is Nyan Lin Htet");
           hashMapCustom.put(hashMapCustom.getHashValue("ShineWana"), "This is Shine Wana");
           hashMapCustom.put(hashMapCustom.getHashValue("NyanLinHtet"), "This is Thuya Oo");
           hashMapCustom.put(hashMapCustom.getHashValue("SoeMinThein"), "This is Soe Min Thein");
 
           System.out.println("Nyan Lin Htet value is "
                        + hashMapCustom.get(hashMapCustom.getHashValue("NyanLinHtet")));
 
           System.out.print("Display all data : ");
           hashMapCustom.display();
 
           System.out.println("\nRemove Thuya Oo is "+ hashMapCustom.remove(hashMapCustom.getHashValue("ThuyaOo")));
 
           System.out.print("Displaying : ");
           hashMapCustom.display();
    }
}
