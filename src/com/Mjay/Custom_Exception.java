package com.Mjay;

class invalidException extends Exception{
	public invalidException(String str) {
		
		super(str);
		System.out.println("hii");
		
	}
}

public class Custom_Exception {
	
	static void validate(int age) throws invalidException{
		if(age<18) {
			throw new invalidException("not valid");
		}
		else {
			System.out.println("valid");
		}
	}
		
	public static void main(String[] args) {
		try {
			validate(10);
		}
		catch(invalidException ex) {
			System.out.println("caught the exception");
			System.out.println("an exception occur"+ex);
		}
		System.out.println("rest of code");
		
		
		
	}
}
