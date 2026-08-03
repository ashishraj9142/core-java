package com.nit.treeMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SortingArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(12,34,15,10,31));
		Collections.sort(list,new Mycomparator());
		System.out.println(list);
		 

	}

}
class Mycomparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		
//		return o1-o2;
		return o2-o1;
	}
	
}