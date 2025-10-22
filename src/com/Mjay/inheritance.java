package com.Mjay;

class Bike2{
	public void speed() {
		System.out.println("Bike Running");
	}
}
class Honda extends Bike2{
	public void math() {
		System.out.println("Honda");
	}
}

public class inheritance {
	public static void main(String[] args) {
		Honda hd = new Honda();
		hd.math();
		hd.speed();

	}

}
