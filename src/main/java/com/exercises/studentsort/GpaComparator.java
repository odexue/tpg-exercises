package com.exercises.studentsort;

import java.util.Comparator;

public class GpaComparator implements Comparator<Student>{

	//left side is bigger yields positive
	//otherwise, yields nega
	//equal yields zero
	@Override
	public int compare(Student o1, Student o2) {
		return o1.getGpa().compareTo(o2.getGpa());
	}

}
