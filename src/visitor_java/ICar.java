package visitor_java;

interface ICar {
	void Honk();
	void accept(CarVisitor visitor);
}