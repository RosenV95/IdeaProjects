import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tripCost = Double.parseDouble(scanner.nextLine());
        double puzzleAmount = Double.parseDouble(scanner.nextLine());
        double dollsAmount = Double.parseDouble(scanner.nextLine());
        double bearAmount = Double.parseDouble(scanner.nextLine());
        double minionAmount = Double.parseDouble(scanner.nextLine());
        double truckAmount = Double.parseDouble(scanner.nextLine());
        double puzzleProfit = puzzleAmount * 2.60;
        double dollsProfit = dollsAmount * 3;
        double bearProfit = bearAmount * 4.10;
        double minionProfit = minionAmount * 8.20;
        double truckProfit = truckAmount * 2;
        double overallProfit = puzzleProfit + dollsProfit + bearProfit + minionProfit + truckProfit;
        double overallCount = puzzleAmount + dollsAmount + bearAmount + minionAmount + truckAmount;
        double profitAfterRent = overallProfit-(overallProfit * 0.10);
        double discountedProfit = overallProfit-(overallProfit * 0.25);
        double discountedProfitAfterRent=discountedProfit-(discountedProfit*0.10);
        if(overallCount>=50 && tripCost<=discountedProfitAfterRent){
            System.out.printf("Yes! %.2f lv left.",(discountedProfitAfterRent-tripCost));

        }
        else if(overallCount>=50 && tripCost>discountedProfitAfterRent) {
            System.out.printf("Not enough money! %.2f lv needed.", (tripCost - discountedProfitAfterRent));
        }
        else if(tripCost<profitAfterRent){
            System.out.printf("Yes! %.2f lv left.",(profitAfterRent-tripCost));
        }
        else if(tripCost>profitAfterRent){
            System.out.printf("Not enough money! %.2f lv needed.", (tripCost - profitAfterRent));
        }
    }
}