package com.inigo.tdd;

public class Romans {

	public static String toRoman(int arabic) {
		String res = "";
		if (arabic == 1) {
			res = "I";
		}else if (arabic == 2) {
			res = "II";
		}
		return res;
	}

}
