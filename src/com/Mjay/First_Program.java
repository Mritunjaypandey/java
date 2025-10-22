package com.Mjay;

import java.util.Arrays;
import java.util.Scanner;

public class First_Program {
	/*
	public static void PrintName() {
		System.out.println("hello pandey");
	}
	*/
	public static void Sum(int a,int b) {
		int c=a+b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		/*System.out.println("hello world");
		String name="MKP and pan";
		String name1="MKPpan";
		String frnd= new String("vijay");
		System.out.println(name.length());
		System.out.println(frnd);
		//Concate
		String name2= name + "and"+ name1;
		System.out.println(name2);
		//position
		System.out.println(name.charAt(0));
		//replace
		String name3=name.replace("M", "V");
		System.out.println(name3);
		//substring
		String name4=name.substring(4,8);
		System.out.println(name4);
		
		int age= 30;
		int physics=97;
		int chemistry=95;
		int Math=98;
		int [] marks= new int[3];
		marks[0]=97;
		marks[1]=95;
		marks[2]=98;
		System.out.println(marks[0]);
		//Length
		System.out.println(marks.length);
		// sorted
		
		Arrays.sort(marks);
		System.out.println(marks[0]);
		
		// casting 
		//implicity
		double price=118.23;
		double final_price=price+18;
		System.out.println(final_price);
		
		//explicity
		int p= 118;
		int fp=p+(int)18.0;
		System.out.println(fp);
		
		//Operator
		
		int a=41;
		int b=20;
		int c=a%b;
		System.out.println(c);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name and Age");
		String name=sc.next();
		int age= sc.nextInt();
		System.out.println("name:"+name+"age:"+age);
		
		int a=41;
		int b=20;
		if(a<=50 && b<=10) {
			System.out.println("both value leass ");
		}
		else {
			System.out.println("both number is greater");
		}
		
		
		//Switch
		
		int day=1;
		switch(day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.err.println("tuesday");
			break;
			default:
				System.out.println("number not integer");
		}
		
		// while
		Scanner sc = new Scanner(System.in);
		
		int number= 0;
		do {
			System.out.println("enter number");
			number = sc.nextInt();
			System.out.print("the number ");
			System.out.println(number);
		}
		while(number>=0);
		System.out.println("the end");
			
		// break
		int i=0;
		while(true) {
			if(i==3) {
				//i=i+1;
				continue;
			}
			System.out.println(i);
			i=i+1;
			if(i>5) {
				break;
			}
			
		}
		
		// TRY AND CATCH
		int [] marks= {50,60,70};
		System.out.println(marks[2]);
		try {
			System.out.println(marks[4]);
		}
		catch(Exception exception) {
			System.out.println("not getting");
		}
		System.out.println("hii pandey");
		
		*/ 
		//method
		
		
		Sum(1,2);
		
	}
	
}	
