import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

    DiningRoom diningRoom1;
    DiningRoom diningRoom2;
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
        diningRoom1 = new DiningRoom(30, guests1,"The Ivy");
        diningRoom2 = new DiningRoom(3, guests1,"The Lettuce");
    }

    @Test
    public void getName() {
        assertEquals("The Ivy", diningRoom1.getName());
    }

    @Test
    public void getNumberOfGuests() {
        assertEquals(3, diningRoom1.getGuests().size());
        assertEquals(3, diningRoom1.getNumberOfGuests());
    }

    @Test
    public void getCapacity() {
        assertEquals(30, diningRoom1.getCapacity());
    }

    @Test
    public void getRemainingSpace() {
        assertEquals(27, diningRoom1.getRemainingSpace());
    }

    @Test
    public void canAddGuest() {
        diningRoom1.addGuest(guest4);
        assertEquals(4, diningRoom1.getNumberOfGuests());
    }

    @Test
    public void cannotAddGuest() {
        diningRoom2.addGuest(guest4);
        assertEquals(3, diningRoom2.getNumberOfGuests());
    }

}
