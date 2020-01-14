import java.util.Scanner;

public class SwitchCaseTest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int testChar=Integer.parseInt(scanner.nextLine());
        switch (testChar){
            case 5:
                System.out.println("yes");
                break;
            case 3:
                System.out.println("maybe");
                break;
            case 4:
                System.out.println("no");
                break;
                default:
                    System.out.println("Invalid");

        }
    }
}
