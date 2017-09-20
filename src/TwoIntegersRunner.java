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
		
		System.out.print("Enter first integer \n");
		num1 = input.nextInt();
		System.out.print("Enter second integer \n");
		num2 = input.nextInt();
		
		sum = num1 + num2;
		
		System.out.printf("Sum is %d\n", sum);
	}
}
