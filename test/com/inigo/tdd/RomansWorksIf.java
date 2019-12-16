package com.inigo.tdd;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class RomansWorksIf {
	@Test
	public void given_zero_then_returns_void() {
		int arabic = 0;
		String roman = Romans.toRoman(arabic);
		assertEquals("", roman);
	}
}
