import java.util.ArrayList;

public abstract class Room {

    private int capacity;
    private ArrayList<Guest> guests;

    public Room(int capacity, ArrayList<Guest> guests) {
        this.capacity = capacity;
        this.guests = guests;
    }

    public int getCapacity() { return this.capacity; }

    public ArrayList<Guest> getGuests() { return this.guests; }

    public int getNumberOfGuests() {
        return this.guests.size();
    }

    public int getRemainingSpace() {
        return this.getCapacity() - this.getNumberOfGuests();
    }

    public void addGuest(Guest guest) {
        if (this.getRemainingSpace() > 0) {
            this.guests.add(guest);
        }
    }

    public void removeGuests() {
        this.guests.clear();
    }


}
