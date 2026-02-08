package elc;

import java.util.Scanner;

import blc.TwoDigitsSum;

public class SumOfTwoDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no :");
		int z = sc.nextInt();
		TwoDigitsSum.getSumOfDigits(z);
		sc.close();

	}

}
