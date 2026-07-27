package com.nit.linkedList;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class ReverseLinkedList {

	public static void main(String[] args) {
	LinkedList<String> l = new LinkedList<String>(Arrays.asList("east","west","north","south"));
	//Collections.reverse(l);
	int left = 0;
	int right = l.size()-1;
	while(left<right) {
		String temp = l.get(right);
		l.set(right,l.get(left));
		l.set(left, temp);
		left++;
		right--;
	}
	System.out.println(l);

	}

}
