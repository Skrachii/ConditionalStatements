package com.telerikacademy.ConditionalStatements.Homework;

import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int score = Integer.parseInt(scan.nextLine());
        if (score >= 1 && score <= 3) {
            System.out.println(score = score * 10);
        } else if (score >= 4 && score <= 6) {
            System.out.println(score = score * 100);
        } else if (score >= 7 && score <= 9) {
            System.out.println(score = score * 1000);
        } else {
            System.out.println("Invalid score");
        }
    }
}
