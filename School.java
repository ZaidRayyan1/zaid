package University;

import java.util.List;

public class School {
	private int id;
	private String name;
	private String dean;
	private List<Program> programs;
	public School(){
		
	}
	public School(int id, String name, String dean, List<Program> programs) {
		super();
		this.id = id;
		this.name = name;
		this.dean = dean;
		this.programs = programs;
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
	public String getDean() {
		return dean;
	}
	public void setDean(String dean) {
		this.dean = dean;
	}
	public List<Program> getPrograms() {
		return programs;
	}
	public void setPrograms(List<Program> programs) {
		this.programs = programs;
	}
	

	
	
}
