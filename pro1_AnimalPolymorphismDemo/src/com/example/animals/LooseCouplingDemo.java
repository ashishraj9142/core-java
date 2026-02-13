package com.example.animals;

import java.util.Scanner;

class Animal{
	public void sleep() {
		System.out.println("Generic Animal is Sleeping");
	}
}
class Dog extends Animal {
  @Override
  public void sleep() {
	  System.out.println("Dog Animal is Sleeping");
  }
}
class Lion extends Animal  {
	@Override
	public void sleep() {
		System.out.println("Lion Animal is Sleeping");
	}
}
public class LooseCouplingDemo {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the animal type (dog/lion): ");
    String input = sc.nextLine().trim().toLowerCase();
    Animal animal;

    switch (input) {
        case "dog":
            animal = new Dog();
            break;
        case "lion":
            animal = new Lion();
            break;
        default:
            System.out.println("Unknown animal type, using generic Animal.");
            animal = new Animal();
    }
    checkAnimalBehaviour(animal);

    sc.close();
	}
	public static void checkAnimalBehaviour(Animal animal) {
	animal.sleep();		
	}
}
