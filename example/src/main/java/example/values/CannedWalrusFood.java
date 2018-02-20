package example.values;

public class CannedWalrusFood {

	private WalrusFood food;

	public CannedWalrusFood() {
	}

	public CannedWalrusFood(WalrusFood food) {
		this.food = food;
		int a = 1;
		if("a" == "b"){
			a = 2;
		}
			
	}

	public WalrusFood extractContents() {
		WalrusFood contents = food;
		food = null;
		return contents;
	}

}
