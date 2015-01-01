package com.sibi;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CurrencyExchangeTest {

	@Test
	public void testEquality() {
		assertTrue(new Dollar(5).equals(new Dollar(5)));
		//assertFalse(new Dollar(5).equals(new Dollar(6)));
	}
	
	@Test
	public void testMultiplication() {
		Dollar five = new Dollar(5);
		Dollar product = five.times(2);
		assertEquals(10, product.amount);
		product = five.times(3);
		assertEquals(15, product.amount);
	}
	
	

	class Dollar {
		Dollar(int amt) {
			this.amount = amt;
		}

		Dollar times(int multiplier) {
			return new Dollar(amount * multiplier);
		}
	
		
		public boolean equals(Object object) {
			Dollar dollar= (Dollar) object;
			return amount == dollar.amount;
		}

		private int amount;

	}
}
