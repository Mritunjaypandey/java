package com.Mjay;

public class Throw {
	public  void validate(int age) {
		if(age<18) {
			throw new ArithmeticException("not valid");
		}
		else {
			System.out.println("validate");
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//validate(13);
		Throw t1= new Throw();
		t1.validate(20);
		System.out.println("hello mjay");

	}

}
