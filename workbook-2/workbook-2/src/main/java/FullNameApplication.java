import java.util.Scanner;

public class FullNameApplication {

    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first name.");
        String firstName = scan.nextLine();


        System.out.println("Enter middle name, if none hit enter!");
        String middleName = scan.nextLine();


        System.out.println("Enter last name.");
        String lastName = scan.nextLine();

        System.out.println("Enter suffix, if none hit enter!.");
        String suffix = scan.nextLine();

        System.out.println(firstName+ " " + middleName+ " " + lastName + ", " + suffix);

    }

}
