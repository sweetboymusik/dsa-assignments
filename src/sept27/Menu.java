package sept27;

import java.util.Scanner;

public class Menu {
    // instance variables
    private final Scanner scanner;
    private final Theater theater;

    // constructors
    public Menu(Scanner scanner, Theater theater) {
        this.scanner = scanner;
        this.theater = theater;
    }

    // methods
    private void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    private void clearPreviousLine() {
        System.out.print("\033[1A");
        System.out.print("\033[2K");
    }

    public void mainMenu() {
        while (true) {
            System.out.println("Theater System:");
            System.out.println("1. View seating chart");
            System.out.println("2. Reserve a seat");
            System.out.println("3. Cancel a seat");
            System.out.println("4. Exit");
            System.out.println();
            System.out.print("Enter your choice (1-4): ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println();
                    seatingChartMenu();
                    break;
                case 2:
                    System.out.println();
                    reserveMenu();
                    break;
                case 3:
                    System.out.println();
                    cancelMenu();
                    break;
                case 4:
                    System.out.println();
                    System.out.println("Thank you!");
                    return;
                default:
                    System.out.println();
                    System.out.println("Invalid choice");
                    System.out.println();
                    break;
            }
        }
    }

    public void seatingChartMenu() {
        theater.displaySeats();
        System.out.println();
    }

    public void reserveMenu() {
        System.out.println("Reserve a seat: ");

        System.out.print("Enter seat row (0-" + (theater.getRows() - 1) + "): ");
        int row = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter seat column (0-" + (theater.getCols() - 1) + "): ");
        int col = scanner.nextInt();
        scanner.nextLine();

        String result = theater.reserveSeat(row, col);
        System.out.println(result);
        System.out.println();
        System.out.print("Press enter to return to main menu...");
        scanner.nextLine();
        System.out.println();
    }

    public void cancelMenu() {
        System.out.println("Cancel a reserved seat: ");

        System.out.print("Enter seat row (0-" + theater.getRows() + "): ");
        int row = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter seat column (0-" + theater.getCols() + "): ");
        int col = scanner.nextInt();
        scanner.nextLine();

        String result = theater.cancelSeat(row, col);
        System.out.println(result);
        System.out.println();
        System.out.print("Press enter to return to main menu...");
        scanner.nextLine();
        System.out.println();
    }


}
