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
			else if (number <= 5) {
				if (number == 4) {
					return "IV";
				}
				else if (number == 5) {
					return "V";
				}
				else {
					return "I" + ArabicToRoman(number - 1);
				}
			}
			else if (number <= 10) {
				if (number == 9) {
					return "IX";
				}				
				else if (number == 10) {
					return "X";
				}
				else {
					return "V" + ArabicToRoman(number - 5);		
				}
			}
			else if (number <= 50) {
				if (number == 50) {
					return "L";
				}				
				else if (number == 40) {
					return "XL";
				}
				else if (number > 40 ) {
					return "XL" + ArabicToRoman(number - 40);
				}
				else {
					return "X" + ArabicToRoman(number - 10);		
				}
			}
			else if (number <= 100) {
				if (number == 100) {
					return "C";
				}				
				else if (number == 90) {
					return "XC";
				}
				else if (number > 90 ) {
					return "XC" + ArabicToRoman(number - 90);
				}
				else {
					return "L" + ArabicToRoman(number - 50);		
				}				
			}
			else if (number <= 500) {
				if (number == 500) {
					return "D";
				}				
				else if (number == 400) {
					return "CD";
				}
				else if (number > 400 ) {
					return "CD" + ArabicToRoman(number - 400);
				}
				else {
					return "C" + ArabicToRoman(number - 100);		
				}		
			}
			else if (number <= 1000) {
				if (number == 1000) {
					return "M";
				}				
				else if (number == 900) {
					return "CM";
				}
				else if (number > 900 ) {
					return "CM" + ArabicToRoman(number - 900);
				}
				else {
					return "D" + ArabicToRoman(number - 500);		
				}
			}			
			
			return "M" + ArabicToRoman(number - 1000);	
		}			
		else {
			return "Invalid Input! Numbers must be greater than 0.";
		}		
	}

	public Integer RomanToArabic (String number) {
		int length = number.length();
		if (length == 0) {
			return null;
		}
		else if (length == 1) {
			return SingleCharToArabic(number.charAt(0));
		}
		else {			 
			int sum = 0;
			int ThisDigit = SingleCharToArabic(number.charAt(0));
						
			for (int position = 1; position < length; position ++) {
				int NextDigit = SingleCharToArabic(number.charAt(position));
				if (ThisDigit < NextDigit) {
					sum += NextDigit - ThisDigit;
					position ++;
					if (position + 1 < length) {
						ThisDigit = SingleCharToArabic(number.charAt(position));
					}
				}
				else {
					sum += ThisDigit;
					if (position + 1 == length) {
						sum += NextDigit;
					}
					ThisDigit = NextDigit;
				}				
			}
			return sum ;
		}
	}
	
	private Integer SingleCharToArabic(char number) {
		if (number == ('I')) {
			return 1;
		}
		else if (number == ('V')) {
			return 5;
		}
		else if (number == ('X')) {
			return 10;
		}
		else if (number == ('L')) {
			return 50;
		}
		else if (number == ('C')) {
			return 100;
		}
		else if (number == ('D')) {
			return 500;
		}
		else if (number ==('M')) {
			return 1000;
		}
		else {
			return 0;
		}
	}
}
