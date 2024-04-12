package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator2 {

    static Scanner scan = new Scanner(System.in);

    static String Name;
    static int Hours;
    static double Pay;
    static String Overtime;





    public static void main(String[]args){
        System.out.println("Enter Name");
        Name = scan.nextLine();

        System.out.println("Enter Hours Worked");
        Hours = scan.nextInt();

        System.out.println("Enter Pay Rate");
        Pay = scan.nextDouble();

        System.out.println("Did you work overtime this week? (Yes/No)");
        Overtime = scan.nextLine();

        if (Overtime.equalsIgnoreCase("yes")) {
            yesOvertime();
        } else if (Overtime.equalsIgnoreCase("no")) {
            noOverime();
        }



    }

    public static void noOverime() {
        double grossPay = Hours * Pay;

        System.out.println(Name + "'s" + "Gross Pay: $" + grossPay);


    }

    public static void yesOvertime() {
        System.out.println ("How many hours worked part time?");
        int overtimeHours = scan.nextInt();

        double overtimePay = Pay * 1.5;

        double grossPay = (overtimeHours + overtimePay) + (Hours * Pay);

        System.out.println(Name + "'s" + "Gross Pay: $" + grossPay);

    }


}
