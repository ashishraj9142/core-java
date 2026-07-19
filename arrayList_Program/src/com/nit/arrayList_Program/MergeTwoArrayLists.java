package com.nit.arrayList_Program;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoArrayLists {

	public static void main(String[] args) {
     ArrayList<Integer> list1= new ArrayList<>(List.of(1,2,3));
     ArrayList<Integer> list2= new ArrayList<>(List.of(1,2,3));
     list1.addAll(list2);
     System.out.println(list1);
	}

}
