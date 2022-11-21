package org;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestForPalindrome {

	@Test
	public void testforPalindrome() {
		String str1="lol";
		
		assertEquals(str1,Calculation.checkPalindrome(str1));
	}

}
