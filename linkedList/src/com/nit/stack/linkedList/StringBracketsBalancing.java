package com.nit.stack.linkedList;

import java.util.Stack;

public class StringBracketsBalancing {

	public static void main(String[] args) {
	String s = "{[()()]}";
	Stack<Character> stack = new Stack<Character>();
	for(int i=0;i<=s.length()-1;i++) {
		char ch = s.charAt(i);
		if(ch=='{'||ch=='['||ch=='(') {
			stack.push(ch);
		}
		else {
			if(!stack.isEmpty()) {
				Character popedElement = stack.peek();
				if(ch=='}'&&popedElement=='{'|| ch==']'&&popedElement=='['|| ch==')'&&popedElement=='(') {
					stack.pop();
				}
				else {
					System.out.println("Unbalanced String of brackets");
					return;
				}
			}
		}
	}
		
         if(stack.isEmpty()) {
        	 System.out.println("Balanced String of bracket ");
         }
         else {
        	 System.out.println("Unbalanced String of Bracket");
         }
	}

}
