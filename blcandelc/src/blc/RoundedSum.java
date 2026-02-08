package blc;

public class RoundedSum {
public static int sumOfRoundedValues(int x, int y,int z) {
	int sum = 0;
	int a=(x%10>=5)?((x/10)+1)*10:(x/10)*10;
	int b=(y%10>=5)?((y/10)+1)*10:(y/10)*10;
	int c=(z%10>=5)?((z/10)+1)*10:(z/10)*10;
	sum =(a+b+c);
	return sum;
      }
}
