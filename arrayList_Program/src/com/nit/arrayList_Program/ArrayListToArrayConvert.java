package com.nit.arrayList_Program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListToArrayConvert {

	public static void main(String[] args) {
		ArrayList<String> list1= new ArrayList<>(List.of("Alice","Bob","Charlie"));
        Object [] a =list1.toArray(); 
	     System.out.println(Arrays.toString(a));
	}
}
