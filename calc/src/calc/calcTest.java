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

}
