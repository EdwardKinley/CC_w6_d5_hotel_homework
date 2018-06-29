import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    Hotel hotel1;
    Bedroom bedroom1;
    Guest guest1;
    ArrayList<Guest> guests1;
    Booking booking1;
    ArrayList<Bedroom> bedrooms;
    ArrayList<ConferenceRoom> conferenceRooms;
    ArrayList<DiningRoom> diningRooms;
    ArrayList<Room> rooms;

    @Before
    public void before() {
        guest1 = new Guest("Frodo");
        guests1 = new ArrayList<Guest>();
        guests1.add(guest1);
        bedroom1 = new Bedroom(
                BedroomType.DOUBLE.getSleeps(),
                guests1,
                999,
                90,
                BedroomType.DOUBLE.getType());
        bedrooms = new ArrayList<>();
        bedrooms.add(bedroom1);
        hotel1 = new Hotel(
                "Rivendell",
                bedrooms,
                conferenceRooms,
                diningRooms,
                rooms);
        booking1 = new Booking(
                hotel1,
                bedroom1,
                guest1,
                2);
    }

    @Test
    public void canGetHotel() {
        assertEquals(hotel1, booking1.getHotel());
    }

    @Test
    public void canGetHotelName() {
        assertEquals("Rivendell", booking1.getHotel().getName());
    }

    @Test
    public void canGetBedroom() {
        assertEquals(bedroom1, booking1.getBedroom());
    }

    @Test
    public void canGetBedroomNumber() {
        assertEquals(999, booking1.getBedroom().getNumber());
    }

    @Test
    public void canGetGuest() {
        assertEquals(guest1, booking1.getGuest());
    }

    @Test
    public void canGetGuestName() {
        assertEquals("Frodo", booking1.getGuest().getName());
    }

    @Test
    public void canGetNights() {
        assertEquals(2, booking1.getNights());
    }





}
