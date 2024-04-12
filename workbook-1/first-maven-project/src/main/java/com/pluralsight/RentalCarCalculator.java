package com.pluralsight;

import java.util.Scanner;

public class RentalCarCalculator {

   static Scanner input = new Scanner(System.in);
    static Scanner scan = new Scanner(System.in);
     String pickupDate;
    static int days;
     double tollTag = 3.95;
     double gps = 2.95;
     double roadside;
     int age;
   static  double total = 0.0;
     double underage;
    static double basicCarRental = 29.99;
     double SuperchargeCost = 0.3;


    static public void main(String[] args){

        System.out.println("Enter Car Rental Pick Up Date");
        int pickupDate = scan.nextInt();

        System.out.println("How many days do you want to book it for?");
        int days = input.nextInt();

        System.out.println("Do you want an electronic toll tag at $3.95/day? (yes/no)");
        String tollTag = scan.nextLine();


        System.out.println("Would you like a GPS at $2.95/day? (yes/no)");
        String gps = scan.nextLine();

        System.out.println("Would You like to add road assistance at $3.95/day? (yes/no)");
        String roadside = scan.nextLine();

        System.out.println("How old are you?");
        int age = input.nextInt();

        System.out.println("Amount due is $" + total);



    }

    static public void carRental(){
        total = days * basicCarRental;


    }


}
