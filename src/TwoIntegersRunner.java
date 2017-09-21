import java.util.Scanner;

public class TwoIntegersRunner 
{
	private static Scanner input;

	public static void main(String[] args)
	{
		input = new Scanner(System.in);
		int num1;
		int num2;
		int sum;
		int difference;
		int product;
		int quotient;
		
		System.out.print("Enter first integer \n");
		num1 = input.nextInt();
		System.out.print("Enter second integer \n");
		num2 = input.nextInt();
		
		sum = num1 + num2;
		difference = num1 - num2;
		product = num1 * num2;
		quotient = num1 / num2;

		System.out.printf("Sum is %d\nDifference is %d\nProduct is %d\nQuotient is %d\n", sum, difference, product, quotient);
		
		
	}
}
