package University;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class ExamBuilder {
	private ArrayList<Integer> weights = new ArrayList<Integer>(5);
	
	public ExamBuilder withMidExam(int midExam) {
		this.weights.add(1, midExam);
		return this;
	}
	
	public ExamBuilder withFinalExam1(int finalExam) {
		this.weights.add(1, finalExam);
		return this;
	}
	
	public ExamBuilder withExam1(int exam1) {
		this.weights.add(0, exam1);
		return this;
	}
	
	public ExamBuilder withExam2(int exam2) {
		this.weights.add(1, exam2);
		return this;
	}
	
	public ExamBuilder withExam3(int exam3) {
		this.weights.add(1, exam3);
		return this;
	}
	
	
	
	public Exam build() {
		return new Exam(this);
	}

	
	public int getWeight1() {
		return weights.get(0);
	}
	public int getWeight2() {
		return weights.get(1);
	}
	public int getWeight3() {
		return weights.get(2);
	}
	public int getWeight4() {
		return weights.get(3);
	}
	public int getWeight5() {
		return weights.get(4);
	}

	
	
}


