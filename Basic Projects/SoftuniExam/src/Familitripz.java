import java.util.Scanner;

public class Familitripz {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
            double budget=Double.parseDouble(scanner.nextLine());
            int nights=Integer.parseInt(scanner.nextLine());
            double pricePerNight=Double.parseDouble(scanner.nextLine());
            int addedExpenses=Integer.parseInt(scanner.nextLine());
            if(nights>7){
                pricePerNight=pricePerNight-(pricePerNight*0.05);
            }
            double priceForWholeStay=pricePerNight*nights;
            double priceAfterAddedExpenses=priceForWholeStay+(budget*(addedExpenses*0.010));
            if(budget>=priceAfterAddedExpenses){
                System.out.printf("Ivanovi will be left with %.2f leva after vacation.",budget-priceAfterAddedExpenses);
            }else{
                System.out.printf("%.2f leva needed.",priceAfterAddedExpenses-budget);
            }


    }
}
