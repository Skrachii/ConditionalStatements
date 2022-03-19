package com.telerikacademy.ConditionalStatements.Homework;

import java.util.Scanner;

public class BeerTime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter beer time hour in hh:mm aa format");
        String wishTime = scan.nextLine();
        if (wishTime.length() > 8) {
            System.out.println("wrong input");
        } else if (wishTime.substring(0, 2).equals("13") || wishTime.substring(0, 2).equals("14") || wishTime.substring(0, 2).equals("15") ||
                wishTime.substring(0, 2).equals("16") || wishTime.substring(0, 2).equals("17") || wishTime.substring(0, 2).equals("18") ||
                wishTime.substring(0, 2).equals("19") || wishTime.substring(0, 2).equals("20") || wishTime.substring(0, 2).equals("21") ||
                wishTime.substring(0, 2).equals("22") || wishTime.substring(0, 2).equals("23") || wishTime.substring(0, 2).equals("24")) {
            System.out.println("wrong time");
        } else if (wishTime.substring(0, 2).equals("12") && wishTime.substring(6, 8).equals("PM")) {
            System.out.println("non beer time");
        } else if (wishTime.substring(6, 8).equals("PM")) {
            System.out.println("Beer Time");
        } else if (wishTime.substring(0, 2).equals("12") || wishTime.substring(0, 2).equals("01") || wishTime.substring(0, 2).equals("02")
                && wishTime.substring(6, 8).equals("AM")) {
            System.out.println("Beer time");
        } else if (wishTime.substring(0, 2).equals("03") && wishTime.substring(6, 8).equals("AM")) {
            System.out.println("non-beer time");
        } else {
            System.out.println("non beer time");
        }
    }
}
