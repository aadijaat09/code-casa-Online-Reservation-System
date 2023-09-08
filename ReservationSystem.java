import java.util.Scanner;

public class ReservationSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Train Reservation System!");

        while (true) {
            System.out.println("1. Search fot trains");
            System.out.println("2. Book a train ticket");
            System.out.println("3. Cancel a train ticket");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    searchforTrains();
                    break;
                case 2:
                    bookaTrainTicket();
                    break;
                case 3:
                    cancelaTrainTicket();
                    break;
                case 4:
                    System.out.println("Thank you for using the our Train Reservation System. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice.");
                    System.out.println("Please try again...");
            }
        }
    }

    private static void searchforTrains() {

        System.out.println("Train search functionality is not implemented yet.");
    }

    private static void bookaTrainTicket() {

        System.out.println("Please enter the following details to book a train ticket:");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String passengerName = scanner.nextLine();

        System.out.print("Enter the source station: ");
        String sourceStation = scanner.nextLine();

        System.out.print("Enter the destination station: ");
        String destinationStation = scanner.nextLine();

        System.out.print("Enter the date of traveling (DD-MM-YYYY): ");
        String travelDate = scanner.nextLine();

        System.out.println("Congratulations, " + passengerName + "! Your train ticket from " + sourceStation
                + " to " + destinationStation + " on " + travelDate + " has been booked.");

    }

    private static void cancelaTrainTicket() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String passengerName = scanner.nextLine();

        System.out.print("Enter the source station of the booked ticket: ");
        String sourceStation = scanner.nextLine();

        System.out.print("Enter the destination station of the booked ticket: ");
        String destinationStation = scanner.nextLine();

        System.out.print("Enter the date of travel of the booked ticket (DD-MM-YYYY): ");
        String travelDate = scanner.nextLine();

        System.out.println("Your train ticket from " + sourceStation
                + " to " + destinationStation + " on " + travelDate + " has been canceled.");

    }
}
