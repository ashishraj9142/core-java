package com.nit.treeMap;

import java.util.ArrayList;
import java.util.Collections;

public class SortingArrayList {

	public static void main(String[] args) {
		ArrayList<Product> list = new ArrayList<Product>();
		list.add(new Product("Pencil",10,2020));
		list.add(new Product("Pen",25,2010));
		list.add(new Product("Book", 24,2010));
		Collections.sort(list);
		System.out.println(list);

	}

}
class Product implements Comparable<Product>
{
	String name;
	double price;
	int manufacturig;
	public Product(String name, double price,int manufacturig) {
		super();
		this.name = name;
		this.price = price;
		this.manufacturig=manufacturig;
	}
	
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", manufacturig=" + manufacturig + "]";
	}

	@Override
	public int compareTo(Product o) {
		
		return (int)(this.manufacturig-o.manufacturig);
	}
}