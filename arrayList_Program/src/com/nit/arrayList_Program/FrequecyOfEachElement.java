package com.nit.arrayList_Program;

import java.util.ArrayList;
import java.util.List;

public class FrequecyOfEachElement {

	public static void main(String[] args) {
		ArrayList<String> list1= new ArrayList<>(List.of("apple","banana","orange","banana","apple"));
		ArrayList<String> temp= new ArrayList<String>();
	    
		for(int i = 0;i<=list1.size()-1;i++) {
	         if(!temp.contains(list1.get(i))) {
	    	    int count=0;
	           	for(int j = 0;j<=list1.size()-1;j++) {
			  if(list1.get(i).equals(list1.get(j))) {
	    		count++;
	    	} 
			
			}
	            System.out.println("Frequency of"+list1.get(i)+"is :"+count);
	    }
	   
		}
	}

}
