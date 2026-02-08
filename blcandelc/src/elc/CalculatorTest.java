package elc;

import java.util.Scanner;

import blc.Calculator;

public class CalculatorTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no :");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		//Two types of function calling
		int Addition = Calculator.doadd(num1, num2);
		System.out.println("Addition of two digit "+Addition);
		System.out.println("Subtraction of two digit "+Calculator.sub(num1, num2));
         sc.close();
	}

}
