import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom1;
    ConferenceRoom conferenceRoom2;
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
        conferenceRoom1 = new ConferenceRoom(30, guests1,"Sir Walter Scott", 300);
        conferenceRoom2 = new ConferenceRoom(3, guests1,"Neil Armstrong", 200);
    }

    @Test
    public void getName() {
        assertEquals("Sir Walter Scott", conferenceRoom1.getName());
    }

    @Test
    public void getNumberOfGuests() {
        assertEquals(3, conferenceRoom1.getGuests().size());
        assertEquals(3, conferenceRoom1.getNumberOfGuests());
    }

    @Test
    public void getCapacity() {
        assertEquals(30, conferenceRoom1.getCapacity());
    }

    @Test
    public void getRemainingSpace() {
        assertEquals(27, conferenceRoom1.getRemainingSpace());
    }

    @Test
    public void canAddGuest() {
        conferenceRoom1.addGuest(guest4);
        assertEquals(4, conferenceRoom1.getNumberOfGuests());
    }

    @Test
    public void cannotAddGuest() {
        conferenceRoom2.addGuest(guest4);
        assertEquals(3, conferenceRoom2.getNumberOfGuests());
    }

    @Test
    public void getRate() {
        assertEquals(300, conferenceRoom1.getRate());
    }

}
