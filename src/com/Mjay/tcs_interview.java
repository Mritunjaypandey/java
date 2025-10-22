package com.Mjay;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

//Q1-write a stream program to get employee names whose age is greater than 26.
//Q2- write a stream program to group employees based on their department and count ..
//Q3-write a stream program to convert employee names to upper case.
//Q4-write a stream program to find the highest salary among all employees..

//Q5-write a stream program to get employees with more than 5 years of experience.

/*class employee123{
	
	String name;
	int age;
	
	
	@Override
	public String toString() {
		return "employee [name=" + name + ", age=" + age + "]";
	}
	public employee123(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}


}
*/

class employee12{
	String name;
	String departmanet;
	int sal;
	int exp;
	
	public employee12(String name, String departmanet, int sal, int exp) {
		super();
		this.name = name;
		this.departmanet = departmanet;
		this.sal = sal;
		this.exp = exp;
	}



	public int getExp() {
		return exp;
	}



	public void setExp(int exp) {
		this.exp = exp;
	}

	@Override
	public String toString() {
		return "employee [name=" + name + ", departmanet=" + departmanet + ", sal=" + sal + ", exp=" + exp + "]";
	}



	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartmanet() {
		return departmanet;
	}
	public void setDepartmanet(String departmanet) {
		this.departmanet = departmanet;
	}
}

class tcs_interview{
	

public static void main(String [] args) {
	
	/*List<employee123> li= new ArrayList<>();
	
	li.add(new employee123("mritunjay",26));
	li.add(new employee123("vijay",25));
	li.add(new employee123("ajay",29));
	li.add(new employee123("sushil",28));
	
	List<String> lii=li.stream().
			
			filter(x->x.getAge()>26).map(employee123::getName).collect(Collectors.toList());
	lii.forEach(x->System.out.println(x));
	
	*/
	
List<employee12> li= new ArrayList<>();
	
	li.add(new employee12("mritunjay","IT",5000,5));
	li.add(new employee12("vijay","IT",10000,6));
	li.add(new employee12("ajay","CSE",500000,7));
	li.add(new employee12("sushil","IT",2000,3));
	li.add(new employee12("surya","IT",10000,6));
	li.add(new employee12("pawan","CSE",50000,4));
	li.add(new employee12("rahul","IT",200,6));
	
	//List<String>lii=li.stream().map(s->s+"").filter(x->x.contains("IT")).collect(Collectors.toList());
	//lii.forEach(x->System.out.println(x));
	//Map<String,Long> lii=li.stream().collect(Collectors.groupingBy(employee::getDepartmanet,Collectors.counting()));
					
	//lii.forEach((d,count)->System.out.println(d +":"+count +" employee"));
	
	
	//Map<String,Long> lii= li.stream().collect(Collectors.groupingBy(employee12::getDepartmanet,Collectors.counting()));
	//lii.forEach((d,c)->System.out.println(d+":"+c+"employee"));
	
/*List<String> emp=Arrays.asList("mritunjay","vjay");
List<String>em=emp.stream().map(String::toUpperCase).collect(Collectors.toList());
System.out.println(em);
*/
//Optional<employee>lii=li.stream().collect(Collectors.maxBy(Comparator.comparing(employee::getSal)));

//System.out.println("max"+(lii.isPresent()?lii.get():"noy available"));
	
	//Optional<employee12> li1=li.stream().collect(Collectors.maxBy(Comparator.comparing(employee12::getSal)));
	//System.out.println("max"+(li1.isPresent()?li1.get():"not available"));
	
	//List<employee12>list1= li.stream().filter(x->x.getExp()>5).collect(Collectors.toList());
	//System.out.println(list1);
//	list1.forEach(x->System.out.println(x));

	
	

	

	
	
	
}


}

	

	

	


