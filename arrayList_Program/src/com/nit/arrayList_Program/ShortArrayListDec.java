package com.nit.arrayList_Program;

import java.util.ArrayList;
import java.util.List;

public class ShortArrayListDec {

	public static void main(String[] args) {
		ArrayList<Integer> list= new ArrayList<>(
				List.of(1,10,2,2,10,3,3,3,4,5,5));
		for(int cycle = 0;cycle<=list.size()-2;cycle++) {
			for(int i = 0;i<=list.size()-2;i++) {
				if(list.get(i+1)>list.get(i)) {
					Integer temp = list.get(i);
					list.set(i, list.get(i+1));
					list.set(i+1, temp);
				}
			}
		}
		System.out.println(list);
	}

}
