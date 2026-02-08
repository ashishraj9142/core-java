package deepCopy;

import java.util.Scanner;

class Product{
	private double price;
	
	public Product() {
		
	}
	
	public Product(double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Product [price=" + price + "]";
	}
	
}
public class Deep01 {
	public static void main(String[] args) {
		Product p1 = new Product();
		
		Scanner sc = new Scanner(System.in);
		Product p2 = new Product();
		double price = sc.nextDouble();
		p2.setPrice(price);  //500
		
		System.out.println("enitial price: ");
		System.out.println("p1: "+p1+"  "+"p2:"+p2);
		p1.setPrice(p2.getPrice());
		
		System.out.println("after changes: ");
		System.out.println("p1:"+p1+"  "+"p2: "+p2); // p1->500, p2 -> 500		
		
		double price01 = sc.nextDouble();
		System.out.println("after p2 changes price: ");
		p2.setPrice(price01);  //1000
		System.out.println("p1:"+p1+"  "+"p2: "+p2);  // p1-> 500, p2-. 1000
		sc.close();
		
	}

}
