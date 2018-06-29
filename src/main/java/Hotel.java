import java.util.ArrayList;

public class Hotel {

    private String name;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private ArrayList<DiningRoom> diningRooms;
    private ArrayList<Room> rooms;

    public Hotel(
            String name,
            ArrayList<Bedroom> bedrooms,
            ArrayList<ConferenceRoom> conferenceRooms,
            ArrayList<DiningRoom> diningRooms,
            ArrayList<Room> rooms) {
        this.name = name;
        this.bedrooms = bedrooms;
        this.conferenceRooms = conferenceRooms;
        this.diningRooms = diningRooms;
        this.rooms = rooms;
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Bedroom> getBedrooms() {
        return this.bedrooms;
    }

    public int getNumberOfBedrooms() {
        return this.bedrooms.size();
    }

    public void addBedroom(Bedroom bedroom) {
        this.bedrooms.add(bedroom);
        this.rooms.add(bedroom);
    }

    public void checkGuestIntoRoom(Guest guest, Bedroom bedroom) {
        bedroom.addGuest(guest);
    }

    public int getNumberOfGuestsInRoom(Room room) {
        return room.getNumberOfGuests();
    }


}
