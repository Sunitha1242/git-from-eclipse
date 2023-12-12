package com.cg.business;

public class PermenentEmployee extends Employee{
	private float pf;
	private float hra;
	public PermenentEmployee(int empId, String empName, int empAge, float basic, float pf, float hra) {
		super(empId, empName, empAge, basic);
		this.pf = pf;
		this.hra = hra;
	}
	public void calculateNetSalary(){
		//logic to calculate net salary
		netSalary=(basic+hra)-pf;
	}
	public void display() {
System.out.println("EmpID=" + empId  +"EmpName=" + empName);		
	}
	
	

}
