package com.inigo.tdd;

public class Romans {

	public static String toRoman(int arabic) {
		String res = "";
		if (arabic <= 3 ) {
			res = oneToThree(arabic);
		}else if (arabic == 4) {
			res = "IV";
		}else if (arabic >= 5 && arabic <= 8) {
			res = fiveToEight(arabic);
		}else if (arabic == 9) {
			res = "IX";
		}else if (arabic == 10) {
			res = "X";
		}
		return res;
	}

	private static String oneToThree(int arabic) {
		String res = "";
		for (int i = 0; i < arabic; i++) {
			res += "I";
		}
		return res;
	}
	
	private static String fiveToEight(int arabic) {
		String res = "V";
		for (int i = 5; i < arabic; i++) {
			res += "I";
		}
		return res;
	}
}
