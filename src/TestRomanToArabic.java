import static org.junit.Assert.*;
import org.junit.Test;


public class TestRomanToArabic {

	RomanNumerals number = new RomanNumerals();

	@Test
	public void TestRomanEmptyStringtoArabic() {
		assertTrue(null == number.RomanToArabic(""));
	}
	
	@Test
	public void TestRoman_I_toArabic() {
		assertTrue(1 == number.RomanToArabic("I"));
	}
	
	@Test
	public void TestRoman_II_III_toArabic() {
		assertTrue(2 == number.RomanToArabic("II"));		
		assertTrue(3 == number.RomanToArabic("III"));
	}
	
	@Test
	public void TestRoman_SingleLetters_toArabic() {
		assertTrue(1 == number.RomanToArabic("I"));
		assertTrue(5 == number.RomanToArabic("V"));
		assertTrue(10 == number.RomanToArabic("X"));
		assertTrue(50 == number.RomanToArabic("L"));
		assertTrue(100 == number.RomanToArabic("C"));
		assertTrue(500 == number.RomanToArabic("D"));
		assertTrue(1000 == number.RomanToArabic("M"));
	}
	
	@Test
	public void TestRoman_WithSubtraction_toArabic() {
		assertTrue(4 == number.RomanToArabic("IV"));
		assertTrue(9 == number.RomanToArabic("IX"));
		assertTrue(40 == number.RomanToArabic("XL"));
		assertTrue(90 == number.RomanToArabic("XC"));
		assertTrue(400 == number.RomanToArabic("CD"));
		assertTrue(900 == number.RomanToArabic("CM"));		
	}
}
