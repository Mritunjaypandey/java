package com.Mjay;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee{
	private int id;
	private String name;
	private int age;
	private long salary;
	private String gendar;
	private String dept;
	private String city;
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
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public String getGendar() {
		return gendar;
	}
	public void setGendar(String gendar) {
		this.gendar = gendar;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getYearofjoining() {
		return yearofjoining;
	}
	public void setYearofjoining(int yearofjoining) {
		this.yearofjoining = yearofjoining;
	}
	
	public Employee(int id, String name, int age, long salary, String gendar, String dept, String city, int yearofjoining) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.gendar = gendar;
		this.dept = dept;
		this.city = city;
		this.yearofjoining = yearofjoining;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + ", gendar=" + gendar
				+ ", dept=" + dept + ", city=" + city + ", yearofjoining=" + yearofjoining + "]";
	}
	

}

public class java8_interview {

	public static void main(String[] args) {
		List<Employee>list=new ArrayList<>();
		list.add(new Employee(1,"Mritunjay",30,45000,"male","it","bihar",2020));
		list.add(new Employee(2,"Vijay",28,40000,"male","it","bihar",2022));
		list.add(new Employee(3,"Ajay",32,54000,"male","cse","bihar",2021));
		list.add(new Employee(4,"Khusi",26,30000,"female","it","up",2020));
		list.add(new Employee(5,"jagriti",25,65000,"female","cse","up",2023));
		list.add(new Employee(6,"Rahul",28,50000,"male","ece","up",2022));
		list.add(new Employee(7,"sachin",26,60000,"male","ece","up",2024));
		list.add(new Employee(8,"surya",28,6000,"male","it","up",2024));
		
		//Question 1: Grouping Employees by City.
		
		//Map<String,List<Employee>>li=list.stream().collect(Collectors.groupingBy(Employee::getCity));
		//li.forEach((x,y) ->System.out.println(x+":"+y));
		
		//Question 2: Grouping Employees by Age
		//Map<Integer,List<Employee>> li=list.stream().collect(Collectors.groupingBy(Employee::getAge));
		//li.forEach((x,y)->System.out.println(x+" :"+y));
		
		// Q3-Finding the Count of Male and Female Employees
		//Map<String,Long>li=list.stream().collect(Collectors.groupingBy(Employee::getGendar,Collectors.counting()));
		//li.forEach((x,y)->System.out.println(x+" :"+y));
		
		
		//Q4-Printing Names of All Departments
		//list.stream().map(Employee::getDept).distinct().forEach(x->System.out.println(x));
		
	//	Q5-Printing Employee Details by Age Criteria -Print employee details whose age is greater than 28
		//list.stream().filter(x->x.getAge()>28).
		//forEach(x->System.out.println(x));
		
		
		//Question 6: Finding Maximum Age of Employee
		
		//Optional<Employee> li=list.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getAge)));
		//System.out.println(li.isPresent()?li.get():"not avaliable");
		
		//q7- Printing Average Age of Male and Female Employees
		
		//Map<String,Double> map= list.stream().collect(Collectors.groupingBy(Employee::getGendar,Collectors.averagingInt(Employee::getAge)));
				
		//System.out.println(map);
		
		//Q8-Printing the Number of Employees in Each Department
		//Map<String,Long> map= list.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors.counting()));
				    
		//System.out.println(map);
		//for(Map.Entry<String,Long> em:map.entrySet()) {
		//	System.out.println(em.getKey()+" :"+em.getValue());
		//}
		//Q9--Finding the Oldest Employee
			
		
		//Optional<Employee>li=list.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getAge)));
		
		//if(li.isPresent()) {
		//	System.out.println(li.get());
		//}
		//else {
		//	System.out.println("not avaliable");
		//}
		//Q10-- Finding the Youngest Female Employee
		
		//Optional<Employee> li=list.stream().filter(x->x.getGendar()=="female").collect(Collectors.minBy(Comparator.comparing(Employee::getAge)));
			//System.out.println(li.isPresent()?li.get():"not available");
		
		//Q11--Find employees whose age is greater than 30 and less than 40
		
		//List<Employee> li= list.stream().filter(x->x.getAge()>=30 && x.getAge()<=40).collect(Collectors.toList());
		//System.out.println(li);
		
		
		//Q12--Finding Department with Highest Number of Employees
	//Map.Entry<String, Long>li=list.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors.counting()))
	//					.entrySet().stream().max(Map.Entry.comparingByValue()).get();
	//System.out.println(li);
		
		//Q13--Finding Employees from IT Department
		
		//List<Employee>li=list.stream().filter(x->x.getDept()=="it").collect(Collectors.toList());
	//li.forEach(x->System.out.println(x));
		
		//Question 14: Finding Departments with Over 3 Employees
		
		//List<Map.Entry<String,Long>>li= list.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors.counting()))
		//					.entrySet().stream().filter(x->x.getValue()>3).collect(Collectors.toList());
		
			//			System.out.println(li);		

		//Q15-Finding Distinct Department Names
		
		//list.stream().map(Employee::getDept).distinct().forEach(x->System.out.println(x));
		
		//Question 16: Finding and Sorting Employees by City
		//.stream().filter(x->x.getCity().equalsIgnoreCase("bihar")).sorted(Comparator.comparing(Employee::getName)).forEach(x->System.out.println(x));
		
	
		//Q17--Counting the Number of Employees in the Organization
		
	//	System.out.println(list.stream().count());
		
	//	Question 18: Finding Employee Count in Every Department
		//Map<String,Long> li= list.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors.counting()));
		
		//System.out.println(li);
		 //Q-19--Finding Department with the Highest Number of Employees
	
		//Map.Entry<String,Long> li= list.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors.counting()))
			//	.entrySet().stream().max(Map.Entry.comparingByValue()).get();
		//System.out.println(li);
		
	//	Question 20: Sorting Employees by Name and Age
		//Comparator<Employee>li=Comparator.comparing(Employee::getName);
		//Comparator<Employee>li1=Comparator.comparing(Employee::getAge);
		//list.stream().sorted(li.thenComparing(li1)).forEach(x->System.out.println(x));
		
		 //Question 21: Finding the Highest Experienced Employee
		//Optional<Employee>li=list.stream().sorted(Comparator.comparing(Employee::getYearofjoining)).findFirst();
		//System.out.println(li.get());
		
		//Q-22--Printing Average and Total Salary of the Organization
	//DoubleSummaryStatistics totalsal=list.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
	//System.out.println(totalsal.getAverage());
	//System.out.println(totalsal.getSum());
		
		//Question 23: Printing Average Salary of Each Department
		//Map<String,Double> li= list.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors.averagingDouble(Employee::getSalary)));
	
		//System.out.println(li);
		//Set<Map.Entry<String, Double>> entrySet = li.entrySet();
		//for (Map.Entry<String, Double> entry : entrySet) {

//		System.out.println(entry.getKey() + " : " + entry.getValue());
	//	}
		
		//Question 24: Finding the Highest Salary in the Organization
		
		//Optional<Employee> li= list.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
	//	System.out.println(li.isPresent()?li.get():"not avaliable");
		//Question 25 &26 : Finding the Second Highest Salary in the Organization and nth number
		//int n=10;
		//Optional<Employee>li=list.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(n-1).findFirst();
		//System.out.println(li.isPresent() ? li.get().getSalary():"not available");
		
		//Question 27: Finding the Highest Paid Salary in the Organization Based on Gender
		
		//Map<String,Optional<Employee>> li= list.stream()
		//.collect(Collectors.groupingBy(Employee::getGendar,Collectors.maxBy((t1,t2)->(int)(t1.getSalary()-t2.getSalary()))));
		
	//System.out.println(li);
		
	//	Question 28: Finding the Lowest Paid Salary in the Organization Based on Gender
		//Map<String,Optional<Employee>>li=list.stream().collect(Collectors.groupingBy(Employee::getGendar,Collectors.
			//	minBy((t1,t2) -> (int)(t1.getSalary() - t2.getSalary()))));
		//System.out.println(li);
		//Question 29: Sorting Employees' Salary in Ascending Order
			//list.stream().sorted(Comparator.comparing(Employee::getSalary)).forEach(x->System.out.println(x));
	
		//Question 30: Sorting Employees' Salary in Descending Order:
		//list.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).forEach(x->System.out.println(x));
		//Question 31: Finding the Highest Salary Based on Department:
	
		/*System.out.println("Highest salary dept wise:: \n" + list.stream()

		 .collect(Collectors.groupingBy(

		 Employee::getDept, 

		 Collectors.collectingAndThen(

		 Collectors.toList(),

		 li-> list.stream().max(Comparator.comparingDouble(Employee::getSalary))

		 )

		 )));
		 */
		//Question 32: Printing the List of Employee's Second Highest Record Based on Department:
		
		/*System.out.println("Highest second salary dept wise:: \n" + list.stream()

		 .collect(Collectors.groupingBy(

		 Employee::getDept,

		 Collectors.collectingAndThen(

		 Collectors.toList(),

		 l -> l.stream()

		 .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())

		 .skip(1)

		 .findFirst()

		 )

		 )));
		 */
		
		//Question 33: Sorting the Employees' Salary in Each Department in Ascending Order:
		
		/*Map<String,Stream<Employee>> li= list.stream().collect(Collectors.groupingBy(Employee::getDept,
				Collectors.collectingAndThen(Collectors.toList(),
						List ->List.stream().sorted(Comparator.comparing(Employee::getSalary)))));
		//System.out.println(li);
		li.forEach((deptName, employees) -> {

			 System.out.println(deptName);

			 System.out.println(employees.collect(Collectors.toList()));

			});
			*/
		
		//Question 34: Sorting the Employees' Salary in Each Department in Descending Order:
		
		/*Map<String,Stream<Employee>> li= list.stream().collect(Collectors.groupingBy(Employee::getDept,
				Collectors.collectingAndThen(Collectors.toList(),lis->lis.stream().
						sorted(Comparator.comparing(Employee::getSalary).reversed()))));
		li.forEach((deptName, employees) -> {

			 System.out.println(deptName);

			 System.out.println(employees.collect(Collectors.toList()));

			});
			*/

		
		
	}
}

