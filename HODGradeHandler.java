package University;

public class HODGradeHandler implements GradeHandler {
	
	private GradeHandler gradeHandler;
	@Override
	public void setNextGradeHandler(GradeHandler gradeHandler) {
		this.gradeHandler = gradeHandler;

	}

	@Override
	public void handleGrade(Grade grade) {
		if(grade.getGrade() > 50) {
			gradeHandler.handleGrade(grade);
		}
		else {
			System.out.println("Waiting for the Head of Department Approval");
		}

	}

}
