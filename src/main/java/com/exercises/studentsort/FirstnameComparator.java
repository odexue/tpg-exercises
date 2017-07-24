package com.exercises.studentsort;

import java.util.Comparator;

public class FirstnameComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getFirstname().compareToIgnoreCase(o2.getFirstname());
	}

}
