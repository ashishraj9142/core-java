package com.Overloading.paymentMethod;

import java.util.Scanner;

class Payment{
	  // 1) Cash Payment
    public void makePayment(double amount) {
        if (!validateAmount(amount)) {
            return;
        }

        System.out.println("Processing payment via Cash...");
        System.out.println("Amount Paid RS :" + amount);
        System.out.println("Payment Successful!");
    }

    // 2) Credit Card Payment
    public void makePayment(String cardHolderName, String creditCardNumber, double amount) {
        if (!validateCardNumber(creditCardNumber)) {
            System.out.println("Error: Invalid card number. It must be 16 digits.");
            return;
        }

        if (!validateAmount(amount)) {
            return;
        }

        System.out.println("Processing payment via Credit Card...");
        System.out.println("Card Holder: " + cardHolderName);
        System.out.println("Card Number: " + maskCardNumber(creditCardNumber));
        System.out.println("Amount Paid RS :" + amount);
        System.out.println("Payment Successful!");
    }

    // 3) Debit Card Payment
    public void makePayment(String debitCardNumber, double amount) {
        if (!validateCardNumber(debitCardNumber)) {
            System.out.println("Error: Invalid card number. It must be 16 digits.");
            return;
        }

        if (!validateAmount(amount)) {
            return;
        }

        System.out.println("Processing payment via Debit Card...");
        System.out.println("Card Number: " + maskCardNumber(debitCardNumber));
        System.out.println("Amount Paid RS :" + amount);
        System.out.println("Payment Successful!");
    }

    // Helper Method 1
    private boolean validateAmount(double amount) {
        if (amount <= 0) {
            System.out.println("Error: Amount must be greater than zero.");
            return false;
        }
        return true;
    }

    // Helper Method 2
    private boolean validateCardNumber(String cardNumber) {
        if (cardNumber == null || cardNumber.length() != 16) {
            return false;
        }
        return cardNumber.matches("\\d{16}");
    }

    // Helper Method 3
    private String maskCardNumber(String cardNumber) {
        String last4 = cardNumber.substring(12);
        return "****-****-****-" + last4;
    }
}


public class PaymentProcess {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Payment payment = new Payment();

        System.out.println("Payment Menu");
        System.out.println("Please select any one Payment Method from the Menu :");
        System.out.println("\t\t 1) Payment by using Cash");
        System.out.println("\t\t 2) Payment by using Credit Card");
        System.out.println("\t\t 3) Payment by using Debit Card");

        System.out.println("Please enter your Payment choice [1/2/3]");
        int choice = sc.nextInt();
        sc.nextLine(); // clear buffer

        switch (choice) {
            case 1:
                System.out.println("Enter the amount you want to pay through cash :");
                double cashAmount = sc.nextDouble();
                payment.makePayment(cashAmount);
                break;

            case 2:
                System.out.println("Enter your name :");
                String name = sc.nextLine();

                System.out.println("Enter your 16 digit Credit Card Number :");
                String creditCard = sc.nextLine();

                System.out.println("Enter your Payment Amount :");
                double creditAmount = sc.nextDouble();

                payment.makePayment(name, creditCard, creditAmount);
                break;

            case 3:
                System.out.println("Enter your 16 digit Debit Card Number :");
                String debitCard = sc.nextLine();

                System.out.println("Enter your Payment Amount :");
                double debitAmount = sc.nextDouble();

                payment.makePayment(debitCard, debitAmount);
                break;

            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }

	}


