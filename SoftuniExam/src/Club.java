import java.util.Scanner;

public class Club {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double wantedProfit = Double.parseDouble(scanner.nextLine());
        double orderPrice = 0;
        double incomeSum = 0;
        while (true) {
            String cocktailName = scanner.nextLine();
            if (cocktailName.equals("Party!")) {
                break;
            }
            int cocktailCount = Integer.parseInt(scanner.nextLine());
            int cocktailPrice = cocktailName.length();
            orderPrice = cocktailPrice * cocktailCount;
            if (orderPrice % 2 != 0) {
                orderPrice = orderPrice - (orderPrice * 0.25);
            }
            incomeSum += orderPrice;
            if (incomeSum >= wantedProfit) {
                System.out.printf("Target acquired.\nClub income - %.2f leva.", incomeSum);
                break;


            }

        }
        if (incomeSum < wantedProfit) {
            System.out.printf("We need %.2f leva more.\nClub income - %.2f leva.", wantedProfit - incomeSum, incomeSum);

        }
    }
}