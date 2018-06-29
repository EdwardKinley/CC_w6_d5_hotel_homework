import java.util.ArrayList;

public class ConferenceRoom extends Room {

    private String name;
    private int rate;

    public ConferenceRoom(int capacity, ArrayList<Guest> guests, String name, int rate) {
        super(capacity, guests);
        this.name = name;
        this.rate = rate;
    }

    public String getName() {
        return this.name;
    }

    public int getRate() {
        return this.rate;
    }

}
