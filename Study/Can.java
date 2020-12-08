package Study;

public class Can {
	
	private final String nm;
	private final int price;
	private final int stock;
	
	public Can(String nm, int price, int stock) {
		this.nm = nm;
		this.price = price;
		this.stock = stock;
	}
	
	public String getName() {
		return nm;
	}
	
	public int getPrice() {
		return price;
	}
	
	public int getStock() {
		return stock;
	}
}


