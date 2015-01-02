package com.sibi;

class Money {

	protected int amount;
	protected String currency;

	Money(int amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}

	static Money dollar(int amount) {
		return new Dollar(amount, "USD");
	}

	public String toString() {
		return amount + " " + currency;
	}

	static Money franc(int amount) {
		return new Franc(amount, "CHF");
	}

	Money times(int multiplier) {
		return new Money(amount * multiplier, currency);
	}

	public boolean equals(Object object) {
		Money money = (Money) object;
		return amount == money.amount && currency().equals(money.currency());
	}

	protected String currency() {
		return currency;
	}

}

class Dollar extends Money {

	Dollar(int amount, String currency) {
		super(amount, currency);
	}

}

class Franc extends Money {

	Franc(int amount, String currency) {
		super(amount, currency);
	}

}
