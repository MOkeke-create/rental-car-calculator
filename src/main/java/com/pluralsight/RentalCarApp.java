package com.pluralsight;

import java.util.Scanner;

public class RentalCarApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String pickupDate = getPickupDate(input);
        int rentalDays = getRentalDays(input);
        boolean tollTag = getTollTag(input);
        boolean Gps = getGps(input);
        boolean roadside = getRoadside(input);
        int age = getAge(input);


    }
    public static String getPickupDate(Scanner input){
        System.out.print("Enter pickup date: ");
        return input.nextLine();
    }
    public static int getRentalDays(Scanner input) {
        System.out.print("Enter the number of days: ");
        return input.nextInt();
    }
    public static boolean getTollTag(Scanner input) {
        System.out.print("Would you like to add a TollTag? (Y/N) ");
        String answer = input.next();
        return answer.equalsIgnoreCase("Y");
    }
    public static boolean getGps(Scanner input) {
        System.out.print("Would you like to include GPS? (Y/N) ");
        String answer = input.next();
        return answer.equalsIgnoreCase("Y");
    }
    public static boolean getRoadside(Scanner input) {
        System.out.print("Would you like to add roadside assistance? (Y/N) ");
        String answer = input.next();
        return answer.equalsIgnoreCase("Y");
    }
    public static int getAge(Scanner input) {
        System.out.print("Enter age: ");
        return input.nextInt();
    }
}
