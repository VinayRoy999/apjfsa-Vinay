package com.apjfsa;

import java.util.Scanner;

public class StudentResult {

    static void printDay(int d) {
        switch (d) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid Number");
        }
    }

    public static void main(String[] args) {
        int dayNo;

        System.out.println("Enter a day Number:");
        Scanner scanner = new Scanner(System.in);
        dayNo = scanner.nextInt();

        printDay(dayNo);

        // Additional test cases
        printDay(0); // Invalid Number
        printDay(3); // Tuesday
    }
}
