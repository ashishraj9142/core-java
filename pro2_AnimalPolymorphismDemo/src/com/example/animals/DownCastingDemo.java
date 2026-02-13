package com.example.animals;
class Animal {
	public void sleep() {
		System.out.println("Generic Animal is Sleeping");
	}
}
class Dog extends Animal{
	@Override
	public void sleep() {
		System.out.println("Dog Animal is Sleeping");
	}
	public void bark() {
		System.out.println("Dog is Barking");
	}
}
class Lion extends Animal {
	@Override
	public void sleep() {
	System.out.println("Lion is a Sleeping");
	}
	public void roar() {
		System.out.println("Lion is Roaring");
	}
}

public class DownCastingDemo {

	public static void main(String[] args) {
		Animal animal = new Dog();
		checkAnimalBehaviour(animal);
		System.out.println("-------------");
       animal = new Lion();
       checkAnimalBehaviour(animal);
	}
public static void checkAnimalBehaviour(Animal animal) {
	if(animal instanceof Dog) {
		Dog dog = (Dog) animal;
		dog.sleep();
		dog.bark();
	}
	else if (animal instanceof Lion lion) {
		lion.sleep();
		lion.roar();
	   }
    }	
}
