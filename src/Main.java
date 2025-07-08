import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" Calling Parking Billing System ===");
        runParkingBillingSystem(input);

        System.out.println("\n Calling Amusement Park System ===");
        runAmusementParkSystem(input);

    }

    // Task 1: Parking Billing System
    public static void runParkingBillingSystem(Scanner input) {
        String moreVisits = "Yes";

        while (moreVisits.equalsIgnoreCase("Yes")) {
            System.out.print("Enter vehicle type (Car / Bike / Truck): ");
            String vehicle = input.nextLine();

            System.out.print("Enter number of hours parked: ");
            int hours = input.nextInt();
            input.nextLine();

            int rate = 0;
            if (vehicle.equals("Car")) {
                rate = 100;
            } else if (vehicle.equals("Bike")) {
                rate = 50;
            } else if (vehicle.equals("Truck")) {
                rate = 150;
            } else {
                System.out.println("Invalid vehicle type.");
                continue;
            }

            int fee = rate * hours;
            double discount;
            if (hours > 5) {
                discount = fee * 0.10;
            } else {
                discount = 0;
            }

            double finalBill = fee - discount;

            System.out.println("\n Parking Bill ");
            System.out.println("Vehicle Type: " + vehicle);
            System.out.println("Hours Parked: " + hours);
            System.out.println("Rate per Hour: " + rate);
            System.out.println("Fee before Discount: " + fee);
            System.out.println("Discount: " + discount);
            System.out.println("Final Bill: " + finalBill);

            System.out.print("Do you want to enter another visit? (Yes/No): ");
            moreVisits = input.nextLine();
        }
    }


    // Task 2: Amusement Park System
    public static void runAmusementParkSystem(Scanner input) {
        String moreVisitors = "yes";

        while (moreVisitors.equals("yes")) {
            System.out.print("Enter visitor's age: ");
            int age = input.nextInt();

            System.out.print("Enter visitor's height in cm: ");
            int height = input.nextInt();
            input.nextLine();

            if (age >= 10 && height >= 120) {
                int ticketPrice;

                if (age <= 12) {
                    ticketPrice = 300;
                } else if (age <= 18) {
                    ticketPrice = 500;
                } else {
                    ticketPrice = 700;
                }

                System.out.println(" Eligible for the ride.");
                System.out.println(" Ticket price: " + ticketPrice + " PKR");
            } else {
                System.out.println(" Not eligible for the ride.");
            }

            System.out.print("Do you want to add another visitor? (yes/no): ");
            moreVisitors = input.nextLine();
        }

        System.out.println("Thank you for using the Amusement Park System!");
    }
}
