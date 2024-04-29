import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class HighScoreWins {

    static Scanner scan = new Scanner(System.in);

    static String gameScore;
    static String winner;


    public static void main(String[] args){

        enterScore();

        parseGameScore();


    }


    public static void enterScore(){

        System.out.println("Enter name of home team:");
        String tm1 = scan.nextLine();

        System.out.println("Enter name of visitors team:");
        String tm2 = scan.nextLine();

        System.out.println("Enter points of home team:");
        int tm1Score = scan.nextInt();

        System.out.println("Enter points of visitors team:");
        int tm2Score = scan.nextInt();

        System.out.print("Game score : "+tm1+":"+tm2+"|"+tm1Score+":"+tm2Score);
        gameScore = scan.nextLine();





    }



    public static void parseGameScore(){

        String[] gameParts = gameScore.split("\\|");
        String teamPart = gameParts[0];
        String scorePart = gameParts[1];

        String[] tm = scorePart.split(":");
        String tm1 = tm[0];
        String tm2 = tm[1];

        String[] teamScore = scorePart.split(":");
        int tm1Score = Integer.parseInt(teamScore[0]);
        int tm2Score = Integer.parseInt(teamScore[1]);

        winner = (tm1Score > tm2Score) ? tm1 : tm2;



    }


    }



