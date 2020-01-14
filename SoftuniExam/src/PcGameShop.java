import java.util.Scanner;

public class PcGameShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int gamesCount = Integer.parseInt(scanner.nextLine());
        double percentages = 100;
        for (int i = 0; i <= gamesCount; i++) {
            String gameName = scanner.nextLine();
            if (gameName.equals("Hearthstone")) {
                percentages = percentages - (percentages * 0.25);
            } else if (gameName.equals("Overwatch")) {
                percentages = percentages - (percentages * 0.25);
            } else if (gameName.equals("Fortnite")) {
                percentages = percentages - (percentages * 0.25);
            } else if (gameName.equals("Other")) ;
            percentages = percentages - (percentages * 0.25);

        }
    }
}
