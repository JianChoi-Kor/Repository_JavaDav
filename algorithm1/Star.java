package algorithm1;

public class Star {

	public static void main(String[] args) {
		
		int star = 5;
		
		String result = "";
		
		System.out.println("----- 풀이1 -----"+"\n");
		
		for(int i=0; i<star; i++) {
			for(int j=0; j<star; j++) {
				result += "* ";
			}
			result += "\n";
		}
		System.out.println(result);
		
		
		
		result = ""; // result 초기화
		
		System.out.println("\n"+"----- 풀이2 -----"+"\n");
		
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
		
		
		
		
		result = ""; // result 초기화
		
		System.out.println("\n"+"----- 풀이3 -----"+"\n");
		
		
		char mark = '*';
		
		
		for(int i=0; i<star; i++) {
			result += mark +" ";
			System.out.println(result);
		}
	
		
		
		


	}

}
