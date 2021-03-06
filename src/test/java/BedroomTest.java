import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom1;
    Bedroom bedroom2;
    Bedroom bedroom3;
    Guest guest1;
    Guest guest2;
    Guest guest3;
    Guest guest4;
    ArrayList<Guest> guests1;
    ArrayList<Guest> guests2;
    ArrayList<Guest> guests3;

    @Before
    public void before() {
        guest1 = new Guest("Edward");
        guest2 = new Guest("Cat");
        guest3 = new Guest("Erin");
        guest4 = new Guest("Colby");
        guests1 = new ArrayList<>();
        guests2 = new ArrayList<>();
        guests3 = new ArrayList<>();
        guests1.add(guest1);
        guests1.add(guest2);
        guests1.add(guest3);
        guests2.add(guest1);
        guests2.add(guest2);
        bedroom1 = new Bedroom(
                BedroomType.FAMILY.getSleeps(),
                guests1,
                101,
                30,
                BedroomType.FAMILY.getType(),
                2);
        bedroom2 = new Bedroom(
                BedroomType.DOUBLE.getSleeps(),
                guests2,
                234,
                40,
                BedroomType.DOUBLE.getType(),
                3);
        bedroom3 = new Bedroom(
                BedroomType.SINGLE.getSleeps(),
                guests3,
                111,
                29,
                BedroomType.SINGLE.getType(),
                0);
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
        assertEquals(4, bedroom1.getCapacity());
    }

    @Test
    public void getRemainingSpace() {
        assertEquals(1, bedroom1.getRemainingSpace());
    }

    @Test
    public void canGetNights() {
        assertEquals(2, bedroom1.getNights());
        assertEquals(3, bedroom2.getNights());
        assertEquals(0, bedroom3.getNights());
    }

    @Test
    public void canAddGuest() {
        bedroom1.addGuest(guest4,1);
        assertEquals(4, bedroom1.getNumberOfGuests());
        assertEquals(2, bedroom1.getNights());
        bedroom1.removeGuest(guest4);
        bedroom1.addGuest(guest4,6);
        assertEquals(4, bedroom1.getNumberOfGuests());
        assertEquals(6, bedroom1.getNights());
    }

    @Test
    public void cannotAddGuest() {
        bedroom2.addGuest(guest3, 7);
        assertEquals(2, bedroom2.getNumberOfGuests());
        assertEquals(3, bedroom2.getNights());
    }

    @Test
    public void getRate() {
        assertEquals(30, bedroom1.getRate());
    }

    @Test
    public void getType() {
        assertEquals("family", bedroom1.getType());
    }

    @Test
    public void removeGuests() {
        bedroom1.removeGuests();
        assertEquals(0, bedroom1.getNumberOfGuests());
    }

    @Test
    public void removeGuest() {
        bedroom1.removeGuest(guest1);
        assertEquals(2, bedroom1.getNumberOfGuests());
    }

    @Test
    public void getGuests() {
        assertEquals(guests1, bedroom1.getGuests());
    }

    @Test
    public void getGuestsNames() {
        ArrayList<String> expectedGuestsNames = new ArrayList<>();
        expectedGuestsNames.add("Edward");
        expectedGuestsNames.add("Cat");
        expectedGuestsNames.add("Erin");
        assertEquals(expectedGuestsNames, bedroom1.getGuestsNames());
    }
}
