package visitor_java;

class Honda implements ICar {
	
	@Override
	public void Honk() {
		System.out.println("An honda honks!");
	}
	
	@Override
	public void accept(CarVisitor visitor) {
		visitor.visit(this);
	}
}