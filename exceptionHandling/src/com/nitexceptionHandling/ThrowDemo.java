package com.nitexceptionHandling;

public class ThrowDemo {

	static void checkAge(int age) {
		if(age<18) {
			throw new ArithmeticException("Not Eligible");
		}
		else {
			System.out.println("Eligible");
		}
	}
	public static void main(String[] args) {
	 checkAge(15);
	 

	}

}
