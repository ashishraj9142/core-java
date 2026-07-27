package com.nit.stack.linkedList;

import java.util.Stack;

public class OperatorandOperends {

	public static void main(String[] args) {
	String s ="2 3 1 * + 9 -";
	String[] a= s.split(" ");
	Stack<Integer> operands = new Stack<Integer>();
	Stack<Character> operators = new Stack<Character>();
	for(int i=0;i<=a.length-1;i++) {
		try {
			Integer operand= Integer.parseInt(a[i]);
		    operands.push(operand);
		}
		catch(Exception e) {
			operators.push(a[i].charAt(0));
		}
	   }
      
       while(!operators.isEmpty()) {
    	   Integer x = operands.pop();
    	   Integer y = operands.pop();
    	   char op = operators.pop();
    	   switch(op) {
    	   case '+' -> operands.push(x+y);
    	   case '-' -> operands.push(x-y);
    	   case '*' -> operands.push(x*y);
    	   case '/' -> operands.push(x/y);
    	   case '%' -> operands.push(x%y);
    	   }
       }
       System.out.println("Result :" +operands.pop());
	}

}
