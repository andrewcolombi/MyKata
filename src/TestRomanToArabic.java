import org.junit.Test;


public class TestRomanToArabic {

	RomanNumerals number = new RomanNumerals();

	@Test
	public void TestRoman_I_toArabic() {
		equals(1 == number.RomanToArabic("I"));
	}

}
