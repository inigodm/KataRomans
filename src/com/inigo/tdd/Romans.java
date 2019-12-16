package com.inigo.tdd;

public class Romans {

	public static String toRoman(int arabic) {
		String res = "";
		if (arabic == 1) {
			res = "I";
		}else if (arabic == 2) {
			res = "II";
		}else if (arabic == 3) {
			res = "III";
		}else if (arabic == 4) {
			res = "IV";
		}else if (arabic == 5) {
			res = "V";
		}else if (arabic == 6) {
			res = "VI";
		}else if (arabic == 7) {
			res = "VII";
		}else if (arabic == 8) {
			res = "VIII";
		}else if (arabic == 9) {
			res = "IX";
		}else if (arabic == 10) {
			res = "X";
		}
		return res;
	}

}
