package calc;

public class Calculator 
{
	private final String dilimetar = ",|\n";
	
	public int Calculator(String input) throws Exception 
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
	
	private int getSum(String[] numbers) throws Exception
	{
		findWorngInput(numbers);
		
		return calculateValue(numbers);
	}
	
	private int calculateValue(String[] numbers)
	{
		int sum = 0;
		for (String current: numbers) 
		{
			if(stringToInt(current) > 1000)
			{
				continue;
			}
			sum += stringToInt(current);
		}
		return sum;
	}
	
	private void findWorngInput(String[] numbers) throws Exception
	{
		for (String current: numbers) 
		{
			if(stringToInt(current) < 0)
			{
				throw new Exception("negetive Exception");
			}
		}
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
