import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheatreReservations {

    static Scanner scan = new Scanner(System.in);

    public static void main(String [] args){

        ticketInfo();
        date();


    }



    public static void ticketInfo(){

        System.out.println("Enter your name: ");
        String name = scan.nextLine();

        System.out.println("Enter date of reservation: ");
        String reservation = scan.nextLine();

        System.out.println("Enter num of tickets: ");
        int tickets = scan.nextInt();

        System.out.println(tickets+" reserved for "+reservation+" under "+name);
       String personReservation = scan.nextLine();

    }

    public static void date(){

        String userInput;
        DateTimeFormatter formatter;

        userInput = "";
        formatter = DateTimeFormatter.ofPattern("mm/dd/yyyy");
        LocalDate tickets = LocalDate.parse(userInput, formatter);

    }


}
