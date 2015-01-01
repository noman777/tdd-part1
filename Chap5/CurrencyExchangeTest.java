package com.sibi;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CurrencyExchangeTest {

	@Test
	public void testEquality() {
		Dollar five= new Dollar(5);
		assertEquals(new Dollar(10), five.times(2));
		assertEquals(new Dollar(15), five.times(3));
	}
	
	@Test
	public void testMultiplication() {
		Dollar five= new Dollar(5);
		Dollar product= five.times(2);
		assertEquals(new Dollar(10), product);
		product= five.times(3);
		assertEquals(new Dollar(15), product);
	}
	
	class Dollar {
		
		private int amount;
		
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

	}
	
	class Franc {
			
			private int amount;
			
			Franc(int amt) {
				this.amount = amt;
			}
	
			Franc times(int multiplier) {
				return new Franc(amount * multiplier);
			}		
			
			public boolean equals(Object object) {			
				Franc dollar= (Franc) object;
				return amount == dollar.amount;
			}
	}
	
}
