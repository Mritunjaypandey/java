package com.Mjay;

interface demo{
	void show();
}

public class AnonymousClassExample{
	public static void main(String [] args) {
		
		demo d1= new demo(){
			public void show() {
				System.out.println("hello");
			}
			
		};
		d1.show();
	}
}


