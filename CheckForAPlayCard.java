package com.telerikacademy.ConditionalStatements.Homework;

import java.util.Scanner;

public class CheckForAPlayCard {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String card = scan.nextLine();
        switch (card){
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":
            case "10":
            case "J":
            case "Q":
            case "K":
            case "A":
                System.out.println("yes");
                break;
            default:
                System.out.println("no");
        }
    }
}
