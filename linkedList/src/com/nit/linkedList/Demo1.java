package com.nit.linkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class Demo1 {

	public static void main(String[] args) {
		LinkedList<Integer> l1= new LinkedList<Integer>(Arrays.asList(1,3,5,7));
		LinkedList<Integer> l2= new LinkedList<Integer>(Arrays.asList(2,4,6));
		LinkedList<Integer> result= new LinkedList<Integer>();
		int x=0;
		int y =0;
		
		while(x<l1.size()&&y<l2.size()) {
			if(l1.get(x)<l2.get(y)) {
				result.add(l1.get(y));
				x++;
			}
			else {
				result.add(l2.get(y));
				y++;
			}
		}
 
		 while(x<l1.size()) {
			result.add(l1.get(x));
		 x++;
		 }
		 while(y<l2.size()) {
			 result.add(l2.get(y));
			 y++;
		 }
		 System.out.println(result);
	}

}
