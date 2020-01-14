import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String word1= scanner.nextLine();
        if(word1.equals("square")){
            double squareSide=Double.parseDouble(scanner.nextLine());
            double squareArea=squareSide*squareSide;
            System.out.printf("%.3f",squareArea);


        }
        else if(word1.equals("rectangle")) {
            double rectangleLongSide = Double.parseDouble(scanner.nextLine());
            double rectangleShortSide = Double.parseDouble(scanner.nextLine());
            double rectangleArea = rectangleLongSide * rectangleShortSide;
            System.out.printf("%.3f", rectangleArea);
        }
        else if(word1.equals("circle")) {
            double circleRadius = Double.parseDouble(scanner.nextLine());
            double circleArea = circleRadius*circleRadius*Math.PI;
            System.out.printf("%.3f", circleArea);
        }
        else if(word1.equals("triangle")){
            double triangleShortSide = Double.parseDouble(scanner.nextLine());
            double triangleHeight = Double.parseDouble(scanner.nextLine());
                double triangleArea = (triangleShortSide * triangleHeight)/2;
            System.out.printf("%.3f", triangleArea);
        }

    }
}
