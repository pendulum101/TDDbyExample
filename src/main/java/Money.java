package main.java;

public class Money implements Expression{
    protected int amount;
    protected String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public String getCurrency() {
        return currency;
    }

    public boolean equals(Object obj) {
        Money money = (Money) obj;
        return (amount == money.getAmount()) && getCurrency().equals(money.getCurrency());
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public static Money dollar(int amount) {
        return new Money(amount, "USD");
    }

    public static Money franc(int amount) {
        return new Money(amount, "CHF");
    }

    public Money times(int multiplier) {
        return new Money(amount * multiplier, currency);
    }

    public String toString() {
        return amount + " " + currency;
    }

    public Expression plus(Money addend){
        return new Sum(this, addend);
    }

    public Money reduce(Bank bank, String to ) {
        int rate = bank.rate(currency, to);
        return new  Money(amount / rate, to);
    }


}