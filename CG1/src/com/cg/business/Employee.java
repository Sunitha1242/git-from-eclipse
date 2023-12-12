package com.cg.business;

public class Employee {
	protected int empId;
	protected String empName;
	private int empAge;
	protected float basic;
	protected float netSalary;

	public Employee(int empId, String empName, int empAge, float basic) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAge = empAge;
		this.basic = basic;
		
	}
	

	public Employee() {
		super();
	}


	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getAge() {
		return empAge;
	}

	public void setAge(int empAge) {
		this.empAge = empAge;
	}

	public float getBasic() {
		return basic;
	}

	public void setBasic(float basic) {
		this.basic = basic;
	}

	public float getNetSalary() {
		return netSalary;
	}

	public void setNetSalary(float netSalary) {
		this.netSalary = netSalary;
	}
	public void calculateNetSalary(){
		//logic to calculate net salary
		netSalary=basic;
	}

}
