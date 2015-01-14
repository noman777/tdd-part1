package com.sibi;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CurrencyExchangeTest {

	@Test
	public void testMultiplication() {
		Dollar five = new Dollar(5);
		five.times(2);
		assertEquals(10, five.amount);
	}

	class Dollar {
		Dollar(int amt) {
			this.amount = amt;
		}

		void times(int multiplier) {
		     this.amount = multiplier * amount;
		}

		int amount;

	}
}
