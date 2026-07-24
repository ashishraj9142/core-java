package com.nit.linkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class RemoveDuplicate {

	public static void main(String[] args) {
		LinkedList<Integer> l= new LinkedList<Integer>(Arrays.asList(2,3,4,2,3,4,5,6,7));
		LinkedList<Integer> result = new LinkedList<Integer>();
		
		for(int i=0;i<=l.size()-1;i++) {
			if(!result.contains(l.get(i))) {
				result.add(l.get(i));
			}
			
		}
         System.out.println(result);
	}

}
