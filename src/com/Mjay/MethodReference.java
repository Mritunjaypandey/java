package com.Mjay;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MethodReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> words=Arrays.asList("java","python","cyber");
		//String [] words={"java","python","cyber"};
		//List<String> upper=Arrays.stream(words).map(String::toUpperCase).collect(Collectors.toList());
		List<String> upper= words.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(upper);
		//words.forEach(word->System.out.println(word));
		words.forEach(System.out::println);
	}

}
