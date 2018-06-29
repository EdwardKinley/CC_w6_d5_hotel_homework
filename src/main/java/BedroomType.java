public enum BedroomType {

    SINGLE("single", 1),
    DOUBLE("double", 2),
    FAMILY("family", 4);

    private final String type;
    private final int sleeps;

    BedroomType(String type, int sleeps) {
        this.type = type;
        this.sleeps = sleeps;
    }

    public String getType() {
        return this.type;
    }

    public int getSleeps() {
        return this.sleeps;
    }

}
