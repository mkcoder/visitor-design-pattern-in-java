package visitor_java;

public class Honda implements ICar {
	
	@Override
	public String Honk() {
		System.out.println("A Honda honks!");
		return "A Honda honks!";
	}
	
	@Override
	public void accept(CarVisitor visitor) {
		visitor.visit(this);
	}
}