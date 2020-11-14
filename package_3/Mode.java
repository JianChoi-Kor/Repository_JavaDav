package package_3;

import java.util.Scanner;

public class Mode {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] inputNum = new int[10];
		for(int i=0; i<10; i++) {
			inputNum[i] = scan.nextInt();
		}
		
		int[] mode = new int[10];
		
		for(int i=0; i<10; i++) {
			mode[inputNum[i]]++;
		}
		
		for(int i=1; i<mode.length; i++) {
			System.out.println(mode[i]);
		}
		
		int modeNum = 0;  // ÃÖºó¼ö
		int modeCnt = 0;  // ÃÖºó¼ö°¡ ³ª¿Â È½¼ö
		
		for(int i=1; i<10; i++) {
			if(modeCnt < mode[i])  {
				modeCnt = mode[i];
				modeNum = i;
			}
		}
		System.out.println("ÃÖºó¼ö´Â : " +modeNum+ " cnt : "+modeCnt);
	}
}


