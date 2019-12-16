package com.inigo.tdd;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RomansWorksIf {
	@Test
	public void given_zero_then_returns_void() {
		assertRomanNumber(0, "");
	}
	
	@Test
	public void given_one_then_returns_I() {
		assertRomanNumber(1, "I");
	}
	
	@Test
	public void given_Two_then_returns_II() {
		assertRomanNumber(2, "II");
	}
	
	@Test
	public void given_Three_then_returns_III() {
		assertRomanNumber(3, "III");
	}
	
	@Test
	public void given_Four_then_returns_V() {
		assertRomanNumber(4, "IV");
	}
	
	@Test
	public void given_Five_then_returns_V() {
		assertRomanNumber(5, "V");
	}
	
	@Test
	public void given_Six_then_returns_VI() {
		assertRomanNumber(6, "VI");
	}
	
	@Test
	public void given_Seven_then_returns_VII() {
		assertRomanNumber(7, "VII");
	}
	
	@Test
	public void given_Eight_then_returns_VIII() {
		assertRomanNumber(8, "VIII");
	}
	
	@Test
	public void given_Nine_then_returns_IX() {
		assertRomanNumber(9, "IX");
	}
	
	@Test
	public void given_Ten_then_returns_X() {
		assertRomanNumber(10, "X");
	}
	
	@Test
	public void given_Eleven_to_twenty_then_returns_romans() {
		assertRomanNumber(11, "XI");
		assertRomanNumber(12, "XII");
		assertRomanNumber(13, "XIII");
		assertRomanNumber(14, "XIV");
		assertRomanNumber(15, "XV");
		assertRomanNumber(16, "XVI");
		assertRomanNumber(17, "XVII");
		assertRomanNumber(18, "XVIII");
		assertRomanNumber(19, "XIX");
	}
	
	private void assertRomanNumber(int arabic, String roman) {
		assertEquals(roman, Romans.toRoman(arabic));
	}
}
