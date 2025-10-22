package com.Mjay;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int sum=0,n,temp,r;
		n=134;
		temp=n;
		while(n>0) {
			r=n%10;
			sum=sum+(r*r*r);
			n=n/10;
		}
		if(sum==temp) {
			System.out.println("number is Armstrong");
			
		}
		else {
			System.out.println("number is not a Armstrong");
		}
		
		
		
	}

}
