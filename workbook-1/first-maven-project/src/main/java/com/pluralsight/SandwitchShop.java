package com.pluralsight;

import java.util.Scanner;

public class SandwitchShop {

    static Scanner scan = new Scanner(System.in);

    static double Regular = 5.45;
    static double Large = 8.95;
    static int Age;
    static double Discount;
    static double Total;
    static double basePrice;

    static public void main(String[] args) {

        System.out.println("What sandwitch size do you want?");
        System.out.println("Regular or Large?");
        int Size = scan.nextInt();
        scan.nextLine();

        System.out.println("Loaded? (yes/no)");
        String loaded = scan.next();
        scan.nextLine();



        if (Size == Regular && Age >= 17 && loaded.equalsIgnoreCase("no")) {
            studentReg();
        } else if (Size == Large && Age >= 17 && loaded.equalsIgnoreCase("no")) {
            studentLarge();
        } else if (Size == Regular && Age >= 17 && loaded.equalsIgnoreCase("yes")) {
            studentLoadedReg();
        } else if (Size == Large && Age >= 17 && loaded.equalsIgnoreCase("yes")) {
            studentLoadedLarge();
        } else if (Size == Regular && Age <= 65 && loaded.equalsIgnoreCase("no")) {
            seniorReg();
        } else if (Size == Regular && Age <= 65 && loaded.equalsIgnoreCase("yes")) {
            seniorLoadedReg();
        } else if (Size == Large && Age <= 65 && loaded.equalsIgnoreCase("no")) {
            seniorLarge();
        } else if (Size == Large && Age <= 65 && loaded.equalsIgnoreCase("yes")) {
            seniorLoadedLarge();
        }
        else {
            Total = basePrice;
        }


    }

        public static void studentReg(){

        Discount = Regular *.10;
        Total = Regular - Discount;

        }

    public static void studentLoadedReg(){

        Discount = Regular + 1 *.10;
        Total = Regular + 1 - Discount;

    }

    public static void studentLarge(){

        Discount = Large *.10;
        Total = Large - Discount;

    }

    public static void studentLoadedLarge(){

        Discount = Large + 1.75 *.10;
        Total = Large + 1.75 - Discount;

    }

    public static void seniorReg(){

        Discount = Regular *.10;
        Total = Regular - Discount;

    }

    public static void seniorLarge(){

        Discount = Large *.10;
        Total = Large - Discount;

    }


    public static void seniorLoadedReg(){

        Discount = Regular + 1 *.10;
        Total = Regular + 1 - Discount;

    }

    public static void seniorLoadedLarge(){

        Discount = Large + 1.75 *.10;
        Total = Large + 1.75 - Discount;

    }



public static void basePrice(){

        basePrice = 0;

    }



public static void printTotal(){
        System.out.println("The total is $" + Total);
}

}


