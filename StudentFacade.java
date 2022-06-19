package University;

public class StudentFacade {
	public void registerAndPay(Student student, Course course, int paymentAmount) {
		CourseRegistrition courseR= new CourseRegistrition();
		courseR.register(student, course);
		
		FeesPayment feesP = new FeesPayment();
		feesP.pay(student, paymentAmount);
		
		if(feesP.pay(student, paymentAmount)) {
			System.out.println("Payment Process Done Successfully");
		}
		else {
			System.out.printf("Insuffeciant Amount ( You should pay : %d )", student.calculateFees(student));
		}
	}
}
