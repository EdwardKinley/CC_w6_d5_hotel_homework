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

    public void checkGuestIntoRoom(Guest guest, Room room) {
        room.addGuest(guest);
    }

    public int getNumberOfGuestsInRoom(Room room) {
        return room.getNumberOfGuests();
    }

    public void checkGuestOutOfRoom(Guest guest, Room room) {
        room.getGuests().remove(guest);
    }

    public ArrayList<Guest> getGuestsBookedIntoRoom(Room room) {
        return room.getGuests();
    }

    public ArrayList<String> getNamesOfGuestsBookedIntoRoom(Room room) {
        return room.getGuestsNames();
    }
}
