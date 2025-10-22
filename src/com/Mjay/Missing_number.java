package com.Mjay;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Missing_number {

	public static void main(String[] args) {
		int [] arr= {2,3,3,3,4,4,5,7,8,9,1};
		Set<Integer> set= Arrays.stream(arr).boxed().collect(Collectors.toSet());
		System.out.println(set);
		List<Integer> collect = IntStream.rangeClosed(1,9).filter(s->!set.contains(s)).boxed().collect(Collectors.toList());
		
		System.out.println(collect);
		
	
	}

}
