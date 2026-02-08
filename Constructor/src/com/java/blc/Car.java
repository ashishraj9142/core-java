package com.java.blc;

public class Car {
  private String model;
  private int year;
  private double price;
  public Car(String model, int year, double price) {
		super();
		this.model = model;
		this.year = year;
		this.price = price;
		if(year<2011) {
			System.out.println("year must be greater than 2010");
			System.exit(0);
		}
		if(price<0) {
			System.out.println("Price must be positive integer ");
			System.exit(0);
		}
	}
	public String toString() {
		return "Car [model=" + model + ", year=" + year + ", price=" + price + "]";
	}

}
