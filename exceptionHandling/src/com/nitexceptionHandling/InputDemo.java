package com.nitexceptionHandling;

import java.util.Scanner;

public class InputDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Number: ");
            int n = sc.nextInt();
            System.out.println("You entered : " + n);
        } catch (Exception e) {
            System.out.println("Invalid Input");
        }

        sc.close();
    }
}
