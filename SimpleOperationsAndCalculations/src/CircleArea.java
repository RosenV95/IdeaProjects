import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius = Double.parseDouble(scanner.nextLine());
        double area=(radius*radius)*Math.PI;
        System.out.printf("%.2f\n",area);
        double parameter=2*radius*Math.PI;
        System.out.printf("%.2f",parameter);
    }
}
