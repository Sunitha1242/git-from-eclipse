package com.Java8.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee {
	int empNo;
	String empName;

	public Employee(int empNo, String empName) {
		super();
		this.empNo = empNo;
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "[empNo=" + empNo + ", empName=" + empName + "]";
	}

}

public class CustomizedSorting {

	public static void main(String[] args) {
		List<Employee> l = new ArrayList<Employee>();

		l.add(new Employee(100, "sunitha"));
		l.add(new Employee(101, "suni"));
		l.add(new Employee(104, "nitha"));
		l.add(new Employee(102, "unith"));
		l.add(new Employee(100, "itha"));
		System.out.println(l);
		// Collections.sort(l);
		// Collections.sort(l, (e1, e2) -> Integer.compare(e1.empNo, e2.empNo));
		Collections.sort(l, (e1, e2) -> (e1.empNo < e2.empNo) ? -1 : (e1.empNo > e2.empNo) ? 1 : 0);
		System.out.println(l);

	}

}
