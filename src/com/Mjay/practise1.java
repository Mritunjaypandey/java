package com.Mjay;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Student{
	
	private int id;
	private String name;
	private int age;
	private Double sal;
	private String city;
	private String gender;
	private String dept;
	private int yearofjoining;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Double getSal() {
		return sal;
	}
	public void setSal(Double sal) {
		this.sal = sal;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getYearofjoining() {
		return yearofjoining;
	}
	public void setYearofjoining(int yearofjoining) {
		this.yearofjoining = yearofjoining;
	}
	public Student(int id, String name, int age, Double sal, String city, String gender, String dept,
			int yearofjoining) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.sal = sal;
		this.city = city;
		this.gender = gender;
		this.dept = dept;
		this.yearofjoining = yearofjoining;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", sal=" + sal + ", city=" + city + ", gender="
				+ gender + ", dept=" + dept + ", yearofjoining=" + yearofjoining + "]";
	}
	
	
	
	
	
	

}
public class practise1 {

	public static void main(String[] args) {
		List<Student>stu= new ArrayList<>();
		stu.add(new Student(1,"mritunjay",28,45000.00,"noida","male","it",2020));
		stu.add(new Student(2,"vijay",25,40000.00,"bihar","male","cse",2022));
		stu.add(new Student(3,"surya",30,55000.00,"bihar","male","cse",2024));
		stu.add(new Student(4,"Sushil",35,35000.00,"delhi","male","it",2023));
		stu.add(new Student(5,"taaj",26,65000.00,"sasaram","male","ece",2025));
		stu.add(new Student(6,"Gautam",36,60000.00,"patna","male","ece",2022));
		stu.add(new Student(7,"Jagriti",29,25000.00,"banglore","female","it",2020));
		stu.add(new Student(8,"khusi",24,65000.00,"noida","female","cse",2023));
		stu.add(new Student(9,"pinki",31,45000.00,"noida","female","it",2022));

		//Question 6: Finding Maximum Age of Employee
		
		Optional<Student> op= stu.stream().max(Comparator.comparingInt(Student::getAge));
		System.out.println(op.isPresent()?op.get():"not available");
		
	
	
	
	}
	}


