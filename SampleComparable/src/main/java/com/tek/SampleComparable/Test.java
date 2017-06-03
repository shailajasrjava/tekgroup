package com.tek.SampleComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test 
{
	public static void main(String args[])
	{
		List<Student> al=new ArrayList<Student>();
		al.add(new Student(101, "Raj", 24));
		al.add(new Student(107, "Ajay", 23));
		al.add(new Student(121, "Ram", 32));
		al.add(new Student(127, "Ravi", 62));
		al.add(new Student(111, "Rehman", 786));
		al.add(new Student(112, "Rehman", 786));
		al.add(new Student(12, "Sai", 78));
		Collections.sort(al);
		//comment 
		//once again added
		for(Student s:al)
		{
			System.out.println(s.rollno+" "+s.name+" "+s.age);
			
		}
		System.out.println("test");
	}
	//comment hello
	//comment from eclipse




}
