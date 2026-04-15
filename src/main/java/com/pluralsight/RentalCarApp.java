package com.pluralsight;

import java.util.Scanner;

public class RentalCarApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String pickupDate = getPickupDate(input);
        int rentalDays = getRentalDays(input);
        double tollTag = getTollTag(input);
        double getGps = getGps(input);
        double roadside = getRoadside(input);
        int age = getAge(input);
        double baseCost = basicCarRental(rentalDays);
        double optionCost = optionsCost(rentalDays, tollTag, getGps, roadside);
        double underAgeFee = underAgeCost(age);
        double finalPrice = totalCost(baseCost, optionCost, underAgeFee);
        System.out.printf("%nBasic car rental cost: $%.2f", baseCost);
        System.out.printf("%nOptions cost: $%.2f", optionCost);
        System.out.printf("%nUnderage fee: $%.2f", underAgeFee);
        System.out.printf("%n Total cost: $%.2f", finalPrice);


    }
    public static String getPickupDate(Scanner input){
        System.out.print("Enter pickup date: ");
        return input.nextLine();
    }
    public static int getRentalDays(Scanner input) {
        System.out.print("Enter the number of days: ");
        return input.nextInt();
    }
    public static double getTollTag(Scanner input) {
        System.out.print("Would you like to add a TollTag? (Y/N) ");
        String answer = input.next();
        if(answer.equalsIgnoreCase("Y")){
            return 3.95;}
        else{ return 0;}
    }
    public static double getGps(Scanner input) {
        System.out.print("Would you like to include GPS? (Y/N) ");
        String answer = input.next();
        if (answer.equalsIgnoreCase("Y")) {
            return 2.95;
        } else {
            return 0;
        }
    }
    public static double getRoadside(Scanner input) {
        System.out.print("Would you like to add roadside assistance? (Y/N) ");
        String answer = input.next();
        if(answer.equalsIgnoreCase("Y")){
            return 3.95;}
        else{ return 0;}
    }
    public static int getAge(Scanner input) {
        System.out.print("Enter age: ");
        return input.nextInt();
    }
    public static double basicCarRental(int rentalDays){
        return 29.99 * rentalDays;
    }
    public static double underAgeCost(int age){
        if (age < 25){
            return 29.99 * .3;}
        else {return 0;}
    }

    public static double optionsCost(int rentalDays, double tollTag, double getGps, double roadside){
        double tollTagCost = rentalDays * tollTag;
        if (tollTagCost > 0){
            System.out.printf("%n Electronic toll tag: $%.2f", tollTagCost);}
        double gpsCost = rentalDays * getGps;
        if (gpsCost > 0){
            System.out.printf("%n GPS: $%.2f", gpsCost);
        }
        double roadsideCost = rentalDays * roadside;
        if (roadsideCost > 0){
            System.out.printf("%n Roadside Assistance: $%.2f", roadsideCost);}
        return tollTagCost + gpsCost + roadsideCost;
        }
        public static double totalCost(double basicCarRental, double optionsCost, double underAgeCost){
        return basicCarRental + optionsCost + underAgeCost;}
}
