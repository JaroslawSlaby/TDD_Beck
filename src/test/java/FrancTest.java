import money.Franc;
import money.Money;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FrancTest {

    @Test
    public void multiplyTest() {
        Money five = Money.franc(5);
        assertEquals(new Franc(10), five.times(2));
        assertEquals(new Franc(15), five.times(3));
    }
}
