package University;


public class FeesPayment { 
	public boolean pay(Student student, int amount) {
		if(amount < student.calculateFees(student)) {
			return false;
		}
		
	return true;
		
	}
}