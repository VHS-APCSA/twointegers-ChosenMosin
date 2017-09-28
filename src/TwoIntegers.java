
public class TwoIntegers 
{
	private int num1;
	private int num2;
	
	public TwoIntegers()
	{
		num1 = 0;
		num2 = 0;
	}
	public String arithmetic()
	{
		String math = " ";
		math = "\n added " + (num1 + num2);
		math = math + "\n subtracted " + (num1 - num2);
		math = math + "\n multiplied " + (num1 * num2);
		math = math + "\n divided " + (num1 / num2);
		return math;
	}
	public String compare()
	{
		if(num1 > num2)
		{
			return num1 + " is larger than " + num2;
		}
		else if(num1 < num2)
		{
			return num1 + " is smaller than " + num2;
		}
		else
		{
			return num1 + " and " + num2 + " are equal.";
		}
	}
	public TwoIntegers(int num1, int num2)
	{
		this.num1 = num1;
		this.num2 = num2;
	}
	public int getNum1() 
	{
		return num1;
	}
	public void setNum1(int num1) 
	{
		this.num1 = num1;
	}
	public int getNum2() 
	{
		return num2;
	}
	public void setNum2(int num2) 
	{
		this.num2 = num2;
	}
}
