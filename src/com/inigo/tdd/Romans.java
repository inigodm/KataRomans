package com.inigo.tdd;

public class Romans {

	public static String toRoman(int arabic) {
		String res = "";
		if (arabic <= 3 ) {
			res = calculateRoman(arabic, "", 0);
		}else if (arabic == 4) {
			res = "IV";
		}else if (arabic >= 5 && arabic <= 8) {
			res = calculateRoman(arabic, "V", 5);
		}else if (arabic == 9) {
			res = "IX";
		}else if (arabic == 10) {
			res = "X";
		}
		return res;
	}

	private static String calculateRoman(int arabic, String initValue, int initNumber) {
		String res = initValue;
		for (int i = initNumber; i < arabic; i++) {
			res += "I";
		}
		return res;
	}
}
