package com.Mjay;

import java.util.Arrays;
import java.util.OptionalInt;

public class targetSum {

	//Given an array of integer,find two numbers that add up to a specific target sum.
		    public static void main(String[] args) {
		        int[] nums = {3, 5, 2, 8, 11};
		        int target = 10;

		        OptionalInt first = Arrays.stream(nums)
		                .filter(x -> Arrays.stream(nums).anyMatch(y -> x != y && x + y == target))
		                .findFirst();

		        if (first.isPresent()) {
		            int num1 = first.getAsInt();
		            int num2 = Arrays.stream(nums)
		                             .filter(y -> y != num1 && num1 + y == target)
		                             .findFirst()
		                             .orElseThrow(() -> new RuntimeException("No pair found"));
		            System.out.println("Numbers: " + num1 + ", " + num2);
		        } else {
		            System.out.println("No pair found");
		        }
		    }
		
		
		
		

}

