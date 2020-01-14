import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = Double.parseDouble(scanner.nextLine());
        String firstMetric = scanner.nextLine();
        String secondMetric = scanner.nextLine();
        if (firstMetric.equals("m") && secondMetric.equals("cm")) {
            number = number * 100;
            System.out.printf("%.3f",number);
        } else if (firstMetric.equals("m") && secondMetric.equals("mm")) {
            number = number * 1000;
            System.out.printf("%.3f",number);
        } else if (firstMetric.equals("cm") && secondMetric.equals("m")) {
            number = number / 100;
            System.out.printf("%.3f",number);
        } else if (firstMetric.equals("cm") && secondMetric.equals("mm")) {
            number = number * 10;
            System.out.printf("%.3f",number);
        } else if (firstMetric.equals("mm") && secondMetric.equals("cm")) {
            number = number / 10;
            System.out.printf("%.3f",number);
        } else if (firstMetric.equals("mm") && secondMetric.equals("m")) {
            number = number / 1000;
            System.out.printf("%.3f",number);
        }
    }
}