package com.telerikacademy.ConditionalStatements;

import java.util.Scanner;

public class Demo_3HighestToLowestNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a1 = Integer.parseInt(scan.nextLine());
        int a2 = Integer.parseInt(scan.nextLine());
        int a3 = Integer.parseInt(scan.nextLine());

        if (a1 > a2 && a1 > a3) {
            System.out.println(a1);
            if (a2 > a3) {
                System.out.println(a2);
                System.out.println(a3);
            } else {
                System.out.println(a3);
                System.out.println(a2);
            }
        }
        else if (a2 > a1 && a2 > a3) {
            System.out.println(a2);
            if (a1 > a3) {
                System.out.println(a1);
                System.out.println(a3);
            } else {
                System.out.println(a3);
                System.out.println(a1);
            }
        }
        if (a3 > a2 && a3 > a1) {
            System.out.println(a3);
            if (a1 > a2) {
                System.out.println(a1);
                System.out.println(a2);
            } else {
                System.out.println(a2);
                System.out.println(a1);
            }
        }
    }
}