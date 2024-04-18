package com.pluralsight;

import java.util.Scanner;


public class SandwitchShop {

    static public void main(String[] args) {

        Scanner input = new Scanner(System.in);


         int age, size;
         String loaded;

        System.out.println("What sandwich size do you want?");
        System.out.println("Enter a size Regular 1: base price 5.45 or Large 2: base price 8.95?");
        size = input.nextInt();
        input.nextLine();


        System.out.println("Loaded? (yes/no)");
         loaded = input.nextLine();

         System.out.println("Enter your age: ");
         age = input.nextInt();
         totalCost(size, loaded, age);



    }

  public static void totalCost(int usersChoice, String loaded, int age){

        double basePrice =0;
        double discount = 0;
        double cost = 0;

        if (loaded.equals("yes")){
            if (usersChoice == 1){
                basePrice = 6.45;
            } else if (usersChoice == 2){
                basePrice = 10.70;
            } else {
                basePrice = 0;
            }
        } else {
            if (usersChoice == 1){
                basePrice = 5.45;
            } else if (usersChoice == 2){
                basePrice = 8.95;
            } else {
                basePrice = 0;
            }
        }

        if (age <= 17){
            discount = 0.1;
            cost = basePrice * discount;
        } else if (age >= 65) {
            discount = .2;
            cost = basePrice *discount;
        } else {
            cost = basePrice;
        }
        System.out.println("The cost of your sandwich is " +cost);

  }


}


