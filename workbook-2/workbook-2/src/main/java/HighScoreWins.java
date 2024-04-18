import java.util.Scanner;
import java.util.regex.Pattern;

public class HighScoreWins {

    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter name of home team:");
        String home = scan.nextLine();

        System.out.println("Enter name of visitors team:");
        String visitors = scan.nextLine();

        System.out.println("Enter points of home team:");
        int homePoints = scan.nextInt();

        System.out.println("Enter points of visitors team:");
        int visitorPoints = scan.nextInt();

        String input = "home:visitors|homePoints:visitorPoints";
        input = scan.nextLine();


        String[] points = input.split(Pattern.quote(":|:"));
        for(String p: points)
            System.out.println(p);

         home = points[0];
         visitors = points[1];
         homePoints = Integer.parseInt(points[2]);
        visitorPoints = Integer.parseInt(points[3]);


    }

}
