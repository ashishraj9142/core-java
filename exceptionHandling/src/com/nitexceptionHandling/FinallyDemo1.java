package com.nitexceptionHandling;

import java.util.Scanner;

public class FinallyDemo1 {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter your Number : ");
	 int a = sc.nextInt();
	 System.out.println("Enter your Divisor : ");
	 int b = sc.nextInt();
	 try { int c = a/b;
	 System.out.println("Result = "+c);
	 }
	 catch(ArithmeticException e){
		 System.out.println("Input Invalid :");
	 }
	 finally {
		 System.out.println("Finally Block Always Executes");
	 }
	 sc.close();
	}
}
