package com.sibi;

class Money implements Expression{

	protected int amount;
	protected String currency;

	Money(int amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}

	static Money dollar(int amount) {
		return new Money(amount, "USD");
	}
	
	static Money franc(int amount){
		return new Money(amount, "CHF");
	}

	Money times(int multiplier) {
		return new Money(amount * multiplier, currency);
	}

	public boolean equals(Object object) {
		Money money = (Money) object;
		return amount == money.amount && currency().equals(money.currency());
	}
	
	Expression plus(Money addend) {
		return new Sum(this, addend);
	}
	
	public Money reduce(String to) {
		return this;
	}

	protected String currency() {
		return currency;
	}
	
	public String toString() {
		return amount + " " + currency;
	}

}

class Bank{
	
	Money reduce(Expression source, String to) {
		return source.reduce(to);
	}
}

class Sum implements Expression {
	Money augend;
	Money addend;
	
	Sum(Money augend, Money addend) {
		this.augend= augend;
		this.addend= addend;
	}
	
	public Money reduce(String to) {
		int amount= augend.amount + addend.amount;
		return new Money(amount, to);
	}
}

interface Expression{
	Money reduce(String to);
}


