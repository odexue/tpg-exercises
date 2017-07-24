package com.exercises.studentsort;

import java.util.Collections;
import java.util.List;

public class StudentSortServiceImpl implements StudentSortService {

	@Override
	public List<Student> sort(List<Student> studentList) {
		Collections.sort(studentList, Collections.reverseOrder(new StudentComparator()) );
		return studentList;
	}
	

}















