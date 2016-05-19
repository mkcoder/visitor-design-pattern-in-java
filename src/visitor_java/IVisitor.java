package visitor_java;

interface IVisitor {
	void Visit(RealEstate realEstate);
	void Visit(Loan loan);
	void Visit(BankAccount bankAccount);
}