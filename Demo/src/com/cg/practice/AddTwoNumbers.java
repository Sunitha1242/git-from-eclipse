package com.cg.practice;
import javax.swing.text.StyledEditorKit.ForegroundAction;
class A {
}
class Student {
	String name;
	int age;
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void display() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
}
public class AddTwoNumbers {
	public static void main(String[] args) {
		Student s1 = new Student("John", 20);
		Student s2 = new Student("Jane", 22);

		s1.display();
		s2.display();
	}

}
