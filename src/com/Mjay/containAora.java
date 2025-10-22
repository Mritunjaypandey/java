package com.Mjay;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class containAora  {
	
	public static void main(String[] args) {
		
		//write a program to find the top 5 longest strings in a list which contain 'a' or 'A'
		String []  str= {"abhay","Surya","abhaykumari","abcabc","bcdbcdf","abcdabcd","abcdefgabcde"};
		
		List<String> s= Arrays.stream(str).filter(x->x.toLowerCase().contains("a")).sorted(Comparator.comparingInt(String::length).reversed())
				.limit(5).collect(Collectors.toList());
		System.out.println(s);
		
		 
}
	
		
		
	
	
}
