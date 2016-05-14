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

}
