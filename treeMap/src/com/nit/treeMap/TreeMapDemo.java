package com.nit.treeMap;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		tm.put(3, "Three");
		tm.put(1,"One" );
		tm.put(4,"Four");
		tm.put(2,"Two");
		System.out.println(tm);
		

	}

}
