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
		Collections.sort(al);
		for(Student s:al)
		{
			System.out.println(s.rollno+" "+s.name+" "+s.age);
		}
	}


}
