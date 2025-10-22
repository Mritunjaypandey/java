package com.Mjay;

import java.util.ArrayList;
import java.util.List;

public class infosys_interview_ {

	
		public static List<List<Integer>> generatedsub(int [] arr){
			
			List<List<Integer>> all = new ArrayList<>();
			
			int n= arr.length;
			for(int i=0;i<n;i++) {
				for(int j=i;j<n;j++) {
					List<Integer>sub= new ArrayList<>();
					for(int k=i; k<=j;k++) {
						sub.add(arr[k]);
					}
					all.add(sub);
				}
			
				
			}
			return all;
		}

		public static void main(String[] args) {
			  int[] input = {1, 2, 3};
		        List<List<Integer>> result = generatedsub(input);
		        System.out.println(result);
	}
}

	
		
		
		
		
		
		
	

