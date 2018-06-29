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
}
