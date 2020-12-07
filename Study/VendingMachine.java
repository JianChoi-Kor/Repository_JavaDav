package Study;

public class VendingMachine {
	
	private Can[] canArr;
	private int sum;
	
	public VendingMachine() {
		init();
	}
	
	public void init() {
		String[] nmArr = {"콜라", "사이다", "환타", "솔의눈"};
		int [] priceArr = {500, 600, 700, 800};
		
		canArr = new Can[nmArr.length];
		
		for(int i=0; i<nmArr.length-1; i++) {
			canArr[i] = new Can(nmArr[i], priceArr[i]);
		}
	}
}
