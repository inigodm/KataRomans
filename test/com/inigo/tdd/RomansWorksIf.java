package com.inigo.tdd;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RomansWorksIf {
	@Test
	public void given_zero_then_returns_void() {
		int arabic = 0;
		String roman = Romans.toRoman(arabic);
		assertEquals("", roman);
	}
	
	@Test
	public void given_one_then_returns_I() {
		int arabic = 1;
		String roman = Romans.toRoman(arabic);
		assertEquals("I", roman);
	}
	
	@Test
	public void given_Two_then_returns_II() {
		int arabic = 2;
		String roman = Romans.toRoman(arabic);
		assertEquals("II", roman);
	}
	
	@Test
	public void given_Three_then_returns_III() {
		int arabic = 3;
		String roman = Romans.toRoman(arabic);
		assertEquals("III", roman);
	}
	
	@Test
	public void given_Five_then_returns_V() {
		int arabic = 5;
		String roman = Romans.toRoman(arabic);
		assertEquals("V", roman);
	}
	
	@Test
	public void given_Six_then_returns_VI() {
		int arabic = 6;
		String roman = Romans.toRoman(arabic);
		assertEquals("VI", roman);
	}
	
	@Test
	public void given_Seven_then_returns_VII() {
		int arabic = 7;
		String roman = Romans.toRoman(arabic);
		assertEquals("VII", roman);
	}
	
	@Test
	public void given_Eight_then_returns_VIII() {
		int arabic = 8;
		String roman = Romans.toRoman(arabic);
		assertEquals("VIII", roman);
	}
	
	@Test
	public void given_Nine_then_returns_IX() {
		int arabic = 9;
		String roman = Romans.toRoman(arabic);
		assertEquals("IX", roman);
	}
	
	@Test
	public void given_ten_then_returns_X() {
		int arabic = 10;
		String roman = Romans.toRoman(arabic);
		assertEquals("X", roman);
	}
}
