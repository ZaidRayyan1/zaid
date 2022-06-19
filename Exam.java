package University;

import java.util.ArrayList;

public class Exam {
	private ArrayList<Integer> weights = new ArrayList<Integer>(5);
	public Exam(ExamBuilder examBuider) {
		this.weights.add(0, examBuider.getWeight1());
		this.weights.add(1, examBuider.getWeight2());
		this.weights.add(2, examBuider.getWeight3());
		this.weights.add(3, examBuider.getWeight4());
		this.weights.add(4, examBuider.getWeight5());

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

	public ArrayList<Integer> getWeights() {
		return weights;
	}

	public void setWeights(ArrayList<Integer> weights) {
		this.weights = weights;
	}
	
	
	
}
