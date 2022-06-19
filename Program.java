package University;

public class Program {
	
	private int id;
	private String name;
	private int creditHourFees;
	private String headOfDepartment;
	

	public Program(int id, String name, int creditHourFees, String headOfDepartment) {
		super();
		this.id = id;
		this.name = name;
		this.creditHourFees = creditHourFees;
		this.headOfDepartment = headOfDepartment;
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

	public int getCreditHourFees() {
		return creditHourFees;
	}

	public void setCreditHourFees(int creditHourFees) {
		this.creditHourFees = creditHourFees;
	}

	public String getHeadOfDepartment() {
		return headOfDepartment;
	}

	public void setHeadOfDepartment(String headOfDepartment) {
		this.headOfDepartment = headOfDepartment;
	}
	
	
	
}
