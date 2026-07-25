package com.nit.linkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class RemovingAnElement {

	public static void main(String[] args) {
		LinkedList<Integer> l= new LinkedList<Integer>(Arrays.asList(2,3,2,3,5,2,6,2,4));
		Integer target = 2;
		for(int i=0;i<=l.size()-1;i++) {
			if(l.get(i).equals(target)) {
				l.remove();
			}
		}
      System.out.println(l);
	}

}
