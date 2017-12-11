package main.java;

public class Sum implements Expression {
    Money augend;
    Money addend;

    public Sum(Money augend, Money addend) {
        this.augend = augend;
        this.addend = addend;
    }

    public Money getAugend() {
        return augend;
    }

    public void setAugend(Money augend) {
        this.augend = augend;
    }

    public Money getAddend() {
        return addend;
    }

    public void setAddend(Money addend) {
        this.addend = addend;
    }

    public Money reduce(Bank bank, String to) {
        int amount  = augend.amount + addend.amount;
        return new Money(amount, to);
    }
}
