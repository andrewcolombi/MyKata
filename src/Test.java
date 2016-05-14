import static org.junit.Assert.*;


public class Test {

	@org.junit.Test
	public void WhenPassedANumberItReturnsTheRomanNumeral() {
		RomanNumerals number = new RomanNumerals();
		assertEquals("I", number.ArabicToRoman(1));
	}

}
