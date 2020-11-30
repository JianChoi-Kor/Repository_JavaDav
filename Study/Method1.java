package Study;

public class Method1 {

	public static void main(String[] args) {
		
		sum(10, 20);
		System.out.println();
		sum("값", 15, 25);
		sum(1, 5, "값");
	}
	
	public static void sum(int n1, int n2) {
		System.out.printf("%d + %d = %d", n1, n2, n1+n2);
	}
	
	public static void sum(String str, int n1, int n2) {
		System.out.printf("%s : %d + %d = %d\n", str, n1, n2, n1+n2);
	}
	
	public static void sum(int n1, int n2, String str) {
		System.out.printf("%s : %d + %d = %d\n", str, n1, n2, n1+n2);
	}
}





