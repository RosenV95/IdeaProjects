import java.util.Scanner;

public class Scholarship {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double income=Double.parseDouble(scanner.nextLine());
        double averageGrade=Double.parseDouble(scanner.nextLine());
        double minWage=Double.parseDouble(scanner.nextLine());
        double socScholarship=minWage*0.35;
        double excScholarship = averageGrade * 25;
        if(income<minWage && averageGrade>=5.5){
            if(excScholarship>=socScholarship){
                System.out.printf("You get a scholarship for excellent results %.0f BGN", Math.floor(excScholarship));
            }
            else{
                System.out.printf("You get a Social scholarship %.0f BGN",Math.floor(socScholarship));
            }
        }
        else if((income<minWage) && (averageGrade>4.5)){
            System.out.printf("You get a Social scholarship %.0f BGN",Math.floor(socScholarship));
        }
        else if((income>=minWage) && (averageGrade>=5.5)) {

            System.out.printf("You get a scholarship for excellent results %.0f BGN", Math.floor(excScholarship));

        }
        else{
            System.out.println("You cannot get a scholarship!");
        }

}
}