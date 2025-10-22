package com.Mjay;

public class Instance_initializer {
	int speed;
	

	public Instance_initializer( ){
		System.out.println("speed"+speed);
	}
	{
		speed=100;
		System.out.println("hello");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instance_initializer ins= new Instance_initializer();
		Instance_initializer ins1= new Instance_initializer();

	}

}
