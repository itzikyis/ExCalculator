package calc;

public class Calculator 
{
	private final String dilimetar = ",|\n";
	
	public int Calculator(String input) 
	{
		String[] numbers = input.split(dilimetar);
		
		if(isEmpty(input))
		{	
			return 0;
		}
		if(input.length() == 1)
		{
			return stringToInt(input);
		}
		else
		{
			return getSum(numbers);
		}
	}
	
	private int getSum(String[] numbers)
	{
		int sum = 0;
		for (String current: numbers) 
		{
			sum += Integer.parseInt(current);
		}
		return sum;
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
