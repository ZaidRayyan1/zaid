package University;

public interface GradeHandler {
	void setNextGradeHandler(GradeHandler gradeHandler);
	void handleGrade(Grade grade);
	
}
