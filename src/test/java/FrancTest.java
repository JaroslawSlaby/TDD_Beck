import money.Money;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FrancTest {

    @Test
    public void multiplyTest() {
        Money five = Money.franc(5);
        assertEquals(Money.franc(10), five.times(2));
        assertEquals(Money.franc(15), five.times(3));
    }
}
