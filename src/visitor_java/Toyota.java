package visitor_java;

public class Toyota implements ICar {

	@Override
	public String Honk() {
		System.out.println("A Toyota honks!");
		return "A Toyota honks!";
	}

	@Override
	public void accept(CarVisitor visitor) {
		visitor.visit(this);
	}
	
}