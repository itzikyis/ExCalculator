 package calc;

import static org.junit.Assert.*;
import org.junit.Test;

public class calcTest {
	
	@Test
	public void emptyStringReturn0() 
	{
		Calculator Calculator = new Calculator();
		assertEquals(Calculator.Calculator(""), 0);
	}

}
