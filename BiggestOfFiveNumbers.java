package com.telerikacademy.ConditionalStatements.Homework;

import java.util.Scanner;

public class BiggestOfFiveNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = Double.parseDouble(scan.nextLine());
        double b = Double.parseDouble(scan.nextLine());
        double c = Double.parseDouble(scan.nextLine());
        double d = Double.parseDouble(scan.nextLine());
        double e = Double.parseDouble(scan.nextLine());
        if (a > b && a > c && a > d && a > e){
            System.out.println(a);
        }
        else if (b > a && b > c && b > d && b > e){
            System.out.println(b);
        }
        else if (c > a && c > b && c > d && c > e){
            System.out.println(c);
        }
        else if (d > a && d > b && d > c && d > e){
            System.out.println(d);
        }
        else{
            System.out.println(e);
        }
    }
}
