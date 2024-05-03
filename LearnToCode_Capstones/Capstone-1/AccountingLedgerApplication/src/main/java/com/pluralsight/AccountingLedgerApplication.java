package com.pluralsight;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;



public class AccountingLedgerApplication {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        // Menu
        ArrayList<Ledger> Ledger = reportScreenInfo();

        System.out.println("Welcome to the accounting ledger!");
        int command;
        System.out.println("1 - Add Deposit ");
        double addDeposit;
        System.out.println("2 - Make Payment (Debit) ");
        double makePayment;
        System.out.println("3 - Ledger ");
        System.out.println("4 - Exit");


        command = in.nextInt();
        while (command != 5) {
            switch (command) {
                case 1:
                    addDeposit(Ledger);
                    break;
                case 2:
                    makePayment(Ledger);
                    break;
                case 3:
                    ledgers();
                    break;
                case 4:
                    System.out.println("Welcome to the accounting ledger!");
                    System.out.println("1 - Add Deposit ");
                    System.out.println("2 - Make Payment (Debit) ");
                    System.out.println("3 - Ledger ");
                    System.out.println("4 - Exit");
                    command = in.nextInt();
                    break;
                case 5:
                    return;
            }


        }

    }

    private static ArrayList<Ledger> reportScreenInfo() {

        return null;
    }


    private static void addDeposit(ArrayList<Ledger> homeScreens) {

        System.out.println("How much would you like to deposit?");
        double depositAmount = in.nextDouble();

        System.out.println("Enter the date deposit was made (mm/dd/yyyy)");
        String dateStr = in.next();
        SimpleDateFormat sdf = new SimpleDateFormat();


        System.out.println("Enter the time the deposit was made HH:MM:SS\n");
       String depositTime = in.nextLine();
        System.out.println("Enter the description");
        String depositDescription = in.nextLine();
        System.out.println("Enter the vendor");
        String depositVendor = in.nextLine();
        //try {
         //   Date date = sdf.parse(dateStr);
           // System.out.println("input date: " + sdf.format(date));
        //} catch (ParseException ignored) {

      //  }


        String[] depositInfo = {dateStr, depositTime, depositDescription, depositVendor, String.valueOf(depositAmount)};
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("transactions.csv"));
            for (String depositInf : depositInfo) {
                writer.write("\n" + depositInf);
            }
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    private static void makePayment(ArrayList<Ledger> homeScreen) {
        Scanner in = new Scanner(System.in);


        System.out.println("Whats the payment amount?");
        double paymentAmount = in.nextDouble();
        System.out.println(paymentAmount);
        in.nextLine();
        System.out.println("Enter the time the payment was made");
        String paymentTime = in.nextLine();
        System.out.println("Enter the description");
        String paymentDescription = in.nextLine();
        System.out.println("Enter the vendor");
        String paymentVendor = in.nextLine();
        System.out.println("Enter the date payment was made (mm/dd/yyyy)");
        String datePaymentStr = in.nextLine();

        SimpleDateFormat sdf = new SimpleDateFormat();
        try {
            Date datePayment = sdf.parse(datePaymentStr);
            System.out.println("input date: " + sdf.format(datePayment));
        } catch (ParseException e) {
            System.out.println("Invalid date format");
        }
        in.close();

        String[] paymentInfo = {datePaymentStr, paymentTime, paymentDescription, paymentVendor, String.valueOf(paymentAmount)};
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("transactions.csv"));
            for (String paymentInf : paymentInfo) {
                writer.write("\n" + paymentInf);
            }
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    private static void ledgers() {
        Scanner in = new Scanner(System.in);

        ArrayList<Ledger> Ledger = reportScreenInfo();

        System.out.println("You're now in the ledger.");
        int command;
        System.out.println("1 - Deposits");
        double addDeposit;
        System.out.println("2 - Payments");
        double makePayment;
        System.out.println("3 - Reports");
        System.out.println("4 - Home");


        command = in.nextInt();
        while (command != 5) {
            switch (command) {
                case 1:
                    addDeposit(Ledger);
                    break;
                case 2:
                    makePayment(Ledger);
                    break;
                case 3:
                    ledgers();
                    break;
                case 4:
                    System.out.println("You're now in the ledger.");
                    System.out.println("1 - Deposits");
                    System.out.println("2 - Payments");
                    System.out.println("3 - Reports");
                    System.out.println("4 - Home");
                    command = in.nextInt();

                    break;
                case 5:
                    return;


            }


        }
    }
}

    