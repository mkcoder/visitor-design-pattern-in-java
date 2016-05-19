package visitor_java;

public class BankAccount implements IAsset {
	private int amount;
	
	public BankAccount() {
		
	}
	
	public BankAccount(int amount) {
		this.amount = amount;
	}
	
	@Override
	public void Accepts(IVisitor visitor) {
		visitor.Visit(this);
	}
	
	public int getAmount() {
		return amount;
	}
	
	public void setAmount(int amount) {
		this.amount += amount;
	}
	
	public void removeAmount(int amount) {
		this.amount -= (amount <= this.amount ? amount : 0);
	}

	@Override
	public String toString() {
		return "BankAccount [amount=" + amount + "]";
	}
	
}
