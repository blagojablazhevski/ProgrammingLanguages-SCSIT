package lec11blagoja;

import java.util.Arrays;
import java.util.List;
import java.util.*;
import java.util.stream.*;

public class Demo {
	
	static Student createStudent(String name, int indexNo, int age) {
		return new Student(name, indexNo, age);
		
	}
	
	static void printValues(Student student) {
		System.out.println("Student name: " + student.getName() + " Index Number: " + student.indexNo + " Age: " + student.getAge());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = Arrays.asList("Blagoja", "Borjan", "Matej", "Petar", "Pumpa");
		int random1 = (int) (Math.random() * 6000);

		List<Student> students = names.stream()
				.map(name -> createStudent(name,(int) (Math.random() * 6000), (int) (Math.random() * (25 - 18)) + 18)).collect(Collectors.toList());
		
		for(Student student : students) {
			printValues(student);
		}
		
		
		List<Student> studentsStartingWithP = students.stream().filter(student -> student.name.startsWith("P")).collect(Collectors.toList());

		System.out.println("\nStudents starting with P: ");
		for(Student student : studentsStartingWithP) {
			printValues(student);
		}	
	}

}
