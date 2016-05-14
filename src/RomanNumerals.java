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
			if (number < 5) {
				if (number == 1) {
					return "I";
				}
				else if (number == 2) {
					return "II";
				}
				else if (number == 3) {
					return "III";
				}
				else if (number == 4) {
					return "IV";
				}
			}
			else if (number == 5) {
				return "V";
			}
			else if (number == 10) {
				return "X";
			}
			else if (number == 50) {
				return "L";
			}
			else if (number == 100) {
				return "C";
			}
			else if (number == 500) {
				return "D";
			}
			else if (number == 1000) {
				return "M";
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
