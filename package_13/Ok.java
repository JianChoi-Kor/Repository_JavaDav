package package_13;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Ok {

	public static void main(String[] args) {
		
		
		// 정답
		int[] answers = new int[15];
		for(int i=0; i<answers.length; i++) {
			answers[i] = (int)(Math.random()*5)+1;
		}
		
		
		int count = 0;
		
		// 1번 수포자
		int[] student1 = {1, 2, 3, 4, 5};
		int[] answer1 = new int[answers.length];
		int correctanswer1 = 0;
		
		while(count < answer1.length) {
			answer1[count] = student1[count%student1.length];
			count++;
		}
		count = 0;   // count값 초기화
		
		
		// 2번 수포자
		int[] student2 = {2, 1, 2, 3, 2, 4, 2, 5};
		int[] answer2 = new int[answers.length];
		int correctanswer2 = 0;
				
		while(count < answer2.length) {
			answer2[count] = student2[count%student2.length];
			count++;
		}
		count = 0;   // count값 초기화
		
		
		// 3번 수포자
		int[] student3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
		int[] answer3 = new int[answers.length];
		int correctanswer3 = 0;
				
		while(count < answer3.length) {
			answer3[count] = student3[count%student3.length];
			count++;
		}
		
		
		for(int i=0; i<answers.length; i++) {
			if(answer1[i] == answers[i]) {
				correctanswer1++;
			}
		}
		
		for(int i=0; i<answers.length; i++) {
			if(answer2[i] == answers[i]) {
				correctanswer2++;
			}
		}
		
		for(int i=0; i<answers.length; i++) {
			if(answer3[i] == answers[i]) {
				correctanswer3++;
			}
		}
		



		System.out.println("정답은 : " + Arrays.toString(answers)+"\n");
		System.out.println("1번 학생의 답안 : " + Arrays.toString(answer1));
		System.out.println("1번 학생의 정답 개수 : " + correctanswer1 +"\n");
		System.out.println("2번 학생의 답안 : " + Arrays.toString(answer2));
		System.out.println("2번 학생의 정답 개수 : " + correctanswer2 +"\n");
		System.out.println("3번 학생의 답안 : " + Arrays.toString(answer3));
		System.out.println("3번 학생의 정답 개수 : " + correctanswer3 +"\n");

		
		int[] answer = new int[3];
		int max = answer[0];
		
		if(max < answer[1]) max = answer[1];
		if(max < answer[2]) max = answer[2];
		
		if(max == answer[0] && max == answer[1] && max == answer[2]) return new int[] {1,2,3};
		else if(max == answer[0] && max == answer[1]) return new int[] {1,2};
		else if(max == answer[0] && max == answer[2]) return new int[] {1,3};
		else if(max == answer[1] && max == answer[2]) return new int[] {2,3};
		else if(max == answer[0]) return new int[] {1};
		else if(max == answer[1]) return new int[] {2};
		else return new int[]  {3};
		

	}
		

}







