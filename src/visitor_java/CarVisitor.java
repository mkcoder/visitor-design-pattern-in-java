package visitor_java;

public class CarVisitor {
	String output;
	void visit(ICar car) {
		output = car.Honk();
	}
	
	public String getOutput() {
		return output;
	}
}