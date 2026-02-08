package com.java.elc;

import java.util.Scanner;

import com.java.blc.Car;

public class CarDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Car Model :");
		String model = sc.nextLine();
		
		System.out.println("Enter Car Manufactuing :");
		int years = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter Car Price :");
		double price = Double.parseDouble(sc.nextLine());
		
		Car car1 = new Car(model, years, price);		
		String s1=car1.toString();
		
		System.out.println(s1);
		
		sc.close();

	}

}
