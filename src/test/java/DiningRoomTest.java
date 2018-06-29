import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

    DiningRoom diningRoom1;
    Guest guest1;
    Guest guest2;
    Guest guest3;
    ArrayList<Guest> guests1;

    @Before
    public void before() {
        guest1 = new Guest("Edward");
        guest2 = new Guest("Cat");
        guest3 = new Guest("Erin");
        guests1 = new ArrayList<>();
        guests1.add(guest1);
        guests1.add(guest2);
        guests1.add(guest3);
        diningRoom1 = new DiningRoom(30, guests1,"The Ivy");
    }

    @Test
    public void getName() {
        assertEquals("The Ivy", diningRoom1.getName());
    }

    @Test
    public void getNumberOfGuests() {
        assertEquals(3, diningRoom1.getGuests().size());
    }

}
