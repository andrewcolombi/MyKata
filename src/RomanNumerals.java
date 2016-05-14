/*
 * I = 1
 * V = 5
 * X = 10
 * L = 50
 * C = 100
 * D = 500
 * M = 1000
 */

public class RomanNumerals {
	public String ArabicToRoman (int number) {
		if (number >= 1) {
			if (number == 1) {
				return "I";
			}
			else if (number == 2) {
				return "II";
			}
			else if (number == 3) {
				return "III";
			}
			
			return "Error";
		}			
		else {
			return "Invalid Input!";
		}		
	}

	public Integer RomantoArabic (String number) {
		return null;
	}
}
