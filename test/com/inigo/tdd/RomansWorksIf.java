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
		int arabic = 1;
		String roman = Romans.toRoman(arabic);
		assertEquals("II", roman);
	}
}
