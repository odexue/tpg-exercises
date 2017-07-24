package com.exercises.studentsort;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {

		int comparison = new GpaComparator().compare(o1, o2);
		if(comparison != 0) {
			return comparison;
		} else {
			comparison = new FirstnameComparator().compare(o1, o2);
			if(comparison != 0) {
				return comparison;
			} else {
				return new IdComparator().compare(o1, o2);
			}
		}
		
		
	}

}
