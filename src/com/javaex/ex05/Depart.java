package com.javaex.ex05;

public class Depart extends Employee {

	private String department;

	

	
	//생성자
	public Depart(String department) {
		super();
		this.department = department;
	}
	
	

	public Depart(String name, int salary, String department) {
		super(name, salary);
		this.department = department;
	}
	
	
	//메소드 g/s
	
	

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	
	
	
	//메소드 일반
	
	public void showInformation() {
		System.out.println("이름:"+getName()+"  "+"연봉:"+getSalary()+"  "+"부서"+department);
	}
}
