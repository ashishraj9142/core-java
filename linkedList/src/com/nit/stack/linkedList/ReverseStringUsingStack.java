package com.nit.stack.linkedList;

import java.util.Stack;

public class ReverseStringUsingStack {

	public static void main(String[] args) {
     StringBuilder s = new StringBuilder("Hello");
     Stack<Character> stack = new Stack<Character>();
	 for(int i = 0;i<=s.length()-1;i++) {
		 Character c = s.charAt(i);
		 stack.push(c);
	 }
	 StringBuilder reverse = new StringBuilder();
	 int size =stack.size()-1;
	 for(int i=0;i<=size;i++) {
		 reverse.append(stack.pop());
	 }
	 System.out.println("Reverse String is :"+reverse);
	}

}
