package com.Mjay;

class EMP{
	int roll;
	String name;
	int age;
	EMP(int r,String n,int a){
		roll=r;
		name=n;
		age=a;
	System.out.println("roll : "+roll+" name :"+name+" age :"+age);
	}
}
	class College{
		String sub;
		int uni;
		EMP emp;
		College(String sub,int uni, EMP emp){
			this.sub=sub;
			this.uni=uni;
			this.emp=emp;
			System.out.println("Subject :"+sub+"university :"+uni+"emplyee"+emp.roll+emp.name+emp.age);
		}
	
	
		
	}
	

public class Agregation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EMP e= new EMP(1,"Mritunjay",20);
		College c= new College("CSe",123,e);

	}

}
