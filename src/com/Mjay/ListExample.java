package com.Mjay;

import java.util.HashMap;
import java.util.Map;

public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*List<String> li= new ArrayList<String>();
		li.add("MritunjayPandey");
		li.add("Vijay Pandey");
		li.add("Vijay pandey");
		li.add("Rameshankar pandey");
		Iterator <String> itr= li.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		*/
	Map<Integer,String> map= new HashMap<>();
	map.put(1, "Mritunjay");
	map.put(2,"Vijay");
	map.put(3,"Vijay");
	
	map.forEach((i,s)-> System.out.println(i + ":"+ s));

	}

}
