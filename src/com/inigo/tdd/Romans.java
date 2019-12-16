package com.inigo.tdd;

public class Romans {

	public static String toRoman(int arabic) {
		char[] numerosChars = ((Integer)arabic).toString().toCharArray();
		
		if (numerosChars.length <= 1) {
			return pasarUnidad(arabic);
		}
		
		if (numerosChars.length == 2) {
			return "X" + pasarUnidad(Character.getNumericValue(numerosChars[1]));
		}
				
		return "";
	}

	private static String pasarUnidad(int arabic) {
		String res = "";
		if (arabic <= 3 ) {
			res = sumarI(arabic, "", 0);
		}else if (arabic >= 5 && arabic <= 8) {
			res = sumarI(arabic, "V", 5);
		}else if (arabic == 4) {
			res = "IV";
		}else if (arabic == 9) {
			res = "IX";
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
