import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    Guest guest1;
    Guest guest2;
    Guest guest3;

    @Before
    public void before() {
        guest1 = new Guest("Edward");
        guest2 = new Guest("Cat");
        guest3 = new Guest("Erin");
    }

    @Test
    public void getName() {
        assertEquals("Edward", guest1.getName());
    }



}
