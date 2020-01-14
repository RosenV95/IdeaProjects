import java.util.Scanner;

public class TimePlusFifteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        int timeInMinutes = hours * 60 + minutes;
        System.out.println("Time in minutes= "+timeInMinutes);
        int timeplus = timeInMinutes + 15;
        System.out.println("Timeplus is= "+timeplus);
        int finalHour = timeplus / 60;
        System.out.println(finalHour);
        int finalMinutes = timeplus % 60;
        System.out.println(finalMinutes);
        if (finalHour >= 24) {
            finalHour -= 24;
        }
        if(finalMinutes<10){
            System.out.printf("%d:0%d",finalHour,finalMinutes);
        }
        else{
            System.out.printf("%d:%d",finalHour,finalMinutes);
        }
    }
}