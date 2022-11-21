package org;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestForMax {

	@Test
	public void testformaxnum() {
		int[] arr= {101,120,130,140,150,160,170,180,190,1100};
		assertEquals(1100,Calculation.checkMaxNum(arr));
	}

}
