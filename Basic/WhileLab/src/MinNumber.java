import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        int min=Integer.MAX_VALUE;
        int countNumbers=1;
        while(countNumbers<=n){
            int number=Integer.parseInt(scanner.nextLine());
            if(number<min){
                min=number;
            }
            countNumbers++;
        }
        System.out.println(min);

    }
}
