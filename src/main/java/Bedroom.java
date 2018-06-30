import java.util.ArrayList;

public class Bedroom extends Room {

    private int number;
    private int rate;
    private String type;
    private int nights;

    public Bedroom(
            int capacity,
            ArrayList<Guest> guests,
            int number,
            int rate,
            String type,
            int nights) {
        super(capacity, guests);
        this.number = number;
        this.rate = rate;
        this.type = type;
        this.nights = nights;
    }

    public int getNumber() {
        return this.number;
    }
    public int getRate() {
        return this.rate;
    }
    public String getType() { return this.type; }
    public int getNights() { return this.nights; }

    public void addGuest(Guest guest, int nights) {
        if (this.getRemainingSpace() > 0) {
            this.getGuests().add(guest);
            if (nights > this.nights) {
                this.nights = nights;
            }
        }

    }


}
