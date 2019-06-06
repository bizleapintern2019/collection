package com.bizleap.intern.assignment;


public class MyLinkedList {
	 Node head;
	 int size=0;
	public void add(String key,String value) {
		Node node = new Node();
		node.key=key;
		node.value=value;
		if(head==null){
			head=node;
		}
		else{
			Node n= head;
			while(n.next != null){
				n=n.next;
			}
			n.next=node;
		}
		size++;
	}
	
	public String get(String key){
		if(head.getKey().equals(key))
			return head.getValue();
			head=head.next;
				while(head!= null && !(head.getKey().equals(key)))
					head= head.next;
						if(head == null)
							return null;
		return get(head.getValue());
	}
	
	public boolean remove(String key) {
       if (head.key.equals(key)) {
           head = head.next;
           return true;
       }
       Node currNode =head.next, prev = null; 
 
       while (currNode != null && currNode.key != key) { 
           prev = currNode; 
           currNode = currNode.next; 
       } 
       if (currNode != null) { 
           prev.next = currNode.next;
        return true;
       } 

       if (currNode == null) { 
        return false;
       } 
       return true;
   }
}
