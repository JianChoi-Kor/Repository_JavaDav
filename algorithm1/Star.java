package algorithm1;

public class Star {

	public static void main(String[] args) {
		
		int star = 5;
		
		String result = "";
		
		System.out.println("----- Ǯ��1 -----"+"\n");
		
		for(int i=0; i<star; i++) {
			for(int j=0; j<star; j++) {
				result += "* ";
			}
			result += "\n";
		}
		System.out.println(result);
		
		
		
		result = ""; // result �ʱ�ȭ
		
		System.out.println("\n"+"----- Ǯ��2 -----"+"\n");
		
		for(int i=0; i<star; i++) {
			for(int j=0; j<star; j++) {
				
				if(j<=i) {
					result += "_ ";
				}
				else {
					result += "* ";
				}
			}
			result += "\n";
		}
		System.out.println(result);
		
		
		
		
		result = ""; // result �ʱ�ȭ
		
		System.out.println("\n"+"----- Ǯ��3 -----"+"\n");
		
		
		char mark = '*';
		
		
		for(int i=0; i<star; i++) {
			result += mark +" ";
			System.out.println(result);
		}
	
		
		
		


	}

}
