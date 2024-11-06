package com.tnsif.dayfive.hierarchicalinheritance;

public class Employee {
	private int empId;
	private float salary;
	private String dept;
	public Employee() {
	System.out.println("Employee Class Default Constructor");
}
	public Employee(int empId, float salary, String dept) {
		this.empId = empId;
		this.salary = salary;
		this.dept = dept;
		}
		public Employee(String name, String city,int empId, float salary, String dept) {
		super();
		this.empId = empId;
		this.salary = salary;
		this.dept = dept;
		}
		@Override
		public String toString() {
			return "Employee [empId=" + empId + ", salary=" + salary + ", dept=" + dept + "]";
		}
		
}