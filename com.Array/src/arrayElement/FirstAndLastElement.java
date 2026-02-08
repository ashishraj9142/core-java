package arrayElement;

import java.util.Scanner;

public class FirstAndLastElement {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Array Size");
	int n =sc.nextInt();
	int arr[] = new int[n];
	System.out.println("Enter The Stored Element :"); 
	for (int i =0;i<n;i++) {
		arr[i]=sc.nextInt();
		sc.close();
	}
	System.out.println("Enter the Last and First ");
	int firstValue = arr[0];
	int lastValue = arr[n-1];
	System.out.println("Sum of : First "+firstValue+ "and last value "+lastValue+"  "+(firstValue+lastValue)
		);
}
}
