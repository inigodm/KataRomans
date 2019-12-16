package com.inigo.tdd;

public class Romans {

	public static String toRoman(int arabic) {
		String res = "";
		if (arabic <= 3 ) {
			res = sumarI(arabic, "", 0);
		}else if (arabic >= 5 && arabic <= 8) {
			res = sumarI(arabic, "V", 5);
		}else if (arabic == 4) {
			res = "IV";
		}else if (arabic == 9) {
			res = "IX";
		}else if (arabic == 10) {
			res = "X";
		}else if (arabic == 11) {
			res = "XI";
		}else if (arabic == 12) {
			res = "XII";
		}else if (arabic == 13) {
			res = "XIII";
		}else if (arabic == 14) {
			res = "XIV";
		}else if (arabic == 15) {
			res = "XV";
		}else if (arabic == 16) {
			res = "XVI";
		}else if (arabic == 17) {
			res = "XVII";
		}else if (arabic == 18) {
			res = "XVIII";
		}else if (arabic == 19) {
			res = "XIX";
		}else if (arabic == 20) {
			res = "XX";
		}
		return res;
	}

	private static String sumarI(int arabic, String initValue, int initNumber) {
		String res = initValue;
		for (int i = initNumber; i < arabic; i++) {
			res += "I";
		}
		return res;
	}
}
