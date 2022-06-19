package University;

public class DeanGradeHandler implements GradeHandler {
	
	private GradeHandler gradeHandler;
	@Override
	public void setNextGradeHandler(GradeHandler gradeHandler) {
		this.gradeHandler = gradeHandler;

	}

	@Override
	public void handleGrade(Grade grade) {
		if(grade.getGrade() > 40) {
			gradeHandler.handleGrade(grade);
		}
		else {
			System.out.println("Waiting for the Dean Approval");
		}

	}

}
