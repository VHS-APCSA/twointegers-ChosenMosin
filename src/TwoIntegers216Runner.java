import java.util.Scanner;

public class TwoIntegers216Runner 
{
	public static void main(String[] args)
	{
		Scanner compare = new Scanner(System.in);
		int num1;
		int num2;
		
		System.out.println("Hey man, I need an integer for some reason.");
		num1 = compare.nextInt();
		
		System.out.println("Ok cool, but I need another one.");
		num2 = compare.nextInt();
		
		if (num1 == num2)
				System.out.printf("%d is the same number as %d\n", num1, num2);	
		if (num1 > num2)
			System.out.printf("%d is greater than %d\n", num1, num2);
		if (num1 < num2)
			System.out.printf("%d is less than %d\n", num1, num2);
	}
}