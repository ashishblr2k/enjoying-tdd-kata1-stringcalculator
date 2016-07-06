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
	public void adding_two_value_seperated_by_comma_should_add(){
		int result = stringCalculator.addStringNumbers("2,3");
		assertTrue("addition failed", result == 5);
	}
	
	@Test
	public void adding_string_with_any_numbers_seperated_by_comma_should_add(){
		int result = stringCalculator.addStringNumbers("2,3,4");
		assertTrue("addition failed", result == 9);
	}
	
	@Test
	public void adding_string_with_any_numbers_seperated_by_comma_or_newline_delimiter_should_add(){
		int result = stringCalculator.addStringNumbers("1,3\n6");
		assertTrue("addition failed", result == 10);
	}

}
