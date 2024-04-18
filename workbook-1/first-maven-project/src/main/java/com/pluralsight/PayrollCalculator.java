package com.pluralsight;


import java.util.Scanner;

public class PayrollCalculator {

public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("Enter Name:");
    String name = scan.nextLine();

    System.out.println("Enter Hours Worked:");
    int hours = scan.nextInt();

    System.out.println("Enter pay rate:");
    double pay = scan.nextDouble();

    double grossPay = hours * pay;
    System.out.println("Total gross pay: " + grossPay);
    grossPay = scan.nextDouble();


}
}
