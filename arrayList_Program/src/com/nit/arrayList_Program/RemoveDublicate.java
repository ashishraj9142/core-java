package com.nit.arrayList_Program;

import java.util.ArrayList;

import java.util.List;

public class RemoveDublicate {

	public static void main(String[] args) {
		ArrayList<Integer> list= new ArrayList<>(
				List.of(1,10,2,2,10,3,3,3,4,5,5));
       ArrayList<Integer> list2=new ArrayList<>();
       for(Integer i : list) {
    	   if(!(list2.contains(i))) {
    		   list2.add(i);
    	   }
       }
       System.out.println(list2);
	}

}
