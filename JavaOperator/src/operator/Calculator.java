package operator;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		/*
		 * order 
		 * 스캐너로 두 값을 입력받아서
		 * 사칙연산 결과가 나오도록 하시오.
		 * 20 + 7 = 27
		 * 20 * 7 = 140
		 * */
		
		// 연산에 쓸 재료들을 준비하는 선언부
		Scanner scanner = new Scanner(System.in);
		int x=0,y=0; // 지역변수는 디폴트값을 초기화
		// 연산부
		System.out.println("x 값 입력 :");
		x = scanner.nextInt(); // next 커서 다음 글자(숫자)를 변수 할당하라
		System.out.println("y 값 입력 :");
		y = scanner.nextInt();
		// 출력영역
		System.out.println(x+" + "+y+" = "+(x+y));
		System.out.println(x+" + "+y+" = "+(x-y));
		System.out.println(x+" + "+y+" = "+(x*y));
		System.out.println(x+" + "+y+" = "+(x/y));
		System.out.println(x+" + "+y+" = "+(x%y));
		
		
		
	}
}
