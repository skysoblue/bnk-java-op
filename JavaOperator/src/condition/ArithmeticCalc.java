package condition;

import java.util.Scanner;

/*
 * @ Date : 2015.07.09
 * @ Author : me
 * @ Story : 사칙연산 계산 프로그램
 * */
public class ArithmeticCalc {
	/*
	 오더 
	 - 사칙연산 계산기
	 - 덧셈, 뺄셈, 곱셈, 나눗셈(몫 : (), 나머지:())
	 - 사칙연산 기호도 입력받습니다. +. *, - ,/ 
	 - 출력결과
	 - === 심플 계산기 ===
	 - 5 X 5 = 25
	 - 5 + 5 = 10
	 - 6 ÷ 5 = 1 (1)
	 - 5 - 6 = -1
	 * */
	
	public  void calc() {
		// 선언부
		String opcode = "";
		int first=0,second=0,result=0,remain=0;
		Scanner scanner = new Scanner(System.in);
		// 연산부
		System.out.println("첫번째 수 :");
		first = scanner.nextInt();
		System.out.println("연산기호 :");
		opcode = scanner.next();
		System.out.println("두번째 수 :");
		second = scanner.nextInt();
		if (opcode.equals("+")) {
			result = first + second;
		} else if(opcode.equals("-")){
			result = first - second;
		}else if(opcode.equals("*")){
			result = first * second;
		}else if(opcode.equals("/")){
			result = first / second;
			remain = first % second;
			/*if (remain == 0) {
				
			} else {
				
			}*/
		}else{
			System.out.println("입력된 값이 올바르지 않습니다.");
		}
		
		// 출력부
		System.out.println("=== 심플 계산기 ===");
		
		System.out.println(first+"\t"+opcode+"\t"
		+second+"\t"+"="+"\t"+result+"("+remain+")");
	}
	
	
	
	
	
	
}
