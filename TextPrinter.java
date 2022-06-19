package University;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class TextPrinter extends DataPrinter {

	@Override
	protected String start() {
		
		return "Student Data";
	}

	@Override
	protected String printHeader(Student student) {
		LocalDateTime currentDate = LocalDateTime.now();
		return "Student Data --->  \n" + "Name: " +  "\t" + student.getName()+ "\n" + "ID: " + "\t" +student.getId()+ "\n" + "School Name: " + "\t" + student.getSchool().getName() + "\n" + "Student Program: "+"\t"+student.getProgram().getName() + "\n" + "Current Date: " +"\t" + currentDate + "\n \n";
	}

	@Override
	protected String printContent(Student student) {
		StringBuilder builder = new StringBuilder("Courses ---> \n");
		for(int i = 0; i<student.getCourses().size(); i++) {
			builder.append("Course ID: "+student.getCourses().get(i).getId());
			builder.append("||\t");
			builder.append("Course Name: "+student.getCourses().get(i).getName());
			builder.append("||\t");
			builder.append("Course Credit Hours: "+student.getCourses().get(i).getCreditHours());
			builder.append("||\t");
			double sum =student.calculateGPA(student); 
			builder.append("Your Final Grade: " + sum + "/" + student.calculateGPA(student));
			builder.append("\n\n");
			
		}
		return builder.toString();
	}

	@Override
	protected String printFooter(Student student) {
		int hoursNum = 0;
		for(int i = 0; i < student.getCourses().size(); i++) {
			hoursNum += student.getCourses().get(i).getCreditHours();
		}
		return "Your Toatal Credit Hours: " + hoursNum;
	}

	@Override
	protected String end() {
		
		return " ";
	}

}
