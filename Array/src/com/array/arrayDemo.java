package com.array;

import java.util.Scanner;

public class arrayDemo {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of the player object :");
	int size = Integer.parseInt(sc.nextLine());
	Player p1[] = new Player[size];
	//Initializing the array by using for loop
	for(int i=0;i<size;i++) {
		System.out.println("Enter Player Id :");
		int id = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter the player name :");
		String name = sc.nextLine();
		
		System.out.println("Enter the player base price :");
		double price = Double.parseDouble(sc.nextLine());
	    
		p1[i]=new Player(id, name, price);
	}
	System.out.println("printing the Player Object :");
	for (Player p2 : p1) {
		System.out.println(p2);
	}
	sc.close();
}
}
class Player
{
private int id;
private String name;
private double price;
public Player(int id,String name,double price) {
	this.id=id;
	this.name=name;
	this.price=price;
   }
public String toString() {
	return "Player[id="+id+",name="+name+", price="+price+"]";
   }

}