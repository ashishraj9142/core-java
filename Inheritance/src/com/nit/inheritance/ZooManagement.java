package com.nit.inheritance;
class Animal1{
	private String name;

	public Animal1(String name) {
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

class Mammal1 extends Animal{
	private boolean  hasFur;


	public Mammal1(boolean hasFur) {
		super();
		this.hasFur = hasFur;
	}

	public boolean isHasFur() {
		return hasFur;
	}

	public void setHasFur(boolean hasFur) {
		this.hasFur = hasFur;
	}
	
}
class Dog1 extends Mammal1{
	private String breed;


	public Dog1(String name, boolean hasFur, String breed) {
		super(hasFur);
		this.breed = breed;
	}

	public String getName_breed() {
		return breed;
	}

	public void setName_breed(String name_breed) {
		this.breed = name_breed;
	}

	@Override
	public String toString() {
		return "Dog1 [breed=" + breed + ", getName_breed()=" + getName_breed() + ", isHasFur()=" + isHasFur()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}


	}

public class ZooManagement {

	public static void main(String[] args) {
		Dog1 dog = new Dog1("Tommy",true,"Bulldog");
        System.out.println(dog);
	}

}
