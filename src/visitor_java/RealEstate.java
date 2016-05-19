package visitor_java;

class RealEstate implements IAsset  {
	private int EstValue;
	private int MontlyRent;
	
	@Override
	public void Accepts(IVisitor visitor) {
		visitor.Visit(this);
	}

	public int getEstValue() {
		return EstValue;
	}

	public RealEstate setEstValue(int estValue) {
		EstValue = estValue;
		return this;
	}

	public int getMontlyRent() {
		return MontlyRent;
	}

	public RealEstate setMontlyRent(int montlyRent) {
		MontlyRent = montlyRent;
		return this;
	}

	@Override
	public String toString() {
		return "RealEstate [EstValue=" + EstValue + ", MontlyRent=" + MontlyRent + "]";
	}
	
}