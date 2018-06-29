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
    Bedroom bedroom1;
    Bedroom bedroom2;
    Guest guest1;
    Guest guest2;
    Guest guest3;
    Guest guest4;
    ArrayList<Guest> guests1;
    ArrayList<Guest> guests2;

    @Before
    public void before() {
        guest1 = new Guest("Edward");
        guest2 = new Guest("Cat");
        guest3 = new Guest("Erin");
        guest4 = new Guest("Colby");
        guests1 = new ArrayList<>();
        guests2 = new ArrayList<>();
        guests1.add(guest1);
        guests1.add(guest2);
        guests1.add(guest3);
        guests2.add(guest1);
        guests2.add(guest2);
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
        bedroom1 = new Bedroom(
                BedroomType.FAMILY.getSleeps(),
                guests1,
                101,
                30,
                BedroomType.FAMILY.getType());
        bedroom2 = new Bedroom(
                BedroomType.DOUBLE.getSleeps(),
                guests2,
                234,
                40,
                BedroomType.DOUBLE.getType());
    }

    @Test
    public void canGetName() {
        assertEquals("The Falcon's Nest", hotel.getName());
    }

    @Test
    public void canAddBedroom() {
        assertEquals(0, hotel.getBedrooms().size());
        hotel.getBedrooms().add(bedroom1);
        assertEquals(1, hotel.getBedrooms().size());
        hotel.addBedroom(bedroom2);
        assertEquals(2, hotel.getNumberOfBedrooms());
    }

    @Test
    public void canCheckGuestIntoRoom() {
        hotel.addBedroom(bedroom1);
        assertEquals(3, hotel.getNumberOfGuestsInRoom(bedroom1));
        hotel.checkGuestIntoRoom(guest4, bedroom1);
        assertEquals(4, hotel.getNumberOfGuestsInRoom(bedroom1));
    }

    @Test
    public void canCheckGuestOutOfRoom() {
        hotel.addBedroom(bedroom1);
        hotel.checkGuestIntoRoom(guest4, bedroom1);
        assertEquals(4, hotel.getNumberOfGuestsInRoom(bedroom1));
        hotel.checkGuestOutOfRoom(guest1, bedroom1);
        hotel.checkGuestOutOfRoom(guest2, bedroom1);
        assertEquals(2, hotel.getNumberOfGuestsInRoom(bedroom1));
        hotel.checkGuestOutOfRoom(guest2, bedroom1);
        assertEquals(2, hotel.getNumberOfGuestsInRoom(bedroom1));
    }


}
