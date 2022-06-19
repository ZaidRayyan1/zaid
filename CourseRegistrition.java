package University;

import java.util.Scanner;

public class CourseRegistrition {
	
	public void register(Student student, Course course) {
		student.getCourses().add(course);
		System.out.println("Course Added Successfully");
	}
}
