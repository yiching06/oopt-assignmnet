public class AdultTicket extends TicketType {

    public AdultTicket() {
        super("Adult");
    }

    
    public double getPriceForHall(Hall hall) {
        double price = 0.0;
        switch (hall.getType()) {
            case "Imax":
                price = 20.00;
                break;
            case "Indulge":
                price = 30.00;
                break;
            default:
                System.out.println("Invalid hall. Please select a valid hall.");
                break;
    }
    return price;
    }

}
