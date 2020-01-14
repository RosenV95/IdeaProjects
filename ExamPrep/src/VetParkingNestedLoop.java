import java.util.Scanner;

public class VetParkingNestedLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int days = Integer.parseInt(scan.nextLine());
        int hours = Integer.parseInt(scan.nextLine());

        double totalPrice = 0.0;

        for (int day = 1; day <= days; day++) {
            double price = 0.0;
            for (int hour = 1; hour <= hours; hour++) {
                if (day % 2 == 0 && hour % 2 != 0) {
                    price += 2.5;
                } else if (day % 2 != 0 && hour % 2 == 0) {
                    price += 1.25;
                } else {
                    price += 1;
                }
            }
            System.out.println(String.format("Day: %d - %.2f leva", day, price));
            totalPrice += price;
        }
        System.out.println(String.format("Total: %.2f leva", totalPrice));
    }
}