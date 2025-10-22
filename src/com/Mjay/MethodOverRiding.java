package com.Mjay;

class vahicle{
	void run() {
		System.out.println("Vehicle running");
	}
}
class bike extends vahicle{
	void run() {
		super.run();
		System.out.println("Bike running");
	}
}
public class MethodOverRiding {

	public static void main(String[] args) {
		bike b= new bike();
		b.run();

	}

}
