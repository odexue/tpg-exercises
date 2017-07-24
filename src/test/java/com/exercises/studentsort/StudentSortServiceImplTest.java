package com.exercises.studentsort;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class StudentSortServiceImplTest {

	private StudentSortServiceImpl studentSortServiceImpl;
	
	@Before
	public void setup() {
		studentSortServiceImpl = new StudentSortServiceImpl();
	}
	
	@Test
	public void sortTest() {
		List<Student> sortedStudent = studentSortServiceImpl.sort(dummyStudents());
		for(Student student : sortedStudent) {
			System.out.println(student);
		}
		assertTrue(sortedStudent.get(0).getFirstname().equalsIgnoreCase("Louis"));
		assertTrue(sortedStudent.get(sortedStudent.size()-1).getFirstname().equalsIgnoreCase("Tina"));
	}
	
	private List<Student> dummyStudents() {
		Student stud = null;
		List<Student> studList = new ArrayList<>();
		stud = new Student(33, "Tina", 3.68);
		studList.add(stud);
		stud = new Student(22, "Lorry", 3.76);
		studList.add(stud);
		stud = new Student(56, "Samar", 3.75);
		studList.add(stud);
		stud = new Student(85, "Louis", 3.85);
		studList.add(stud);
		stud = new Student(19, "Samar", 3.75);
		studList.add(stud);
		stud = new Student(24, "Lorry", 3.76);
		studList.add(stud);
		stud = new Student(89, "Ginger", 3.76);
		studList.add(stud);
		return studList;
	}

}
