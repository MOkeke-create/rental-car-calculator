package com.pluralsight;

import java.util.Scanner;

public class RentalCarApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String getPickupDate = getPickupDate(input);
        int getRentalDays = getRentalDays(input);
        boolean getTollTag = getTollTag(input);
        input.hasNextBoolean();
        boolean getGps = getGps(input);
        input.hasNextBoolean();
        boolean getRoadside = getRoadside(input);
        int getAge = getAge(input);


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
        System.out.print("Do you want an electronic Toll tag? (Y/N): ");
        return input.hasNextBoolean();
    }
    public static boolean getGps(Scanner input) {
        System.out.print("Would you like to include GPS? (Y/N) ");
        return input.hasNextBoolean();
    }
    public static boolean getRoadside(Scanner input) {
        System.out.print("Would you like to add roadside assistance? (Y/N) ");
        return input.hasNextBoolean();
    }
    public static int getAge(Scanner input) {
        System.out.print("Enter age: ");
        return input.nextInt();
    }
}
