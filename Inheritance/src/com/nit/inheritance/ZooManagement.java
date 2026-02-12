package com.nit.inheritance;

class Animal{
	private String name;

	public Animal(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

class Mammal extends Animal{
	private boolean  hasFur;

	public Mammal(String name, boolean hasFur) {
		super(name);
		this.hasFur = hasFur;
	}

	public boolean isHasFur() {
		return hasFur;
	}

	public void setHasFur(boolean hasFur) {
		this.hasFur = hasFur;
	}
	
}
class Dog extends Mammal{
	private String breed;

	public Dog(String name, boolean hasFur, String name_breed) {
		super(name, hasFur);
		this.breed = name_breed;
	}

	public String getName_breed() {
		return breed;
	}

	public void setName_breed(String name_breed) {
		this.breed = name_breed;
	}

	@Override
    public String toString() {
        return "Dog [getName()=" + getName() +
                ", isHasFur()=" + isHasFur() +
                ", breed=" + breed + "]";
    }
	}

public class ZooManagement {

	public static void main(String[] args) {
		Dog dog = new Dog("Tommy",true,"Bulldog");
        System.out.println(dog);
	}

}
