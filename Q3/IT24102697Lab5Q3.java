import java.util.Scanner;

public class IT24102697Lab5Q3 {
       
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double ROOM_CHARGE_PER_DAY = 48000.0;
        int DISCOUNT_10_PERCENT = 10;
        int DISCOUNT_20_PERCENT = 20;

        System.out.print("Enter Start Date (1-31): ");
        int startDate = scanner.nextInt();

        System.out.print("Enter End Date (1-31): ");
        int endDate = scanner.nextInt();

        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Error: Days must be between 1 and 31");
            return;
        }

        if (startDate >= endDate) {
            System.out.println("Error: Start Date must be less than End Date");
            return;
        }

        int numberOfDaysReserved = endDate - startDate;

        double totalAmount = numberOfDaysReserved * ROOM_CHARGE_PER_DAY;

        if (numberOfDaysReserved >= 3 && numberOfDaysReserved <= 4) {
            totalAmount -= totalAmount * DISCOUNT_10_PERCENT / 100;
        } else if (numberOfDaysReserved >= 5) {
            totalAmount -= totalAmount * DISCOUNT_20_PERCENT / 100;
        }

        System.out.println("Room Charge Per Day: Rs. " + ROOM_CHARGE_PER_DAY);
        System.out.println("Number of Days Reserved: " + numberOfDaysReserved);
        System.out.println("Total Amount to be Paid: " + totalAmount);
    }
}