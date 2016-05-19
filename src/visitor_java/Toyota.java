package visitor_java;

class Toyota implements ICar {

	@Override
	public void Honk() {
		System.out.println("A toyota honks!");
	}

	@Override
	public void accept(CarVisitor visitor) {
		visitor.visit(this);
	}
	
}