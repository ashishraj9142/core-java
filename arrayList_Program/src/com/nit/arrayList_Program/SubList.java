package com.nit.arrayList_Program;

import java.util.ArrayList;
import java.util.List;

public class SubList {

	public static void main(String[] args) {
		ArrayList<String> list= new ArrayList<>(List.of("a","b","c","d","e","f"));
     int min =2;
     int max = 5;
     System.out.println(list.subList(min, max+1));
	}

}
