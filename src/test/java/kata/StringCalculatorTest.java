package kata;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class StringCalculatorTest {
	
	StringCalculator stringCalculator;
	
	@Before
	public void setup(){
		System.out.println("setup done!");
		stringCalculator = new StringCalculator();
	}

	@Test
	public void adding_empty_string_should_be_zero() {
		int result = stringCalculator.addStringNumbers("");
		assertTrue("result should be zero", result == 0);
	}
	
	@Test
	public void adding_single_value_should_be_same_result(){
		int result = stringCalculator.addStringNumbers("2");
		assertSame("result is not same", result, 2);
	}
	
	@Test
	public void adding_two_value_should_add(){
		int result = stringCalculator.addStringNumbers("2,3");
		assertTrue("addition failed", result == 5);
	}

}
