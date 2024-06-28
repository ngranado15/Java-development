package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class HotelOperations {


    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Employee employee1 = new Employee();
        employee1.setHoursWorked(40);
        System.out.println("What time did you start work?");
        double startTime = scanner.nextDouble();
        System.out.println("What time did you finish work?");
        double finishTime = scanner.nextDouble();
        employee1.punchTimeCard(startTime,finishTime);
        employee1.setEmployeeId(1);
        employee1.setDepartment("IT");
        employee1.setPayRate(20.00);
                /*new Employee(1,
                "Ezra Williams", "IT",
                20.00, 45);*/
        System.out.println(employee1.getHoursWorked());
        System.out.println(employee1.getOvertimeHours());
        System.out.println(employee1.getTotalPay());
        System.out.println(employee1.getRegularHours());

        Reservation res1 = new Reservation();
        res1.setRoomType("double");
        res1.setWeekend(true);
        res1.setNumberOfNights(3);
        System.out.println(res1.getPrice());
        System.out.println(res1.getReservationTotal());
    }

    public static void hotelRooms(){

        Scanner scan = new Scanner(System.in);

        ArrayList<String> hotelRooms = new ArrayList<String>();
        hotelRooms.add("room 1");
        hotelRooms.add("room 2");
        hotelRooms.add("room 3");
        hotelRooms.add("room 4");
        hotelRooms.add("room 5");
        hotelRooms.add("room 6");
        hotelRooms.add("room 7");
        hotelRooms.add("room 8");
        hotelRooms.add("room 9");
        hotelRooms.add("room 10");
        System.out.println(hotelRooms);
        System.out.println("Please select the room number you'd like to book!");
        roomsReserved();

    }

    public static void roomsReserved(){
        hotelRooms();
        int roomsReserved = 1-4;
        switch (roomsReserved){
            case 1:
                System.out.println("room 1 is unavailable");
                System.out.println("\nPlease select a different room!");
                hotelRooms();
                break;
            case 2:
                System.out.println("room 2 is unavailible");
                System.out.println("\nPlease select a different room!");
                hotelRooms();
                break;
            case 3:
                System.out.println("room 3 is unavalible");
                System.out.println("\nPlease select a different room!");
                hotelRooms();
                break;
            case 4:
                System.out.println("room 4 is unavalible");
                System.out.println("\nPlease select a different room!");
                hotelRooms();
                break;
            case 5:
                System.out.println("room 5");
                break;
            case 6:
                System.out.println("room 6");
                break;
            case 7:
                System.out.println("room 7");
                break;
            case 8:
                System.out.println("room 8");
                break;
            case 9:
                System.out.println("room 9");
                break;
            case 10:
                System.out.println("room 10");
                break;

        }
    }




    }


