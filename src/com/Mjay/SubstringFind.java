
package com.Mjay;

import java.util.HashSet;
public class SubstringFind {
	
	    public static int lengthOfLongestSubstring(String s) {
	        int n = s.length();
	        int maxLen = 0;
	        int left = 0;
	        HashSet<Character> set = new HashSet<>();

	        for (int right = 0; right < n; right++) {
	            char currentChar = s.charAt(right);

	            while (set.contains(currentChar)) {
	                set.remove(s.charAt(left));
	                left++;
	            }

	            set.add(currentChar);
	            maxLen = Math.max(maxLen, right - left + 1);
	        }

	        return maxLen;
	    }

	    public static void main(String[] args) {
	        String input = "abcabcbb";
	        int result = lengthOfLongestSubstring(input);
	        System.out.println("Length of the longest substring without repeating characters: " + result);
	    }
	}





