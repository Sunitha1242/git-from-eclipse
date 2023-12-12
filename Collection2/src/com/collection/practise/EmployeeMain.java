package com.collection.practise;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1=new Employee(1,"ABC","Male");
		Employee emp2=new Employee(1,"ABC","Male");
		Employee emp3=new Employee(3,"XYZ","Female");
		Set<Employee> empset=new HashSet<>();
		empset.add(emp1);
		empset.add(emp2);
		empset.add(emp3);
	
		//System.out.println(emp1==emp2);
		
		
		//System.out.println(emp1.equals(emp2));
		
		
		for(Employee s:empset)
		{
		//	System.out.println(s.toString());
//			System.out.println("Employee name::" +s.getEmpName());
//			System.out.println("Employee id::" +s.getId());
		}
		
		Map<String, Employee> mapemp=new HashMap<>();
		mapemp.put("xyz", emp2);
		mapemp.put("xyz", emp3);
		System.out.println(mapemp.values());
		
		

	}

}
