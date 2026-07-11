package com.nitexceptionHandling;

public class NumberDemo {
   public static void main(String[]args) {
	   String num = "abc";
	   try {
		   int n = Integer.parseInt(num);
	   }
	   catch(NumberFormatException e){
		   System.out.println("Invalid Number");
	   }
   }
   
}
