package University;

import java.util.ArrayList;
import java.util.Vector;
public class Student {
	private int id;
	private String name;
	private School school;
	private Program program;
	private ArrayList<Course> courses;
	private Vector courseGrade = new Vector();
	private Vector Grades = new Vector();
	
	public void addCourse(Course course) {
		courses.add(course);
		System.out.println("Course Added Successfully");
	}
	public void dropCourse(Course course) {
		courses.remove(course);
		System.out.println("Course Dropped Successfully");
	}
	public int calculateFees(Student student) {
		int coursesNum = courses.size();
		int creditHours = 0; 
		int creditHour;
			for(int i = 0; i<coursesNum; i++) {
				creditHour = courses.get(i).getCreditHours();
				creditHours+= creditHour;
		}
			int fees = program.getCreditHourFees() * creditHours;
			System.out.println("Your Fees: " + fees);
			return fees;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public School getSchool() {
		return school;
	}
	public void setSchool(School school) {
		this.school = school;
	}
	public Program getProgram() {
		return program;
	}
	public void setProgram(Program program) {
		this.program = program;
	}
	public ArrayList<Course> getCourses() {
		return courses;
	}
	public void setCourses(ArrayList<Course> courses) {
		this.courses = courses;
	}
	public Vector getCourseGrade() {
		return courseGrade;
	}
	public void setCourseGrade(Vector courseGrade) {
		this.courseGrade = courseGrade;
	}
	public Vector getGrades() {
		return Grades;
	}
	public void setGrades(Vector grades) {
		Grades = grades;
	}
	
	public double calculateGPA(Student student) {
		double sum = 0;
		int gradesNum = student.getCourseGrade().size();
	    for (int i = 0; i< gradesNum; i++) {
	    	double grade = (double) student.getCourseGrade().get(i);
	        sum += grade;
	    }
	    double avg = sum/gradesNum;
	    if(avg <= 100 && avg >= 90) {
	    	System.out.println("The Grade: A");
	    }
	    else if(avg < 90 && avg >= 80) {
	    	System.out.println("The Grade: B");
	    }
	    else if(avg < 80 && avg >= 70) {
	    	System.out.println("The Grade: C");
	    }
	    else if(avg < 70 && avg >= 60) {
	    	System.out.println("The Grade: D");
	    }
	    else {
	    	System.out.println("The Grade: F");
	    }
	    return sum;
	}
}
