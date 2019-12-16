package com.inigo.tdd;

public class Romans {

	public static String toRoman(int arabic) {
		char[] numerosChars = ((Integer)arabic).toString().toCharArray();
		
		if (numerosChars.length <= 1) {
			return pasarUnidad(arabic);
		}
		
		if (numerosChars.length == 2) {
			return pasarDecena(Character.getNumericValue(numerosChars[0])) + 
				   pasarUnidad(Character.getNumericValue(numerosChars[1]));
		}
				
		return "";
	}

	private static String pasarUnidad(int arabic) {
		String res = "";
		if (arabic <= 3 ) {
			res = sumar1(arabic, "", 0, "I");
		}else if (arabic >= 5 && arabic <= 8) {
			res = sumar1(arabic, "V", 5, "I");
		}else if (arabic == 4) {
			res = "IV";
		}else if (arabic == 9) {
			res = "IX";
		}
		return res;
	}
	
	private static String pasarDecena(int arabic) {
		String res = "";
		if (arabic <= 3 ) {
			res = sumar1(arabic, "", 0, "X");
		}else if (arabic >= 5 && arabic <= 8) {
			res = sumar1(arabic, "L", 5, "X");
		}else if (arabic == 4) {
			res = "XL";
		}else if (arabic == 9) {
			res = "XC";
		}
		return res;
	}

	private static String sumar1(int arabic, String initValue, int initNumber, String uno) {
		String res = initValue;
		for (int i = initNumber; i < arabic; i++) {
			res += uno;
		}
		return res;
	}
}
