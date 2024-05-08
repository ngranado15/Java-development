package com.pluralsight;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


public class AccountingLedgerApplication {
    static Scanner in = new Scanner(System.in);

    public static void main(String args[]){
        homeScreen();
    }


    public static void homeScreen() {

        ArrayList<HomeScreen> homeSc = dataCollection();

        //home screen
        System.out.println("Welcome to the accounting ledger!");
        int select;
        System.out.println("1 - Add Deposit ");
        System.out.println("2 - Make Payment (Debit) ");
        int makePayment;
        System.out.println("3 - Ledger ");
        int ledger;
        System.out.println("4 - Exit");
        System.out.printlng("Enter one of the numbers above.");

        select = in.nextInt();

        while (select != 6) {
            switch (select) {
                case 1:
                    addDeposit(homeSc);
                    break;
                case 2:
                    makePayment(homeSc);
                    break;
                case 3:
                    ledger(homeSc);
                    break;
                case 4:
                    System.out.println("Welcome to the accounting ledger!");
                    System.out.println("1 - Add Deposit ");
                    System.out.println("2 - Make Payment (Debit) ");
                    System.out.println("3 - Ledger ");
                    System.out.println("4 - Exit");
                    select = in.nextInt();
                    break;

                case 5:
                    return;


            }


        }


    }

    public static ArrayList<HomeScreen> dataCollection() {

        return null;
    }


    public static void ledger(ArrayList<HomeScreen> homeSc) {
        Scanner in = new Scanner(System.in);

        ArrayList<HomeScreen> ledgerSc = ledgerScReports();

        System.out.println("You're now in the ledger.");
        int selecting;
        System.out.println("1 - Display all Entries");
        System.out.println("2 - Display all payments (Negative Entries)");
        System.out.println("3 - Reports");
        System.out.println("4 - Home");


        selecting = in.nextInt();
        while (selecting != 5) {
            switch (selecting) {
                case 1:
                    displayEntries(ledgerSc);
                    break;
                case 2:
                    displayPayments(ledgerSc);
                    break;
                case 3:
                    reports(ledgerSc);
                    break;
                case 4:
                    System.out.println("You're now in the ledger.");
                    System.out.println("1 - Display all entries");
                    System.out.println("2 - Display all payments (Negative Entries)");
                    System.out.println("3 - Reports");
                    System.out.println("4 - Home");
                    selecting = in.nextInt();

                    break;
                case 5:
                return;

            }


        }



    }

    private static void displayPayments(ArrayList<HomeScreen> ledgerSc) {



    }

    private static void displayEntries(ArrayList<HomeScreen> ledgerSc) {

        try {
            BufferedReader reader = new BufferedReader(new FileReader("transactions.csv"));
            String line;
            while((line = reader.readLine())!= null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static ArrayList<HomeScreen> ledgerScReports() {
        return null;
    }

    private static void reports(ArrayList<HomeScreen> ledgerSc) {
    }

    public static void makePayment(ArrayList<HomeScreen> homeSc) {
        Scanner in = new Scanner(System.in);


        System.out.println("Whats the payment amount?");
        double paymentAmount = in.nextDouble();
        System.out.println(paymentAmount);
        in.nextLine();
        System.out.println("Enter the time the payment was made (hh:mm:ss)");
        String paymentTime = in.nextLine();
        System.out.println("Enter the description");
        String paymentDescription = in.nextLine();
        System.out.println("Enter the vendor");
        String paymentVendor = in.nextLine();
        System.out.println("Enter the date payment was made (mm/dd/yyyy)");
        String datePaymentStr = in.nextLine();




        String[] paymentInfo = {datePaymentStr+"|"+paymentTime+"|"+paymentDescription+"|"+paymentVendor+"|"+String.valueOf(paymentAmount)};
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("transactions.csv"));
            for (String paymentInf : paymentInfo) {
                writer.write("\n" + paymentInf);
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

     homeScreen();

    }

    public static void addDeposit(ArrayList<HomeScreen> homeSc) {
        System.out.println("How much would you like to deposit?");
        double depositAmount = in.nextDouble();

        System.out.println("Enter the date deposit was made (mm/dd/yyyy)");
        String dateStr = in.next();
        SimpleDateFormat sdf = new SimpleDateFormat();
        in.nextLine();
        System.out.println("Enter the time the deposit was made HH:MM:SS");
        String depositTime = in.nextLine();
        System.out.println("Enter the description");
        String depositDescription = in.nextLine();
        System.out.println("Enter the vendor");
        String depositVendor = in.nextLine();
        try {
            Date date = sdf.parse(dateStr);
            System.out.println("input date: " + sdf.format(date));
        } catch (ParseException ignored) {

        }


        String[] depositInfo = {dateStr + "|" + depositTime + "|" + depositDescription + "|" + depositVendor + "|" + String.valueOf(depositAmount)};
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("transactions.csv"));
            for (String depositInf : depositInfo) {
                writer.write("\n" + depositInf);
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


       homeScreen();
    }


}