package visitor_java;

import java.util.ArrayList;

class Person implements IAsset {
	private ArrayList<IAsset> assets = new ArrayList<>();

	public ArrayList<IAsset> getAssets() {
		return assets;
	}

	public void add(IAsset assets) {
		this.assets.add(assets);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Person [assets={");
		for(IAsset a : assets)
			sb.append(a.toString()+", ");
		sb.append("}]");
		return sb.toString();
	}

	@Override
	public void Accepts(IVisitor visitor) {
		// TODO Auto-generated method stub
		for (IAsset asset : assets ) {
			asset.Accepts(visitor);
		}
	}
	
}