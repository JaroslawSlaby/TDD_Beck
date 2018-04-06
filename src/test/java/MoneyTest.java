import money.Money;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MoneyTest {

    @Test
    public void currencyTest() {
        assertEquals("USD", Money.dollar(1).currency());
        assertEquals("CHF", Money.franc(1).currency());
    }
}
