import java.util.Scanner;

public class GorillavsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        double statists = Double.parseDouble((scanner.nextLine()));
        double statistClothing = Double.parseDouble((scanner.nextLine()));
        double decorCost = budget * 0.10;
        double clothingCost=statists*statistClothing;

        if (statists > 150) {
            clothingCost = clothingCost-(clothingCost* 0.10);


        }
        double expenses = (clothingCost) + decorCost;
        if (budget >= expenses) {
            System.out.printf("Action!\nWingard starts filming with %.2f leva left.", (budget - expenses));
        }
        else{
            System.out.printf("Not enough money!\nWingard needs %.2f leva more.",(expenses-budget));
        }
    }
}