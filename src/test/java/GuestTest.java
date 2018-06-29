import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    Guest guest1;

    @Before
    public void before() {
        guest1 = new Guest("Edward");
    }

    @Test
    public void getName() {
        assertEquals("Edward", guest1.getName());
    }



}
