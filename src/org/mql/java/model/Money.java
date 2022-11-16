package org.mql.java.model;

public class Money {
	private int amount;
	private String currency;
	public Money(int amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}
	@Override
	public boolean equals(Object another) {
		if(this == another)
			return true;
		else {
			if(another instanceof Money) {
				Money obj = (Money) another; // Down-Casting
				return (amount==obj.amount
						&& currency.equals(obj.currency)
				);
			}
		}
		return false;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
}