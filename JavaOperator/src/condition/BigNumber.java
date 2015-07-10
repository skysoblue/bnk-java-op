package condition;

import java.util.Scanner;

public class BigNumber {
	public static void main(String[] args) {
		/*
		 문제 ) 학생 3명의 점수를 입력받아서 1등 출력(0점 ~ 100점)
		 결과 ) 1등은 98점입니다
		 힌트 ) a 와 b 비교, b 와 c 를 비교, a 와 c 를 비교 
		 * */
		Scanner scanner = new Scanner(System.in);
		int score1=0,score2=0,score3=0,top=0;
		System.out.println("점수를 입력 :");
		score1 = scanner.nextInt();
		System.out.println("점수를 입력 :");
		score2 = scanner.nextInt();
		System.out.println("점수를 입력 :");
		score3 = scanner.nextInt();
		/*
		 조건식을 따져서 결과를 가정하지 말고,
		 결과를 상정한 다음 거기에 맞는 조건식을
		 설정하세요.
		 * */
		if (score1 > score2 && score1 > score3) {
			top = score1;
		}else if(score2 > score1 && score2 > score3){
			top = score2;
		}else if(score3 > score1 && score3 > score2){
			top = score3;
		}else{
			System.out.println("동점자가 존재합니다.");
		}
		System.out.println("1등은 "+top+"점입니다");
		
		
		
	}
}
