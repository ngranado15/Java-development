import java.util.Scanner;

public class FullNameParser {

    public static void main(String []args){

        Scanner scan = new Scanner(System.in);

        String fullName;
        String nameArray[];



        System.out.println("Enter full name:");
          fullName = scan.nextLine();
          fullName = fullName.trim();
          nameArray = fullName.split(" ");

          if (nameArray.length==2){
              System.out.println("First name: " +nameArray[0]);
              System.out.println("Middle name: (n/a)");
              System.out.println("Last name: "+ nameArray[1]);
          } else {
              System.out.println("First name: "+ nameArray[0]);
              System.out.println("Middle name: "+ nameArray[1]);
              System.out.println("Last name: "+ nameArray[2]);
          }

          System.out.println("Full name is: "+ fullName);
            fullName = scan.nextLine();


    }

}
