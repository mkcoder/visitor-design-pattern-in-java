package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import visitor_java.CarVisitor;
import visitor_java.Honda;
import visitor_java.ICar;
import visitor_java.Toyota;

public class CarVisitorTest {
	// Very basic example of a visitor class
	ICar car;
	CarVisitor visitor;
	
	@Before
	public void before() {
	  visitor = new CarVisitor();
	}
	
	@Test
	public void VisitingHondaShouldReturnSomethingWithHonda() {
		car = new Honda();
		car.accept(visitor);
		String expectedString = "A Honda honks!";
		assertTrue("visiting a honk in the honda should return 'A Honda honks!'", 
				visitor.getOutput().equals(expectedString));
	}
	
	@Test
	public void VisitingAToyotaShouldReturnSomethingWithHonda() {
		car = new Toyota();
		car.accept(visitor);
		String expectedString = "A Toyota honks!";
		assertTrue("visiting a honk in the Toyota should return 'A Toyota honks!'", 
				visitor.getOutput().equals(expectedString));
	}

}
