package com.nitexceptionHandling;

import java.util.Scanner;

public class MultiplCatch {
   public static void main(String[]arg) {
	   Scanner sc = new Scanner(System.in);
	   int arr[]= {10,20};
	   try {
		   
		   System.out.println("Enter array index");
		   int index = sc.nextInt();
		   System.out.println("Value ="+arr[index]);
		   
		   
		   System.out.println("Enter divisor ");
		   int num = sc.nextInt();
		   int b = arr[index]/num;
		   System.out.println("Result "+b);
	   }
	   catch(ArrayIndexOutOfBoundsException e) {
		   System.out.println("Array Exception");
	   }
	   catch(ArithmeticException e) {
		   System.out.println("Arithmetic Exception");
	   }
	   catch(Exception e) {
		   System.out.println("Parent Exception");
	   }
	   sc.close();
   }
}
