package com.pluralsight;

import java.util.Scanner;

public class MathApp {

    public static void main(String[] args) {

        int bobSalary = 50000, garySalary = 70000;

        int highestSalary = Math.max(bobSalary, garySalary);

        System.out.println("The highest salary is " + highestSalary);

             // carPrice
        double carPrice = 32000.99, truckPrice = 60000.99;

        double lowestPrice = Math.min(carPrice, truckPrice);

        System.out.println("The lowest Price is " + lowestPrice);

        double radius,area;
        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius of the circle");
        radius = input.nextDouble();
        input.close();

        area = Math.PI * radius * radius;

        System.out.println("Area of the Circle is "+area);

        double square = 5.0;
        double squareRoot = Math.sqrt(square);
        System.out.println("The square root of a variable if set to 5.0 is "+ squareRoot);

        int x1 =5, x2=85, y1=10, y2=50;
        double distance;
        int xm = x2-x1;
        int ym = y2-y1;

        distance= Math.sqrt(Math.pow(xm, 2) + Math.pow(ym, 2) );
        System.out.println(distance);

        double x = -3.8;
        double value = Math.abs(x);
        System.out.println("The absolute value is " +value);

        double random1 = Math.random();
        double random2 = Math.random();

        System.out.println("First Random Number: " + random1);
        System.out.println("Second Random Number: " + random2);

        }


    }



