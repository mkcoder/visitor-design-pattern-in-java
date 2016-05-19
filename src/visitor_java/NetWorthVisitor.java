package visitor_java;

public class NetWorthVisitor implements IVisitor {
	private static int networth;
	@Override
	public void Visit(RealEstate realEstate) {
		networth += realEstate.getEstValue();
		networth -= realEstate.getMontlyRent();
	}

	@Override
	public void Visit(Loan loan) {
		networth -= loan.getLoanAmount();
	}

	@Override
	public void Visit(BankAccount bankAccount) {
		networth += bankAccount.getAmount();
	}

	public int getNetworth() {
		return networth;
	}
	
}
