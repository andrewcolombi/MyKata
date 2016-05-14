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
	public void WhenPassed_11to49_ItReturnsTheRomanNumeral() {		
		assertEquals("XI", number.ArabicToRoman(11));
		assertEquals("XV", number.ArabicToRoman(15));
		assertEquals("XIX", number.ArabicToRoman(19));
		assertEquals("XXIX", number.ArabicToRoman(29));		
		assertEquals("XXXIII", number.ArabicToRoman(33));
		assertEquals("XL", number.ArabicToRoman(40));
		assertEquals("XLIV", number.ArabicToRoman(44));
		assertEquals("XLIX", number.ArabicToRoman(49));
	}
	
	@org.junit.Test
	public void WhenPassed_51to99_ItReturnsTheRomanNumeral() {		
		assertEquals("LI", number.ArabicToRoman(51));
		assertEquals("LV", number.ArabicToRoman(55));
		assertEquals("LXIX", number.ArabicToRoman(69));
		assertEquals("LXXIX", number.ArabicToRoman(79));		
		assertEquals("LXXXIII", number.ArabicToRoman(83));
		assertEquals("XC", number.ArabicToRoman(90));
		assertEquals("XCIV", number.ArabicToRoman(94));
		assertEquals("XCIX", number.ArabicToRoman(99));
	}
	
	@org.junit.Test
	public void WhenPassed_101to499_ItReturnsTheRomanNumeral() {		
		assertEquals("CI", number.ArabicToRoman(101));
		assertEquals("CLV", number.ArabicToRoman(155));
		assertEquals("CCLXIX", number.ArabicToRoman(269));
		assertEquals("CCCLXXIX", number.ArabicToRoman(379));		
		assertEquals("CDLXXXIII", number.ArabicToRoman(483));
		assertEquals("CD", number.ArabicToRoman(400));
		assertEquals("CDXCIX", number.ArabicToRoman(499));
	}
	
	@org.junit.Test
	public void WhenPassed_501to999_ItReturnsTheRomanNumeral() {		
		assertEquals("DI", number.ArabicToRoman(501));
		assertEquals("DCLV", number.ArabicToRoman(655));
		assertEquals("DCCLXVIII", number.ArabicToRoman(768));
		assertEquals("DCCCLXXIX", number.ArabicToRoman(879));		
		assertEquals("CMLXXXIII", number.ArabicToRoman(983));
		assertEquals("CM", number.ArabicToRoman(900));
		assertEquals("CMXCIX", number.ArabicToRoman(999));
	}
	
	@org.junit.Test
	public void TestCaseForInputLessThan1() {
		assertEquals("Invalid Input!", number.ArabicToRoman(-1));
	}
}
