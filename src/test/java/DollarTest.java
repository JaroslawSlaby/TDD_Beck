import money.Money;
import org.junit.Test;

import static org.junit.Assert.*;

public class DollarTest {

    @Test
    public void multiplyTest() {
        Money five = Money.dollar(5);
        assertEquals(Money.dollar(10), five.times(2));
        assertEquals(Money.dollar(15), five.times(3));
    }

    @Test
    public void equalityTest() {
        assertTrue(Money.dollar(5).equals(Money.dollar((5))));
        assertFalse(Money.dollar(5).equals(Money.dollar(6)));
    }
}