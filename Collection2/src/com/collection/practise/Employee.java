package com.collection.practise;


import java.util.Objects;

public class Employee {
	private int id; 
	
	private String empName;
//	private Enum gender
//	{
//		Male Female;
//	}
	private String gender;	
		
	public Employee(int id, String empName, String gender) {
	super();
	this.id = id;
	this.empName = empName;
	this.gender = gender;
}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", empName=" + empName + ", gender=" + gender + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(empName, gender, id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(empName, other.empName) && Objects.equals(gender, other.gender) && id == other.id;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
				
	

}
