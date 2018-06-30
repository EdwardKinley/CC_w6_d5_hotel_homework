import java.util.ArrayList;

public class Bedroom extends Room {

    private int number;
    private int rate;
    private String type;

    public Bedroom(
            int capacity,
            ArrayList<Guest> guests,
            int number,
            int rate,
            String type) {
        super(capacity, guests);
        this.number = number;
        this.rate = rate;
        this.type = type;
    }

    public int getNumber() {
        return this.number;
    }
    public int getRate() {
        return this.rate;
    }
    public String getType() { return this.type; }

}
