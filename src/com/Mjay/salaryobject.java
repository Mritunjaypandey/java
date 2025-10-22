package com.Mjay;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class employ{
	int id;
	String name;
	double salary;
	public employ(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "emp [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}

public class salaryobject{

	public static void main (String [] args) {
		List<employ>em= new ArrayList<>();
		em.add(new employ(1,"mritunjay",5000));
		em.add(new employ(2,"vijay",2000));
		em.add(new employ(3,"sushil",7000));
		//em.forEach(x->System.out.println(x));
		em.sort((s1,s2) -> Double.compare(s1.getSalary(),s2.getSalary()));
		
		em.forEach(x->System.out.println(x));
	
	em.stream().sorted(Comparator.comparing(employ::getSalary)).forEach(x->System.out.println(x));
	
		//System.out.println(li);
			
	
		
			
	}
}
	