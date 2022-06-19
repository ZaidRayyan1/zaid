package University;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class HtmlPrinter extends DataPrinter {

	@Override
	protected String start() {
		
		return "<html> <head> <title> Student Data </title></head><body>";
	}

	@Override
	protected String printHeader(Student student) {
		LocalDateTime currentDate = LocalDateTime.now();
		return "<h2>Student Data: </h2>" +"<br>" + "<h4>Student Name: </h4>" + "      " +student.getName()+ "<br>" + "<h4>Student ID: </h4>" + "      " + student.getId()+ "<br>" + "<h4>School Name: </h4>" + "      " + student.getSchool().getName() + "<br>" + "<h4>Student Program: </h4>"+"      "+student.getProgram().getName() + "<br>" + "<h4>Current Date: </h4>" +"      " + currentDate + "<br><br>";
	}

	@Override
	protected String printContent(Student student) {
		StringBuilder builder = new StringBuilder("<h2>Courses ---><h2> <br> <ol>");
		for(int i = 0; i<student.getCourses().size(); i++) {
			builder.append("<li>");
			builder.append("<h4>Course ID: </h4>"+student.getCourses().get(i).getId());
			builder.append("      ");
			builder.append("<h4>Course Name: </h4>"+student.getCourses().get(i).getName());
			builder.append("      ");
			builder.append("<h4>Course Credit Hours: </h4>"+student.getCourses().get(i).getCreditHours());
			builder.append("      ");
			double sum =student.calculateGPA(student); 
			builder.append("<h3>Your Final Grade: <h3>" + sum + "/" + student.calculateGPA(student));
			builder.append("</li> <br><br>");
			
		}
		builder.append("</ol> <br>");
		return builder.toString();
	}

	@Override
	protected String printFooter(Student student) {
		int hoursNum = 0;
		for(int i = 0; i < student.getCourses().size(); i++) {
			hoursNum += student.getCourses().get(i).getCreditHours();
		}
		return "<h3>Your Toatal Credit Hours: </h3>" + hoursNum;
	}

	@Override
	protected String end() {
		
		return "</body></html>";
	}

}
