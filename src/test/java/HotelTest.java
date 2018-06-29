import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    ArrayList<Bedroom> bedrooms;
    ArrayList<ConferenceRoom> conferenceRooms;
    ArrayList<DiningRoom> diningRooms;
    ArrayList<Room> rooms;

    @Before
    public void before() {
        bedrooms = new ArrayList<>();
        conferenceRooms = new ArrayList<>();
        diningRooms = new ArrayList<>();
        rooms = new ArrayList<>();
        hotel = new Hotel(
                "The Falcon's Nest",
                bedrooms,
                conferenceRooms,
                diningRooms,
                rooms);
    }

    @Test
    public void canGetName() {
        assertEquals("The Falcon's Nest", hotel.getName());
    }


}
