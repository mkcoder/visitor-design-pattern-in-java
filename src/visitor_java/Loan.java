package visitor_java;

class Loan implements IAsset {
	private int loanAmount;
	
	@Override
	public void Accepts(IVisitor visitor) { 
		visitor.Visit(this);
	}

	public int getLoanAmount() {
		return loanAmount;
	}

	public Loan setLoanAmount(int loanAmount) {
		this.loanAmount = loanAmount;
		return this;
	}

	@Override
	public String toString() {
		return "Loan [loanAmount=" + loanAmount + "]";
	}
	
	
	
}