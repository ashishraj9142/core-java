package com.nit.arrayList_Program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> list= new ArrayList<>(
				List.of(1,10,2,2,10,3,3,3,4,5,5));
    
//		int left= 0;
//		int right= list.size()-1;
//		while(left<right) {
//			Integer temp = list.get(right);
//			list.set(right,list.get(left));
//			list.set(left,temp);
//			left++;
//			right--;
//		}
		Collections.reverse(list);
		System.out.println(list);
	}
}
