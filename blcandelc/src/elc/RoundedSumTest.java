package elc;

import java.util.Scanner;

import blc.RoundedSum;

public class RoundedSumTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
	System.out.println("Enter the value x y z");
	int num1 = sc.nextInt();
	int num2 = sc.nextInt();
	int num3 = sc.nextInt();
	int add = RoundedSum.sumOfRoundedValues(num1, num2, num3);
	System.out.println(add);
	sc.close();
	}

}
