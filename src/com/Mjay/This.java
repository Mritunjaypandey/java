package com.Mjay;

public class This {
	 int id;
	String Name;
	 int age;
	 
	 This(int id,String name,int age) {
		this.id=id;
		this.Name=name;
		this.age=age;
		System.out.println("Id :"+id+" Name :"+" age "+age);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		This abc= new This(1,"Mritunjay",25);
		//abc.name(1,"mritunjay",20);

	}

}
