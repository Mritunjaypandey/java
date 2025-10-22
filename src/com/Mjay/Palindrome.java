package com.Mjay;

public class Palindrome {
	public static void main(String [] args) {
		int sum=0,n,temp,r;
		n=123;
		temp=n;
		while(n>0) {
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(sum==temp) {
			System.out.println("number is palindrome");
			
		}
		else {
			System.out.println("number is not a plaindrome");
		}
		
		
		
	}

}
