import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CinemaTicketSystem1 {
    protected static Scanner scanner = new Scanner(System.in);
    private static List<Schedule> schedule = new ArrayList<>();

    public static void main(String[] args){
        showmainpage();
    }


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static void showmainpage(){
        int number;
        System.out.println("============================================================================================================");
        System.out.println("                                               WELCOME TO CINEMA                                            ");
        System.out.println("============================================================================================================");
        System.out.println("1. <  Customer  >");
        System.out.println("2. <  Staff     >");
        System.out.println("3. <  Exit      >"); 
        System.out.println("============================================================================================================");
        System.out.println("Choose Your Options:");
        String choice = scanner.nextLine();

        switch(choice){
            case "1":
                customerpage();
            break;

            case "2":
                staffpage();
            break;

            case "3":
                System.out.println("===========================================");
                System.out.println("Thank you for your support! Have a nice day");
                System.out.println("===========================================");
            break;

            default:
                System.out.println("\n You're using invalid numbers! please try again!");
            break;
        }
    }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static void customerpage(){
        int choice;
        do {
            
            System.out.println("\n=================================================================");
            System.out.println("                      CUSTOMER TICKETING SYSTEM                   ");
            System.out.println("=================================================================");
            System.out.println("1. View Now Showing Movies");
            System.out.println("2. Purchase Ticket");
            System.out.println("3. View My Bookings");
            System.out.println("4. Return to Main Menu");
            System.out.println("=================================================================");
            System.out.print("Enter your choice: ");
            
            choice = Integer.parseInt(scanner.nextLine());
            
            switch(choice) {
                case 1:
                    viewNowShowing();
                    break;
                case 2:
                    purchaseTicket();
                    break;
                case 3:
                    viewMyBookings();
                    break;
                case 4:
                    System.out.println("Returning to main menu...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
            if (choice != 4) {
                pressEnterToContinue();
            }
        } while (choice != 4);
        showmainpage();
    }
    private static void purchaseTicket() {
        throw new UnsupportedOperationException("Unimplemented method 'purchaseTicket'");
    }

    private static void viewMyBookings() {      
        throw new UnsupportedOperationException("Unimplemented method 'viewMyBookings'");
    }

    private static void pressEnterToContinue() {
        throw new UnsupportedOperationException("Unimplemented method 'pressEnterToContinue'");
    }

    private static void viewNowShowing() {
        throw new UnsupportedOperationException("Unimplemented method 'viewNowShowing'");
    }

    public static void staffpage(){
        
    }



}
