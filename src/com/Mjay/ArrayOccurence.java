package com.Mjay;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ArrayOccurence {

	public static void main(String[] args) {
		
		int arr[]= {10,20,35,27,20,22,10,20,35};
		Map<Integer,Long> map=Arrays.stream(arr).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	
		System.out.println(map);
		List<Integer> li=map.entrySet().stream().filter(x->x.getValue()>1).map(Map.Entry::getKey).sorted().collect(Collectors.toList());
		System.out.println(li);

	}

}
