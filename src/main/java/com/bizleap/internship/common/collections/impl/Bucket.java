package com.bizleap.internship.common.collections.impl;

import java.util.ArrayList;
import java.util.List;

public class Bucket {
    private Node head;
    int size=0;
	public void add(String key,String value) {
		Node node = new Node(key,value);

		if(head==null){
			head=node;
		}
		else{
			Node n= head;
			while(n.getNext() != null){
				n=n.getNext();
			}
			n.setNext(node);
		}
		size++;
	}
	
	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String get(String key){
		if(head.getKey().equals(key))
			return head.getValue();
		
		head=head.getNext();
		while(head!= null && !(head.getKey().equals(key)))
			head= head.getNext();
		if(head == null)
			return null;
		
		return get(head.getKey());
	}
	
	public List<EntryImpl> getEntryList(){
		List<EntryImpl> entryList = new ArrayList<EntryImpl>();
		for(int i=0;i<getSize(); i++){
			//entryList.add(head.getEntry());
			entryList.add(new EntryImpl(head));
			head= head.getNext();
		}
		return entryList;
	}

	public boolean remove(String key) {
        if (head.getKey().equals(key)) {
    		head = head.getNext();	
            size--;
            return true;
        }
        Node currNode =head.getNext(), prev = null; 
  
        while (currNode != null && currNode.getKey() != key) { 
            prev = currNode; 
            currNode = currNode.getNext(); 
        } 
        if (currNode != null) { 
            prev.setNext(currNode.getNext());
            size--;
         return true;
        } 
 
        if (currNode == null) { 
         return false;
        } 
        return true;
    }
	
	@Override
	public String toString() {
		return "Bucket [" + head + ", size=" + size + "]";
	}
}