package com.Mjay;

class emp11{
	int id;
	String name;
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
	public emp11(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public emp11() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
class stu{
	String Vill;
	emp11 e;
	public String getVill() {
		return Vill;
	}
	public void setVill(String vill) {
		Vill = vill;
	}
	public emp11 getE() {
		return e;
	}
	public void setE(emp11 e) {
		this.e = e;
	}
	stu(String Vill,emp11 e){
		this.Vill=Vill;
		this.e=e;
	}
	@Override
	public String toString() {
		return "stu [Vill=" + Vill + ", e=" + e + "]";
	}
	
	void show() {
		System.out.println("id"+e.id+"name"+e.name+"village"+Vill);
	}
	
}
public class practise_1 {
	 

	public static void main(String[] args) {
		
		emp11 s= new emp11(1,"mritunjay");
		stu s1= new stu("kursa",s);
		s1.show();
		
		
		
		
	
		
	}
	
}
