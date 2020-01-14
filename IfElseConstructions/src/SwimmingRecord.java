import java.util.Scanner;

public class SwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double currentRecord=Double.parseDouble(scanner.nextLine());
        double distanceinMetres=Double.parseDouble(scanner.nextLine());
        double distanceSwamForOneMetre=Double.parseDouble((scanner.nextLine()));
        double totalTime=distanceinMetres*distanceSwamForOneMetre;
        double timeDelayed=Math.round(distanceinMetres)/15;
        double totalSecondsDelayed=timeDelayed*12.5;
        double timePlusDelayment=totalTime+totalSecondsDelayed;
        if(currentRecord<=timePlusDelayment){
            System.out.printf("No, he failed! He was %.2f seconds slower.",(timePlusDelayment-currentRecord));
        }
        else{
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.",timePlusDelayment);

        }
    }
}
