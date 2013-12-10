 package calc;

import static org.junit.Assert.*;
import org.junit.Test;

public class calcTest 
{
	private Calculator Calculator = new Calculator();
	
	@Test
	public void emptyStringReturn0() 
	{
		assertEquals(Calculator.Calculator(""), 0);
	}
	
	@Test
	public void singleValueIsReplay()
	{
		assertEquals(Calculator.Calculator("1"), 1);
	}
	
	@Test
	public void twoNumbersCommaDelimitedReturnSum()
	{
		assertEquals(Calculator.Calculator("1,2"), 3);
	}
	
	@Test
	public void twoNumbersNewLineDelimitedReturnSum()
	{
		assertEquals(Calculator.Calculator("1\n2"), 3);
	}
	
	@Test
	public void threeNumbersDilimetedBothWayReturnSum()
	{
		assertEquals(Calculator.Calculator("1,2,3"), 6);
	}
	
	@Test(expected = Exception.class)
	public void negativeInputReturnException()
	{
		Calculator.Calculator("-1");
	}

}
