package com.nit.arrayList_Program;

import java.util.ArrayList;
import java.util.List;

public class RemoveAllEvenNumber {

	public static void main(String[] args) {
	     ArrayList<Integer> list= new ArrayList<>(List.of(1,2,3));
      for(int i = 0;i<=list.size()-1;i++) {
    	  if(list.get(i)%2==0) {
    		  list.remove(i);
    	  }
      }
      System.out.println(list);

	}

}
