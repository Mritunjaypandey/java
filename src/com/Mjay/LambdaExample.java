 package com.Mjay;

import java.util.Arrays;
import java.util.List;

interface Draw{
	int Add(int a,int b);
}
public class LambdaExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Draw ad1=(c,d) ->(c+d);
		System.out.println(ad1.Add(10, 30));
		Draw ad=(a,b) ->{
			return (a+b);
		};
		System.out.println(ad.Add(10,20)); 
		List<Integer> list= Arrays.asList(1,5,3,9);
		list.stream().sorted().forEach(s->System.out.println(s));
		

	}

}
