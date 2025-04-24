public class ChildTicket extends TicketType {

    public ChildTicket() {
        super("Child");
    }

    
    public double getPriceForHall(Hall hall) {
        double price = 0.0;
        switch (hall.getType()) {
            case "Imax":
                price = 10.00;
                break;
            case "Indulge":
                price = 15.00;
                break;
            default:
                System.out.println("Invalid hall. Please select a valid hall.");
                break;
    }
    return price;
    }
}
