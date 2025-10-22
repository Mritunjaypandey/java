package com.Mjay;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class listquestion {

	public static void main(String[] args) {
		List<String>name=Arrays.asList("mritunja","bipul","abc");
		List<String>name1=name.stream().sorted().collect(Collectors.toList());
		System.out.println(name1);
		/*
		LinkedList<Integer>ls=new LinkedList<>();
		ls.add(1);
		ls.add(3);
		LinkedList<Integer>ls1=new LinkedList<>();
		ls1.add(2);
		ls1.add(4);
		List<Integer> list= new LinkedList<>();
		list.addAll(ls);
		list.addAll(ls1);
		List<Integer> lii=list.stream().sorted().collect(Collectors.toList());
		System.out.println(lii);
		*/
		//int [] number= {1,3,2,5,4,7};
		//List<Integer>list=Arrays.asList(1,3,2,5,4,7);
		//List<Integer>list1=Arrays.stream(number).boxed().filter(x->x%2!=0).sorted().map(x->x*2).collect(Collectors.toList());
		//System.out.println(list1);
		//System.out.println(li);
		
	
		
		
		
		}
	
	}
	

