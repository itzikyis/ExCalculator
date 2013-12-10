package calc;

public class Calculator 
{
	public int Calculator(String input) 
	{
		if(isEmpty(input))
		{	
			return 0;
		}
		return stringToInt(input);
	}
	
	private boolean isEmpty(String input)
	{
		return input.isEmpty();
	}
	
	private int stringToInt(String input)
	{
		return Integer.parseInt(input);
	}
	
	
	
	
	
}
