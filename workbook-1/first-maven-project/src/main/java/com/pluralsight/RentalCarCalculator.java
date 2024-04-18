package com.pluralsight;

import java.util.Scanner;

public class RentalCarCalculator {


    static public void main(String[] args){

         Scanner input = new Scanner(System.in);
         Scanner scan = new Scanner(System.in);
        String pickupDate;
        int days;
        String tollTag;
        String gps;
        double gpsAmount = 2.95;
        String roadSide;
        double roadSideAmount = 3.95;
        int age;
        double total = 0.0;
         double basicCarRental = 29.99;
        double superChargeCost = 0.3;
        double tollTagAmount = 3.95;


        System.out.println("Enter Car Rental Pick Up Date");
        pickupDate = scan.nextLine();

        System.out.println("How many days do you want to book it for?");
        days = input.nextInt();
        total = total + (days*basicCarRental);

        System.out.println("Do you want an electronic toll tag at $3.95/day? (yes/no)");
        tollTag = scan.nextLine();
        switch(tollTag){
            case "yes":
                total = total + (tollTagAmount * days);
                break;
        }


        System.out.println("Would you like a GPS at $2.95/day? (yes/no)");
        gps = scan.nextLine();
        switch(gps){
            case "yes":
                total = total + (gpsAmount*days);
                break;
        }

        System.out.println("Would You like to add road assistance at $3.95/day? (yes/no)");
        roadSide = scan.nextLine();
        switch (roadSide){
            case "yes":
                total = total + (roadSideAmount*days);
                break;
        }

        System.out.println("How old are you?");
        age = input.nextInt();
        if (age < 25)
            total = total + (basicCarRental * superChargeCost);


        System.out.println("Total cost is: " +total);
        total = scan.nextDouble();



    }






}
