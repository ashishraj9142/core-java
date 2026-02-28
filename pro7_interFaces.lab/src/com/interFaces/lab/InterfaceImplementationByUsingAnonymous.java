package com.interFaces.lab;

interface Printer{
	public abstract void print();
	
}
class PrinterDemo{
	public Printer getPrinter() {
		return new Printer() {
			@Override
			public void print() {
				System.out.println("printing...");
			}
		};
	}
}



public class InterfaceImplementationByUsingAnonymous {

	public static void main(String[] args) {
		
		PrinterDemo p1 = new PrinterDemo();
		p1.getPrinter().print();

	}

}
