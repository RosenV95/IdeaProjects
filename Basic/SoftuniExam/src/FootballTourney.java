import java.util.Scanner;

public class FootballTourney {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String teamName=scanner.nextLine();
        int gamesPlayed=Integer.parseInt(scanner.nextLine());
        double winCount=0;
        double drawCount=0;
        double loseCount=0;
        double pointSum=0;
        double winRate=0;
        if(gamesPlayed<=0) {
            System.out.printf("%s hasn't played any games during this season.", teamName);
            return;

        }


        for(int i=1; i<=gamesPlayed; i++){

            String result=scanner.nextLine();
            if(result.equals("W")){
                winCount++;

            }else if(result.equals("D")){
                drawCount++;
            }else if(result.equals("L")){
                loseCount++;
            }



        }
        pointSum=(winCount*3)+(drawCount*1)+(loseCount*0);
        System.out.printf("%s has won %.0f points during this season.\n",teamName,pointSum);
       winRate=(winCount/gamesPlayed)*100;
        System.out.printf("Total stats:\n## W: %.0f\n## D: %.0f\n## L: %.0f\n",winCount,drawCount,loseCount);
        System.out.printf("Win rate: %.2f%%",winRate);


    }
}
