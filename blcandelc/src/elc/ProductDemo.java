package elc;

import java.util.Scanner;

import blc.Product;

public class ProductDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Product Id :");
		int id = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter the Product Name :");
		String name = sc.nextLine();
		
		System.out.println("Enter the Product price");
		double salary = Double.parseDouble(sc.nextLine());
		Product p1 = new Product();
		p1.setProductDetails(id, name, salary);
		System.out.println(p1.customerDetails());
		p1.calculateDiscount();
		sc.close();
		
		

	}

}
