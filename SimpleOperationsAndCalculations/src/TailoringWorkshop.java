import java.util.Scanner;

public class TailoringWorkshop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tables = Integer.parseInt(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());
        double areaOneCover = tables * (length + 2 * 0.30) * (width + 2 * 0.30);
        double areaOneSquare = tables * (length / 2) * (length / 2);
        double priceCovers = areaOneCover* 7;
        double priceSquares = areaOneSquare * 9;
        double totalPriceInDollars = priceCovers + priceSquares;
        double totalPriceInBGN = totalPriceInDollars * 1.85;
        System.out.printf("%.2f USD\n", totalPriceInDollars);
        System.out.printf("%.2f BGN", totalPriceInBGN);

    }
}