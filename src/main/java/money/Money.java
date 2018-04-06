package money;

import java.util.Objects;

public abstract class Money {

    int amount;
    String currency;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Money money = (Money) o;
        return amount == money.amount;
    }

    @Override
    public int hashCode() {

        return Objects.hash(amount);
    }

    public static Dollar dollar(int amount) {
        return new Dollar(amount);
    }

    public static Franc franc(int amount) {
        return new Franc(amount, "CHF");
    }

    public abstract Money times(int multiplier);

    public String currency() {
        return currency;
    }

}
