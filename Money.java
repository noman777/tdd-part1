package com.sibi;

abstract class Money {
	abstract Money times(int multiplier);

	abstract String currency();

	protected int amount;
	protected String currency;
	
	Money(int amount, String currency) {
		this.amount = amount;
		this.currency = currency;
		}
	
	static Money dollar(int amount) {
		return new Dollar(amount,"USD");
	}

	static Money franc(int amount) {
		return new Franc(amount, "CHF");
	}

	public boolean equals(Object object) {
		Money money = (Money) object;
		return amount == money.amount && getClass().equals(money.getClass());
	}

}

class Dollar extends Money {
	

	
	Dollar(int amount, String currency) {
		super(amount, currency);
	}

	Money times(int multiplier) {
		return Money.dollar(amount * multiplier);
	}

	@Override
	String currency() {
		return currency;
	}

}

class Franc extends Money {
	

	Franc(int amount, String currency) {
		super(amount, currency);
	}

	Money times(int multiplier) {
		return Money.franc(amount * multiplier);
	}

	@Override
	String currency() {
		return currency;
	}
}
