import java.util.Arrays;
import java.util.Scanner;

public class EvenOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int evenSum=0;
        int oddSum=0;

        int[]input= Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e->Integer.parseInt(e))
                .toArray();
        for(int i=0; i<input.length;i++){

            if(input[i]%2==0){
                evenSum+=input[i];
            }else if(input[i]%2!=0){
                oddSum+=input[i];
            }

        }
        System.out.println(oddSum);
        System.out.println(evenSum);
        int finalSum=evenSum-oddSum;
        System.out.println(finalSum);

    }
}
