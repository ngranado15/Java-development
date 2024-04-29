import java.util.Scanner;

public class FullNameApplication {

    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        String firstName, middleName, lastName, suffix, fullName = "";


        System.out.println("Enter first name.");
         firstName = scan.nextLine();
         firstName = firstName.trim();


        System.out.println("Enter middle name, if none hit enter!");
         middleName = scan.nextLine();
         middleName = middleName.trim();


        System.out.println("Enter last name.");
         lastName = scan.nextLine();
         lastName = lastName.trim();

        System.out.print("Enter suffix, if none hit enter!.");
         suffix = scan.nextLine();





        System.out.println(firstName+ " " + middleName+ " " + lastName + ", " + suffix);


    }

}
