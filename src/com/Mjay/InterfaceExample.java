package com.Mjay;
interface bike1{
	void run();
	
}
class bus implements bike1{
	public void run() {
		System.out.println("hello runing");
	}
	
}
public class InterfaceExample{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bike1 b= new bus();
		b.run();

	}

}
