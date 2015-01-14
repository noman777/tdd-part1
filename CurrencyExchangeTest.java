package com.sibi;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CurrencyExchangeTest {

	@Test
	public void testEquality() {
		
		assertTrue(new Dollar(5).equals(new Dollar(5)));
		assertFalse(new Dollar(5).equals(new Dollar(6)));
		assertTrue(new Franc(5).equals(new Franc(5)));
		assertFalse(new Franc(5).equals(new Franc(6)));
		assertFalse(new Franc(5).equals(new Dollar(5)));
	}	
	
	
	class Money {
		protected int amount;
		public boolean equals(Object object) {
			Money money = (Money) object;
			return amount == money.amount
			&& getClass().equals(money.getClass());
		}
	}
	
	class Dollar extends Money {
		Dollar(int amt) {
			this.amount = amt;
		}
		
		Dollar times(int multiplier) {
			return new Dollar(amount * multiplier);
		}
	
	}
	
	class Franc extends Money {
		Franc(int amt) {
			this.amount = amt;
		}
		Franc times(int multiplier) {
			return new Franc(amount * multiplier);
		}	
	}
	
}
