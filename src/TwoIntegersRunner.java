import java.util.Scanner;

public class TwoIntegersRunner 
{
	private static Scanner input;

	public static void main(String[] args)
	{
		input = new Scanner(System.in);
		
		System.out.print("Enter first integer \n");
		int num1 = input.nextInt();
		System.out.print("Enter second integer \n");
		int num2 = input.nextInt();
		
		TwoIntegers calculate = new TwoIntegers(num1, num2);
		String genMath = calculate.arithmetic();
		System.out.println(genMath);
		String comparison = calculate.compare();
		System.out.println(comparison);
		boolean oddOrEven = calculate.even();
		System.out.println(oddOrEven);
		boolean secondOddOrEven = calculate.even2();
		System.out.println(secondOddOrEven);
		boolean factors = calculate.multiples();
		System.out.println(factors);
		boolean secondFactors = calculate.multiples2();
		System.out.println(secondFactors);
		
		System.out.println();
	}
}//added random text in order to commit