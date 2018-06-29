import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom1;
    Bedroom bedroom2;
    Guest guest1;
    Guest guest2;
    Guest guest3;
    Guest guest4;
    ArrayList<Guest> guests1;

    @Before
    public void before() {
        guest1 = new Guest("Edward");
        guest2 = new Guest("Cat");
        guest3 = new Guest("Erin");
        guest4 = new Guest("Colby");
        guests1 = new ArrayList<>();
        guests1.add(guest1);
        guests1.add(guest2);
        guests1.add(guest3);
        bedroom1 = new Bedroom(30, guests1,101, 30, "family");
        bedroom2 = new Bedroom(3, guests1,234, 40, "double");
    }

    @Test
    public void getNumber() {
        assertEquals(101, bedroom1.getNumber());
    }

    @Test
    public void getNumberOfGuests() {
        assertEquals(3, bedroom1.getGuests().size());
        assertEquals(3, bedroom1.getNumberOfGuests());
    }

    @Test
    public void getCapacity() {
        assertEquals(30, bedroom1.getCapacity());
    }

    @Test
    public void getRemainingSpace() {
        assertEquals(27, bedroom1.getRemainingSpace());
    }

    @Test
    public void canAddGuest() {
        bedroom1.addGuest(guest4);
        assertEquals(4, bedroom1.getNumberOfGuests());
    }

    @Test
    public void cannotAddGuest() {
        bedroom2.addGuest(guest4);
        assertEquals(3, bedroom2.getNumberOfGuests());
    }

    @Test
    public void getRate() {
        assertEquals(30, bedroom1.getRate());
    }

    @Test
    public void getType() {
        assertEquals("family", bedroom1.getType());
    }

}
