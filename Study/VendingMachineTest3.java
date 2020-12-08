package Study;

public class VendingMachineTest3 {

	public static void main(String[] args) {
		
		VendingMachine vm = new VendingMachine();
		
		boolean start = vm.inputMoney();
		
		if(start == true) {	
			vm.showMenus(); // 메뉴 출력 메서드
			vm.purchase(); // 총 금액과 잔액을 계산하는 메서드
			vm.showAcount(); // 결과를 출력하는 메서드
		}
	}
}


