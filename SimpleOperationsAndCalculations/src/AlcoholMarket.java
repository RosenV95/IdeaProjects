import java.util.Scanner;

public class AlcoholMarket {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double whiskeyPrice=Double.parseDouble(scanner.nextLine());
        double beerAmount= Double.parseDouble(scanner.nextLine());
        double wineAmount=Double.parseDouble(scanner.nextLine());
        double rakiaAmount=Double.parseDouble(scanner.nextLine());
        double whiskeyAmount=Double.parseDouble(scanner.nextLine());
        double rakiaPriceCalculation=whiskeyPrice*0.5;
        double rakiaPrice=whiskeyPrice-rakiaPriceCalculation;
        double winePriceCalculation=rakiaPrice*0.4;
        double winePrice=rakiaPrice-winePriceCalculation;
        double beerPriceCalculation=rakiaPrice*0.8;
        double beerPrice=rakiaPrice-beerPriceCalculation;
        double finalCalculation=(whiskeyAmount*whiskeyPrice)+(rakiaAmount*rakiaPrice)+(wineAmount*winePrice)+(beerAmount*beerPrice);
        System.out.printf("%.2f",finalCalculation);

    }
}
