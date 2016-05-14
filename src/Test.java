import static org.junit.Assert.*;

public class Test {
	RomanNumerals number = new RomanNumerals();
	
	@org.junit.Test
	public void WhenPassedANumberItReturnsTheRomanNumeral() {		
		assertEquals("I", number.ArabicToRoman(1));
	}

	@org.junit.Test
	public void TestCaseForInputLessThan1() {
		assertEquals("Invalid Input!", number.ArabicToRoman(-1));
	}
}
