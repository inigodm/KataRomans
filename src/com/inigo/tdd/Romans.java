package com.inigo.tdd;

public class Romans {

	public static String toRoman(int arabic) {
		char[] numerosChars = String.format("%02d", ((Integer)arabic)).toCharArray();
		
		return pasarCifra(Character.getNumericValue(numerosChars[0]),
				"X",
				"L",
				"C") + 
			   pasarCifra(Character.getNumericValue(numerosChars[1]),
			    "I",
			    "V",
			    "X");
	}

	private static String pasarCifra(
			int arabic,
			String uno,
			String cinco,
			String diez) {
		String res = "";
		if (arabic <= 3 ) {
			res = sumar1(arabic, "", 0, uno);
		}else if (arabic >= 5 && arabic <= 8) {
			res = sumar1(arabic, cinco, 5, uno);
		}else if (arabic == 4) {
			res = uno + cinco;
		}else if (arabic == 9) {
			res = uno + diez;
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
