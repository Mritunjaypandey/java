package com.Mjay;

public class Reverse {
	
	public static void main(String [] args) {
		
		String a="mkp";
		char ch;
		String res="";
		for (int i=0;i<a.length();i++) {
			ch=a.charAt(i);
			res=ch+res;
			
		}
		System.out.println(res);
		String str= "ABC";
		String str1="A"+"BC";
		System.out.println(str==str1);
		
	}

}
