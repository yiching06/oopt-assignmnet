public abstract class TicketType {
    protected String type;

    public TicketType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public abstract double getPriceForHall(Hall hall);
}
