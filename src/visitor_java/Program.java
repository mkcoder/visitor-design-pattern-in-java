package visitor_java;

public class Program {

	public static void main(String[] args) {
		
		
		// Advance example of a visitor
		Person jill = new Person();
		BankAccount bankAccount = new BankAccount(100000);
		RealEstate estate = new RealEstate().setEstValue(45000).setMontlyRent(2450);
		Loan loan = new Loan().setLoanAmount(10000);
		Loan loan2 = new Loan().setLoanAmount(456000);
		jill.add(bankAccount);
		jill.add(estate);
		jill.add(loan);
		jill.add(loan2);
		System.out.println("Jill assests info: ");
		System.out.println(jill);
		IVisitor netWorthVisitor = new NetWorthVisitor();
		jill.Accepts(netWorthVisitor);
		int networth = ((NetWorthVisitor)netWorthVisitor).getNetworth();
		System.out.println("Networth: " + networth + "");
	}

}