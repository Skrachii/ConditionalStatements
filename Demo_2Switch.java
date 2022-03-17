package com.telerikacademy.ConditionalStatements;

import java.util.Scanner;

public class Demo_2Switch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dayNum = Integer.parseInt(scan.nextLine());
        switch (dayNum){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Workday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Not a valid day");
        }
    }
}
