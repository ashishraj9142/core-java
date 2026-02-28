package com.AbstractMethod.inLab;

import java.util.Scanner;

abstract class Cake{
	private String shape;
	private String flavor;
	private int quantity;
	public static double price = 400;
	
	
	public Cake(String shape, String flavor, int quantity) {
		super();
		this.shape = shape;
		this.flavor = flavor;
		this.quantity = quantity;
	}
	public String getShape() {
		return shape;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}

	public String getFlavor() {
		return flavor;
	}
	
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
   
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public String toString() {
	  double totalPrice = quantity*price;
		return "A "+shape+" "+flavor+" of"+" "+quantity+" KG is Ready @ Rs."+totalPrice;
	}
}	
//Inherit
class OrderedCake extends Cake {
	private String message;
	
	// No argument constructor
    public OrderedCake() {
        super("Round", "Vanila", 1);
    }
    //parameterized constructor 
    public OrderedCake(String shape,String flavor,int quantity){
    super(shape,flavor,quantity);	
    } 
    
    //parameterized constructor
    public OrderedCake(String shape,String flavor,int quantity,String message){
    super(shape,flavor,quantity);
    this.message=message;
}
    // toString method
 
 public String toString() {
   if (message != null) {
    double totalPrice = getQuantity() * price;
     return "A " + getShape() + " " + getFlavor() + " Cake of " +getQuantity() + "KG is Ready with " + message +" message @ Rs." +
      totalPrice;
    } 
   else {
            return super.toString();
        }
    }
 
 
 
  }

  
public class CakeOrder{
  public static void main (String[]args) {
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter Shape (press Enter to skip): ");
      String shape = sc.nextLine();

      OrderedCake cake;

      if (shape.isEmpty()) {
          // No input → default cake
          cake = new OrderedCake();
      } else {
          System.out.print("Enter Flavor: ");
          String flavor = sc.nextLine();

          System.out.print("Enter Quantity: ");
          int quantity = sc.nextInt();
          sc.nextLine();

          System.out.print("Enter Message (optional): ");
          String message = sc.nextLine();

          if (message.isEmpty()) {
              cake = new OrderedCake(shape, flavor, quantity);
          } else {
              cake = new OrderedCake(shape, flavor, quantity, message);
          }
      }

      System.out.println(cake);

      sc.close();
  }	
}