package Shallow_copy;

import java.util.Scanner;

public class ShallowCopyDemo {
	public static void main(String[]args) 
	{   
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Brand :");
		String brand = sc.nextLine();
		
		System.out.println("Enter the price :");
		double price = Double.parseDouble(sc.nextLine());

		Laptop lap1 = new Laptop(brand, price);
		System.out.println(lap1);
		
		Laptop lap2 = lap1;
		System.out.println("========lap2 details=======");

		System.out.println(lap2);
		System.out.println("enter the brand name for lap2: ");
		String brand1 = sc.nextLine();
		lap2.setBrand(brand1);
		
		System.out.println("enter the price for lap02: ");
		double price01 = sc.nextDouble();
		lap2.setPrice(price01);
		System.out.println("========lap2 details=======");
		System.out.println(lap2);
		System.out.println("======lap1 details=======");
		System.out.println(lap1);
		sc.close();
	}

}

class Laptop {
	private String brand;
	private double price;

	public Laptop(String brand, double price) {
		super();
		this.brand = brand;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", price=" + price + "]";
	}

}
