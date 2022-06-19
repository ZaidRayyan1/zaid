package University;

public class InstructorGradeHandler implements GradeHandler {
	
	private GradeHandler gradeHandler;
	@Override
	public void setNextGradeHandler(GradeHandler gradeHandler) {
		this.gradeHandler = gradeHandler;

	}

	@Override
	public void handleGrade(Grade grade) {
		if(grade.getGrade() > 60) {
			gradeHandler.handleGrade(grade);
		}
		else {
			System.out.println("Waiting for the Instructor Approval");
		}

	}

}
