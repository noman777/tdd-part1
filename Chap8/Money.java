package com.sibi;



abstract class Money {
	abstract Money times(int multiplier);
	protected int amount;

	static Money dollar(int amount) {
		return new Dollar(amount);
	}

	static Money franc(int amount) {
		return new Franc(amount);
	}
	
	public boolean equals(Object object) {
		Money money = (Money) object;
		return amount == money.amount && getClass().equals(money.getClass());
	}
	
}

class Dollar extends Money {
	Dollar(int amt) {
		this.amount = amt;
	}
	
	Money times(int multiplier) {
		return new Dollar(amount * multiplier);
	}

}

class Franc extends Money {
	Franc(int amt) {
		this.amount = amt;
	}
	Money times(int multiplier) {
		return new Franc(amount * multiplier);
	}
}
