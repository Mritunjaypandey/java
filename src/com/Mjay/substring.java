package com.Mjay;

import java.util.HashSet;

public class substring {
	
	public static int findlongest(String s) {
		int n=s.length();
		int maxlen=0;
		int left=0;
		HashSet<Character> set= new HashSet<>();
		for (int right=0;right<n;right++) {
				char current=s.charAt(right);
			while(set.contains(current)) {
				set.remove(s.charAt(left));
				left++;
				
			}
			set.add(current);
			maxlen=Math.max(maxlen, right-left+1);
		}
		return maxlen;
	}
	public static void main(String [] args) {
		String i="abcabcabc";
		int result=findlongest(i);
		System.out.println(result);
	}

}
