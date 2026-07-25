package com.nit.linkedList;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedListPalidrone {

	public static void main(String[] args) {
		LinkedList<String> l= new LinkedList<String>(Arrays.asList("R","O","T","O","R"));
		LinkedList<String> temp = new LinkedList<String>(l);
		Collections.reverse(temp);
		if(l.equals(temp)) {
			System.out.println("Palidrone");
		}
		else {
			System.out.println("Not Palidrome");
		}

	}

}
