import java.util.Scanner;

public class CellPhoneServiceDriver {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        CellPhoneService cp1 = new CellPhoneService();
        System.out.println("What is the serial number?");
        long serial = scan.nextLong();
       // cp1.setSerial();
        System.out.println();

    }

}
