
public class TwoIntegers 
{
	private int num1;
	private int num2;
	
	public TwoIntegers()
	{
		num1 = 0;
		num2 = 0;
	}
	public String aritmetic()
	{
		String arithmetic = " ";
		arithmetic = "\n added" + (num1 + num2);
		arithmetic = arithmetic + "\n subtracted " + (num1 - num2);
		arithmetic = arithmetic + "\n multiplied " + (num1 * num2);
		arithmetic = arithmetic + "\n divided " + (num1 / num2);
		return arithmetic;
	}
	public String compare()
	{
		if(num1 > num2)
		{
			return num1 + " is bigger than " + num2;
		}
		else if(num1 < num2)
		{
			return num2 + " is bigger than " + num1;
		}
		else
		{
			return num1 + " and " + num2 + " are the same number";
		}
	}
	public boolean even()
	{
		if(num1 % 2 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean evenTwo()
	{
		if(num2 % 2 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean multiples()
	{
		if(num1 % num2 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
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
