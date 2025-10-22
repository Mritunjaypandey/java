package com.Mjay;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Java8occuring {
	public static void main(String [] args) {
		//Find Occurence
		String input="ilovejava";
		String [] str=input.split("");
		System.out.println(Arrays.toString(str));
		//Map<String,List<String>> map= Arrays.stream(str).collect(Collectors.groupingBy(s->s));
		//System.out.println(map);
		
		
		/*String input="ilovejava";
		String [] str=input.split(""); 
		//System.out.println(Arrays.toString(str));
		Map<String,Long>map=Arrays.stream(str).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(map);
		*/
		
		//Find duplicate
		//String in="Mritunjaya";
		//String [] arg= in.split("");
		//String input="ilovejava";
		//String [] str=input.split("");
		//System.out.println(Arrays.toString(arg));
		//List<String> duplicate=Arrays.stream(arg).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		//.entrySet().stream()
		//.filter(x->x.getValue()>1)
		//.map(Map.Entry::getKey)
		//.collect(Collectors.toList());
		//System.out.println(duplicate);
		
		//Find unique
		//String in="Mritunjaya";
		//String [] arg= in.split("");
		//List<String>unique1=Arrays.stream(arg).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		//					.entrySet().stream()
		//					.filter(x->x.getValue()==1)
		//					.map(Map.Entry::getKey)
		//					.collect(Collectors.toList());
		//System.out.println(unique1);
		
		//first non repeating
		//String in="ilovejavaTechie";
		//String [] arg= in.split("");
		// String nonrepeat= Arrays.stream(arg).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
		//		                .entrySet().stream()
		//		                .filter(x->x.getValue()==1)
		//		                .findFirst().get().getKey();
		//		                
		//System.out.println(nonrepeat);
		// Second Largest number
		//int [] arr= {5,9,11,2,8,21,1};
		//Integer secondHighest=Arrays.stream(arr).boxed()
		//.sorted(Comparator.reverseOrder())
		//.skip(1)
		//.findFirst().get();
		//System.out.println(secondHighest);
		
		//Find longest string
		
		//String [] strarray= {"java","techie","springbbot","Microservices"};
		//String str=Arrays.stream(strarray)
		//		.reduce((word1,word2) -> word1.length() >word2.length()? word1:word2)
		//						.get();
		//.System.out.println(str);
		// strat with 1 in array
		//int [] arr= {5,9,11,2,8,21,1};
		//List<String>stringlist=Arrays.stream(arr)
				//.boxed()
				//.map(s->s+"")
				//.filter(s ->s.startsWith("1"))
				//.collect(Collectors.toList());
		//System.out.println(stringlist);
		
		// String.join
		
		//List<String>interger=Arrays.asList("1","2","3","4");
		//String result=String.join("-",interger);
		//System.out.println(result);
	   
		
		//Skip and limit method use case based example
		
		//IntStream.rangeClosed(1,10).skip(1).limit(8).forEach(System.out::println);
		//IntStream.rangeClosed(1,10).skip(1).limit(8).forEach(s->System.out.println(s));
		/*int [] arr= {5,9,11,2,8,21,1};
		Integer second=Arrays.stream(arr).boxed()
				.sorted()
				.skip(1)
				.findFirst().get();
		System.out.println(second);
		*/
		
	
								
		
	
		
	}

}
