package University;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Vector;

public class Instructor {
	private int id;
	private String name;
	private School school;
	private double salary;
	
	Exam exam;
	int weight = 100;
	public Instructor(int id, String name, School school, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.school = school;
		this.salary = salary;
	}
	Scanner input = new Scanner(System.in);
	
	public void addExamsWeight(Course course){
		
		
		System.out.printf("Mid Exam weight (Available weight(%d)) : ", weight);
		int midWeight = input.nextInt();
		weight -= midWeight;
		
		System.out.printf("Final Exam weight (Available weight(%d)) : ", weight);
		int finalWeight = input.nextInt();
		weight -= finalWeight;
			exam = new ExamBuilder().withMidExam(midWeight).withFinalExam1(finalWeight).build();	
			
			course.examWeights = exam.getWeights();
	
	}
	// Take a look at it.
	public void addExamsWeight(int examW1, int examW2, int examW3){
			
			exam = new ExamBuilder().withExam1(examW1).withExam2(examW2).withExam3(examW3).build();		
	}
	
	public void giveGrade(Course course, Student student) {

		for(int i = 0; i < course.examWeights.size(); i++) {
			System.out.printf("Enter Mark %d : ", i);
			double grade = input.nextDouble();
			student.getCourseGrade().add(i, grade);;
		}
		student.setGrades(student.getCourseGrade());
	}
	
	public void calculateGPA(Student student) {
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
	}
	
	
	
}
