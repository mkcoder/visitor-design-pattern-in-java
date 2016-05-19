package visitor_java;

public interface ICar {
	String Honk();
	void accept(CarVisitor visitor);
}