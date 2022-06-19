package University;

import java.util.ArrayList;
import java.util.List;

public class PortalCreation {
	public static PortalCreation instance = null;
	
	School IT, Eng;
	DeanGradeHandler dean;
	
	List<Program> itPrograms, engPrograms; 
	Program computerScience, dataScience, cyberSecurity, electricalEng, mechanicalEng, energyEng;
	HODGradeHandler hod;
	
	List<Course> itCourses, engCourses;
	Course security, database, website, powerSystems, automation, electricMachinery;
	
	Instructor ahmad, omar, rana, khalid, motaz, dua, dalia;
	
	Student yazan, malik, nour, karim;
	
	DataPrinter htmlPrinter, textPrinter;
	
	
	private PortalCreation() {
		
		//Schools

		Eng = new School(2, "School of Engineering Technology", "Hala Abed", engPrograms);
		//IT programs
		computerScience = new Program(1, "Computer Science", 75 , "Sameer Adel");
		dataScience = new Program(2, "Data Science", 75 , "Raneem karam");
		cyberSecurity = new Program(3, "Cyber Security", 100 , "Amal Khalid");
		//Engineering programs
		electricalEng = new Program(4, "Electrical Engineering", 80 , "Suhaib Amer");
		mechanicalEng = new Program(5, "Mechanical Engineering", 100 , "Tariq Mahmoud");
		energyEng = new Program(6, "Energy Engineering", 80 , "Nour Khalil");
		
		
		//Adding programs
		itPrograms = new ArrayList<Program>();
		itPrograms.add(computerScience);
		itPrograms.add(dataScience);
		itPrograms.add(cyberSecurity);
		IT = new School(1, "School of Computing and Informatics" , "Yazan Jamal", itPrograms);
		
		
		engPrograms = new ArrayList<Program>();
		engPrograms.add(electricalEng);
		engPrograms.add(mechanicalEng);
		engPrograms.add(energyEng);
		Eng = new School(2, "School of Engineering Technology", "Hala Abed", engPrograms);
		
		
		//IT Courses
		security = new Course(11111, "Security", 3);
		database = new Course(22222, "Database", 3);
		website = new Course(33333, "Website", 3);
		//Engineering Courses
		powerSystems = new Course(44444, "Power Systems", 4);
		automation = new Course(55555, "Automation", 3);
		electricMachinery = new Course(66666, "Electric Machinery", 4);
		
		
		//Adding Courses
		itCourses = new ArrayList<Course>();
		itCourses.add(security);
		itCourses.add(database);
		itCourses.add(website);
		
		engCourses = new ArrayList<Course>();
		engCourses.add(powerSystems);
		engCourses.add(automation);
		engCourses.add(electricMachinery);
		
		
		htmlPrinter = new HtmlPrinter();
		textPrinter = new TextPrinter();
	}
	
	public static PortalCreation getInstance() {
		if(instance == null) {
			instance = new PortalCreation();
		}
		
	return instance;
	}
	
}
