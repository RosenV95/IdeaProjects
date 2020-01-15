import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        String day = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday")) {
            if (product.equals("banana")) {
                System.out.printf("%.2f", quantity * 2.50);
            } else if (product.equals("apple")) {
                System.out.printf("%.2f", quantity * 1.20);
            } else if (product.equals("orange")) {
                System.out.printf("%.2f", quantity * 0.85);
            } else if (product.equals("grapefruit")) {
                System.out.printf("%.2f", quantity * 1.45);
            } else if (product.equals("kiwi")) {
                System.out.printf("%.2f", quantity * 2.70);
            } else if (product.equals("pineapple")) {
                System.out.printf("%.2f", quantity * 5.50);
            } else if (product.equals("grapes")) {
                System.out.printf("%.2f", quantity * 3.85);
            } else {
                System.out.println("error");
            }

        }
        else if (day.equals("Saturday") || day.equals("Sunday")) {
            if (product.equals("banana")) {
                System.out.printf("%.2f", quantity * 2.70);
            } else if (product.equals("apple")) {
                System.out.printf("%.2f", quantity * 1.25);
            } else if (product.equals("orange")) {
                System.out.printf("%.2f", quantity * 0.90);
            } else if (product.equals("grapefruit")) {
                System.out.printf("%.2f", quantity * 1.60);
            } else if (product.equals("kiwi")) {
                System.out.printf("%.2f", quantity * 3.00);
            } else if (product.equals("pineapple")) {
                System.out.printf("%.2f", quantity * 5.60);
            } else if (product.equals("grapes")) {
                System.out.printf("%.2f", quantity * 4.20);
            } else {
                System.out.println("error");
            }
        }else {
            System.out.println("error");
        }
    }
}
