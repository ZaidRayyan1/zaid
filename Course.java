package University;

import java.util.ArrayList;
import java.util.HashMap;

public class Course {
	
	private int id;
	private String name;
	private int creditHours;
	public ArrayList<Integer> examWeights;

	
	public Course(int id, String name, int creditHours) {
		super();
		this.id = id;
		this.name = name;
		this.creditHours = creditHours;
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

	public int getCreditHours() {
		return creditHours;
	}

	public void setCreditHours(int creditHours) {
		this.creditHours = creditHours;
	}
	
	
	
	
	
	
	
	
	
}
