import static org.junit.Assert.*;
import org.junit.Test;

public class TestArabicToRoman {
	RomanNumerals number = new RomanNumerals();
	
	@Test
	public void WhenPassedANumberItReturnsTheRomanNumeral() {		
		assertEquals("I", number.ArabicToRoman(1));
	}

	@Test
	public void WhenPassed2ItReturnsTheRomanNumeral() {		
		assertEquals("II", number.ArabicToRoman(2));
	}
	
	@Test
	public void WhenPassed3ItReturnsTheRomanNumeral() {		
		assertEquals("III", number.ArabicToRoman(3));
	}
	
	@Test
	public void WhenPassed4ItReturnsTheRomanNumeral() {		
		assertEquals("IV", number.ArabicToRoman(4));
	}
		
	@Test
	public void WhenPassed_10_ItReturnsTheRomanNumeral() {		
		assertEquals("X", number.ArabicToRoman(10));
	}
	
	@Test
	public void WhenPassed_50_ItReturnsTheRomanNumeral() {		
		assertEquals("L", number.ArabicToRoman(50));
	}
	
	@Test
	public void WhenPassed_100_ItReturnsTheRomanNumeral() {		
		assertEquals("C", number.ArabicToRoman(100));
	}
	
	@Test
	public void WhenPassed_500_ItReturnsTheRomanNumeral() {		
		assertEquals("D", number.ArabicToRoman(500));
	}
	
	@Test
	public void WhenPassed_1000_ItReturnsTheRomanNumeral() {		
		assertEquals("M", number.ArabicToRoman(1000));
	}
	
	@Test
	public void WhenPassed_6to9_ItReturnsTheRomanNumeral() {		
		assertEquals("VI", number.ArabicToRoman(6));
		assertEquals("VII", number.ArabicToRoman(7));
		assertEquals("VIII", number.ArabicToRoman(8));
		assertEquals("IX", number.ArabicToRoman(9));
	}
	
	@Test
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
	
	@Test
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
	
	@Test
	public void WhenPassed_101to499_ItReturnsTheRomanNumeral() {		
		assertEquals("CI", number.ArabicToRoman(101));
		assertEquals("CLV", number.ArabicToRoman(155));
		assertEquals("CCLXIX", number.ArabicToRoman(269));
		assertEquals("CCCLXXIX", number.ArabicToRoman(379));		
		assertEquals("CDLXXXIII", number.ArabicToRoman(483));
		assertEquals("CD", number.ArabicToRoman(400));
		assertEquals("CDXCIX", number.ArabicToRoman(499));
	}
	
	@Test
	public void WhenPassed_501to999_ItReturnsTheRomanNumeral() {		
		assertEquals("DI", number.ArabicToRoman(501));
		assertEquals("DCLV", number.ArabicToRoman(655));
		assertEquals("DCCLXVIII", number.ArabicToRoman(768));
		assertEquals("DCCCLXXIX", number.ArabicToRoman(879));		
		assertEquals("CMLXXXIII", number.ArabicToRoman(983));
		assertEquals("CM", number.ArabicToRoman(900));
		assertEquals("CMXCIX", number.ArabicToRoman(999));
	}
	
	@Test
	public void WhenPassed_over1000_ItReturnsTheRomanNumeral() {		
		assertEquals("MI", number.ArabicToRoman(1001));
		assertEquals("MDCLV", number.ArabicToRoman(1655));
		assertEquals("MMDCCLXVIII", number.ArabicToRoman(2768));
		assertEquals("MMMDCCCLXXIX", number.ArabicToRoman(3879));		
		assertEquals("MMMMCMLXXXIII", number.ArabicToRoman(4983));
		assertEquals("MMMMMCM", number.ArabicToRoman(5900));
		assertEquals("MMMMMMCMXCIX", number.ArabicToRoman(6999));
	}
	
	@Test
	public void TestCaseForInputLessThan1() {
		assertEquals("Invalid Input! Numbers must be greater than 0.", number.ArabicToRoman(-1));
	}
}
