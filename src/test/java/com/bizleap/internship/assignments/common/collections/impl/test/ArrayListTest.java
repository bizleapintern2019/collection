package com.bizleap.internship.assignments.common.collections.impl.test;
import org.junit.Test;
import com.bizleap.internship.assignments.common.collections.ArrayList;

public class ArrayListTest {
	
	@Test
	public void binaryTreeSearchTest() {
		ArrayList arrayList = new ArrayList();
        arrayList.add(new Integer(2));
        arrayList.add(new Integer(5));
        arrayList.add(new Integer(1));
        arrayList.add(new Integer(23));
        arrayList.add(new Integer(14));
        arrayList.add(new Integer(33));
        arrayList.add(new Integer(12));
        arrayList.add(new Integer(44));
        arrayList.add(new Integer(55));
        arrayList.add(new Integer(14));
        arrayList.add(new Integer(33));
        arrayList.add(new Integer(12));
        arrayList.add(new Integer(44));
        arrayList.add(new Integer(55));

        for(int i=0; i<arrayList.getSize(); i++) {
            System.out.print(arrayList.get(i)+" ");
        }
        arrayList.add(new Integer(29));
        System.out.println("\nElement at Index 4: " + arrayList.get(4));
        System.out.println("List size: " + arrayList.getSize());
        System.out.println("Removing element at index 3: " + arrayList.remove(3));
        for(int i=0; i<arrayList.getSize(); i++) {
            System.out.print(arrayList.get(i)+" ");
        }
	}
}
