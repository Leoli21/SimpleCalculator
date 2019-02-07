
public class SimpleCalculator {
	//fields always come first
	
	private int count = 0;
	
	public int add(int num1, int num2)
	{
		count++;
		return num1 + num2;
	}
	public int subtract(int num1, int num2) 
	{
		count++;
		return num1 - num2;
	}
	public int multiply(int num1, int num2)
	{
		count++;
		return num1 * num2;
	}
	public int getNumRolls()
	{
		return count;
	}
	public void reset()
	{
		count = 0;
	}

}
