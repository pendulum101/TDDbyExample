package main.java;

public class Sum implements Expression {
    private Expression augend;
    private Expression addend;

    public Sum(Expression augend, Expression addend) {
        this.augend = augend;
        this.addend = addend;
    }

    public Money reduce(Bank bank, String to) {
        int amount = augend.reduce(bank, to).amount + addend.reduce(bank, to).amount;
        return new Money(amount, to);
    }

    @Override
    public Expression plus(Expression addend) {
        return new Sum(this, addend);
    }

    public Expression times(int multiplier) {
        return new Sum(augend.times(multiplier), addend.times(multiplier));
    }


///////////////////GETTERS & SETTERS////////////////////////////////

    public Expression getAugend() {
        return augend;
    }

    public void setAugend(Money augend) {
        this.augend = augend;
    }

    public Expression getAddend() {
        return addend;
    }

    public void setAddend(Money addend) {
        this.addend = addend;
    }
}
