package com.oca.suresh.questions;
class Student{
	String name;
	public Student(String name) {
		this.name = name;
	}
}
public class Q30 {

	public static void main(String[] args) {
     Student[] students = new Student[3];
     students[0] = new Student("mani");
     //students[1] = new Student("mani");
     students[2] = new Student("base");
     for(Student s : students) {
    	 System.out.println(" "+s.name);
     }
     
	}

}
