package blc;

public class TwoDigitsSum {
	public static void getSumOfDigits(int x) {
		int y = x%10;
		x = x/10;
		System.out.println("Sum is :"+(x+y));
	}

}
