import java.util.Scanner;

public class TravelAgency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cityName = scanner.nextLine();
        String pack = scanner.nextLine();
        String vipDiscount = scanner.nextLine();
        int nightsStayed = Integer.parseInt(scanner.nextLine());
        double pricePerDay = 0;
        if(nightsStayed<1){
            System.out.println("Days must be positive number!");


        }else if (cityName.equals("Bansko") || cityName.equals("Borovets")) {
            if (pack.equals("withEquipment")) {
                pricePerDay = 100;
                if (vipDiscount.equals("yes")) {
                    pricePerDay = pricePerDay - (pricePerDay * 0.10);
                    System.out.printf("The price is %.2flv! Have a nice time!", pricePerDay * nightsStayed);
                } else if (vipDiscount.equals("no")) {
                    System.out.printf("The price is %.2flv! Have a nice time!", pricePerDay * nightsStayed);

                }else{
                    System.out.println("Invalid input!");
                }
            } else if (pack.equals("noEquipment")) {
                pricePerDay = 80;
                if (vipDiscount.equals("yes")) {
                    pricePerDay = pricePerDay - (pricePerDay * 0.05);
                    System.out.printf("The price is %.2flv! Have a nice time!", pricePerDay * nightsStayed);
                } else if (vipDiscount.equals("no")) {
                    System.out.printf("The price is %.2flv! Have a nice time!", pricePerDay * nightsStayed);

                }else{
                    System.out.println("Invalid input!");
                }
            }
        }
        else if (cityName.equals("Varna") || cityName.equals("Burgas")) {
            if (pack.equals("withBreakfast")) {
                pricePerDay = 130;
                if (vipDiscount.equals("yes")) {
                    pricePerDay = pricePerDay - (pricePerDay * 0.12);
                    System.out.printf("The price is %.2flv! Have a nice time!", pricePerDay * nightsStayed);
                } else if (vipDiscount.equals("no")) {
                    System.out.printf("The price is %.2flv! Have a nice time!", pricePerDay * nightsStayed);

                }else{
                    System.out.println("Invalid input!");
                }

            } else if (pack.equals("noBreakfast")) {
                pricePerDay = 100;
                if (vipDiscount.equals("yes")) {
                    pricePerDay = pricePerDay - (pricePerDay * 0.07);
                    System.out.printf("The price is %.2flv! Have a nice time!", pricePerDay * nightsStayed);
                } else if (vipDiscount.equals("no")) {
                    System.out.printf("The price is %.2flv! Have a nice time!", pricePerDay * nightsStayed);

                }else{
                    System.out.println("Invalid input");
                }

            }
        }else{
            System.out.println("Invalid input!");
        }
    }
}