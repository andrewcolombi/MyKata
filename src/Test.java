import static org.junit.Assert.*;

public class Test {
	RomanNumerals number = new RomanNumerals();
	
	@org.junit.Test
	public void WhenPassedANumberItReturnsTheRomanNumeral() {		
		assertEquals("I", number.ArabicToRoman(1));
	}

	@org.junit.Test
	public void WhenPassed2ItReturnsTheRomanNumeral() {		
		assertEquals("II", number.ArabicToRoman(2));
	}
	
	@org.junit.Test
	public void WhenPassed3ItReturnsTheRomanNumeral() {		
		assertEquals("III", number.ArabicToRoman(3));
	}
	
	@org.junit.Test
	public void WhenPassed4ItReturnsTheRomanNumeral() {		
		assertEquals("IV", number.ArabicToRoman(4));
	}
		
	@org.junit.Test
	public void WhenPassed_10_ItReturnsTheRomanNumeral() {		
		assertEquals("X", number.ArabicToRoman(10));
	}
	
	@org.junit.Test
	public void WhenPassed_50_ItReturnsTheRomanNumeral() {		
		assertEquals("L", number.ArabicToRoman(50));
	}
	
	@org.junit.Test
	public void WhenPassed_100_ItReturnsTheRomanNumeral() {		
		assertEquals("C", number.ArabicToRoman(100));
	}
	
	@org.junit.Test
	public void WhenPassed_500_ItReturnsTheRomanNumeral() {		
		assertEquals("D", number.ArabicToRoman(500));
	}
	
	@org.junit.Test
	public void WhenPassed_1000_ItReturnsTheRomanNumeral() {		
		assertEquals("M", number.ArabicToRoman(1000));
	}
	
	@org.junit.Test
	public void WhenPassed_6to9_ItReturnsTheRomanNumeral() {		
		assertEquals("VI", number.ArabicToRoman(6));
		assertEquals("VII", number.ArabicToRoman(7));
		assertEquals("VIII", number.ArabicToRoman(8));
		assertEquals("IX", number.ArabicToRoman(9));
	}
	
	@org.junit.Test
	public void TestCaseForInputLessThan1() {
		assertEquals("Invalid Input!", number.ArabicToRoman(-1));
	}
}
