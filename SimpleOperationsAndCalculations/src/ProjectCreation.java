import java.util.Scanner;

public class ProjectCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName= scanner.nextLine();
        int projects = Integer.parseInt(scanner.nextLine());
        int projectsTime=projects*3;
        System.out.println("The architect " +firstName+ " will need " + projectsTime + " hours to complete " +projects + " project/s.");
    }
}
