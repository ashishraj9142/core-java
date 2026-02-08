package arrayElement;

import java.util.Scanner;

public class ArrayReverseElement {
public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter Array Size :");
   int n = sc.nextInt();
	
   int arr[] = new int[n];


      for (int i = n - 1; i >= 0; i--) {
       arr[i]=sc.nextInt();
       System.out.print(arr[i]+ " ");	 
        }
   
      sc.close();
    }
}